/*2. Ordenação de Números
Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. 
Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private final List<Integer> numeros = new ArrayList<>();
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public void ordenarAscendente(){
        Collections.sort(numeros);
    }
    public void ordenarDescendente(){
        Collections.sort(numeros, Collections.reverseOrder());
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.ordenarAscendente();
        System.out.println(ordenacaoNumeros.numeros);
        ordenacaoNumeros.ordenarDescendente();
        System.out.println(ordenacaoNumeros.numeros);
    }
}