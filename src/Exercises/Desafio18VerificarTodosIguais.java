// Verifique se todos os números da lista são iguais:
// Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
package Exercises;

import java.util.Arrays;
import java.util.List;

public class Desafio18VerificarTodosIguais {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean todosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        if (todosIguais) {
            System.out.println("Todos os números são iguais");
            
        } else {
            System.out.println("Os números do conjunto não são iguais");
        }
    }
    
}
