/*1. Catálogo de Livros
Crie uma classe chamada "CatalogoLivros" que possui uma lista de objetos do tipo "Livro" como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.
pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.
pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.*/

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
        private final List<Livro> catalogoLivros = new ArrayList<>();
        public void adicionarLivro(String titulo, String autor, int anoPublicacao){
            catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
        }
        public List<Livro> pesquisarPorAutor(String autor){
            List<Livro> livrosEncontrados = new ArrayList<>();
            for(Livro livro : catalogoLivros){
                if(livro.getAutor().equals(autor)){
                    livrosEncontrados.add(livro);
                }
            }
            return livrosEncontrados;
        }
        public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
            List<Livro> livrosEncontrados = new ArrayList<>();
            for(Livro livro : catalogoLivros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosEncontrados.add(livro);
                }
            }
            return livrosEncontrados;
        }
        public Livro pesquisarPorTitulo(String titulo){
            for(Livro livro : catalogoLivros){
                if(livro.getTitulo().equals(titulo)){
                    return livro;
                }
            }
            return null;
        }
        public static void main(String[] args) {
            CatalogoLivros catalogo = new CatalogoLivros();
            catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
            catalogo.adicionarLivro("O Guarani", "José de Alencar", 1857);
            catalogo.adicionarLivro("O Cortiço", "Aluísio Azevedo", 1890);
            catalogo.adicionarLivro("O Guarani", "José de Alencar", 1857);
            System.out.println(catalogo.pesquisarPorAutor("José de Alencar").toString());
            System.out.println(catalogo.pesquisarPorIntervaloAnos(1850, 1900));
            System.out.println(catalogo.pesquisarPorTitulo("Dom Casmurro"));
        }


}
