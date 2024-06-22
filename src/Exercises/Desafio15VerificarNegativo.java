// Verifique se a lista contém pelo menos um número negativo:
// Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
package Exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio15VerificarNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean verificaNegativo = numeros.stream()
                                    .anyMatch(n -> n < 0);
        if (verificaNegativo) {
            System.out.println("Há números negativos no conjunto!");
        } else {
            System.out.println("Não há números negativos no conjunto");
        }
    }
}
