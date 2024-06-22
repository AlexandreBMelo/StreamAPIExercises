// Desafio 5 - Calcule a média dos números maiores que 5:
// Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5MediaMaioresQue5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMaioresCinco = numeros.stream()
                .filter(n -> n > 5)
                .toList();
        int tamanhoArray = numerosMaioresCinco.size();
        int valorDividir = numerosMaioresCinco.stream()
                .reduce(0, Integer::sum);
        int media = valorDividir / tamanhoArray;
        System.out.println("Alexandre: A média dos números maiores que 5 é: "+ media);

        OptionalDouble media2 = numeros.stream()
                                      .filter(n -> n > 5)
                                      .mapToInt(Integer::intValue)
                                      .average();

        // Exibindo o resultado no console
        if (media2.isPresent()) {
            System.out.println("ChatGPT: A média dos números maiores que 5 é: " + media2.getAsDouble());
        } else {
            System.out.println("ChatGPT: Não há números maiores que 5 na lista.");
        }

    }
}

