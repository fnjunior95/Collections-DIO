/*2. Carrinho de Compras:
Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve 
ser implementado como uma lista de itens.
Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade.
 Implemente os seguintes métodos:

adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, 
preço e quantidade especificados.
removerItem(String nome): Remove um item do carrinho com base no seu nome.
calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e
 a quantidade de cada item.
exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades. */

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
        private final List<Item> carrinhoItems = new ArrayList<>();
        public void adicionarItem(String nome, double preco, int quantidade){
            carrinhoItems.add(new Item(nome, preco, quantidade));
        }
        public void removerItem(String nome){
            for(int i = 0; i < carrinhoItems.size(); i++){
                if(carrinhoItems.get(i).getNome().equals(nome)){
                    carrinhoItems.remove(i);
                    break;
                }
            }
        }
        public double calcularValorTotal(){
            double total = 0;
            for(Item item : carrinhoItems){
                total += item.getPreco() * item.getQuantidade();
            }
            return total;
        }
        public void exibirItens(){
            for(Item item : carrinhoItems){
                System.out.println("Nome: " + item.getNome() + " Preço: " + item.getPreco() + " Quantidade: " + item.getQuantidade());
            }
        }

        public static void main(String[] args) {
            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionarItem("Arroz", 10.0, 2);
            carrinho.adicionarItem("Feijão", 5.0, 3);
            carrinho.adicionarItem("Macarrão", 3.0, 1);
            carrinho.exibirItens();
            System.out.println(carrinho.calcularValorTotal());
            carrinho.removerItem("Feijão");
            carrinho.exibirItens();
            System.out.println(carrinho.calcularValorTotal());
        }
}