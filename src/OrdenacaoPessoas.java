/*1. Ordenação de Pessoas
Crie uma classe chamada "OrdenacaoPessoas" que possui uma lista de objetos do tipo "Pessoa" como atributo. 
Cada pessoa possui atributos como nome, idade e altura. Implemente os seguintes métodos:

adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.
ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.
ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoPessoas{
    private final List<Pessoa> pessoas = new ArrayList<>();
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    public void ordenarPorIdade(){
        Collections.sort(pessoas);
    }
    public void ordenarPorAltura(){
        Collections.sort(pessoas, (Pessoa pessoa1, Pessoa pessoa2) -> Double.compare(pessoa1.getAltura(), pessoa2.getAltura()));
    }
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Pedro", 30, 1.75);
        ordenacaoPessoas.ordenarPorIdade();
        System.out.println(ordenacaoPessoas.pessoas);
        ordenacaoPessoas.ordenarPorAltura();
        System.out.println(ordenacaoPessoas.pessoas);
    }
}