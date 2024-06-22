// Encontrar o segundo número maior da lista:
// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.


package Exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7SegundoMaiorNumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 4, 3);
        Integer segundoMaior = numeros.stream()
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .orElse(null);
                                
        if (segundoMaior != null){
            System.out.println("O segundo maior numero é: " + segundoMaior);
        }else{
            System.out.println("Não há segundo maior número na lista!");
        }

    }
}
