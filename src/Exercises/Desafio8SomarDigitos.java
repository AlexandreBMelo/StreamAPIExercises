// Somar os dígitos de todos os números da lista:
// Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console
package Exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio8SomarDigitos{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int soma = numeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma dos números é: " + soma);
    

    // Utilizando a Stream API para somar os dígitos de todos os números da lista
    int somaDigitos = numeros.stream()
            .mapToInt(Desafio8SomarDigitos::somaDigitos)
            .sum();

    // Exibindo o resultado no console
    System.out.println("A soma dos dígitos de todos os números da lista é: "+somaDigitos);
}


    // Método para calcular a soma dos dígitos de um número
    private static int somaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10; // Adiciona o último dígito à soma
            numero /= 10; // Remove o último dígito do número
        }
        return soma;
    }
}

