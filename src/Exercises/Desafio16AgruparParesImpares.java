// Agrupe os números em pares e ímpares:
// Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16AgruparParesImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Map<Boolean, List<Integer>> agrupados = numeros.stream()
        .distinct()
                .collect(Collectors
                        .partitioningBy(n -> n % 2 == 0));

        List<Integer> numerosPares = agrupados.get(true);
        List<Integer> numerosImpares = agrupados.get(false);
        
        System.out.println("Os numeros pares são: " + numerosPares);
        System.out.println("Os numeros impares são: " + numerosImpares);
    }

}
