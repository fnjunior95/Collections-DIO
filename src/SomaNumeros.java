/*2. Soma de Números
Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. 
Implemente os seguintes métodos:

adicionarNumero(int numero): Adiciona um número à lista de números.
calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.
encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.
encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.
exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista. */

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
    private final List<Integer> numeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(int numero : numeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(int numero : numeros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }
    public List<Integer> exibirNumeros(){
        return numeros;
    }
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
    }
}