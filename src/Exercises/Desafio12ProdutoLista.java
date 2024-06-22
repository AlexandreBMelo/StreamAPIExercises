// Desafio 12: Encontre o produto de todos os números da lista:
// Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

package Exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio12ProdutoLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int produto = numeros.stream()
                .reduce(1, (n1, n2) -> n1 * n2); // a identity não pode ser 0, pois na multiplicação, todo número
                                                          // multiplicado por 0 é igual a 0.
        System.out.println(produto);
    }
}
