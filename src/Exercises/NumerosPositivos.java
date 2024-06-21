// Desafio 3 - Verifique se todos os números da lista são positivos:
// Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.


package Exercises;

import java.util.Arrays;
import java.util.List;

public class NumerosPositivos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // O que eu fiz: está errado!
        numeros.stream().map(n -> n>0).forEach(System.out::println);

        // O que o ChatGPT fez:
        // Usando a Stream API para verificar se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                                        .allMatch(n -> n > 0); //allMatch verifica se todos os itens dentro do Array estão de acordo com a regra de negócio.

        // Exibindo o resultado no console
        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
    
}
