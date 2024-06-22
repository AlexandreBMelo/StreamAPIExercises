// Desafio 2 - Imprima a soma dos números pares da lista:
// Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

package Exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio2SomaPares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Fiz desse jeito e funcionou:
        List<Integer> pares = numeros.stream() // Cria uma stream a partir da lista de números.
                .filter(n -> n % 2 == 0) // Filtra os elementos da stream, mantendo apenas aqueles cujo resto da divisão
                                         // por 2 é zero (ou seja, números pares).
                .toList(); // Armazena o resultado na lista "pares"
        int soma = pares.stream()
                .reduce(0, Integer::sum); // BinaryOperator para somar os valores armazenados em "pares"

        System.out.println("Alexandre: A soma dos números pares é: " + soma);
        // ChatGPT me deu desse jeito:
        int somaPares = numeros.stream() // Cria uma stream a partir da lista de números.
                .filter(n -> n % 2 == 0) // Filtra os elementos da stream, mantendo apenas aqueles cujo resto da divisão
                                         // por 2 é zero (ou seja, números pares).
                .mapToInt(Integer::intValue) // Converte a stream de Integer para uma stream de int.
                .sum(); // Soma os elementos da stream de int.

        // Exibindo o resultado no console
        System.out.println("ChatGPT: A soma dos números pares é: " + somaPares);
    }
}
