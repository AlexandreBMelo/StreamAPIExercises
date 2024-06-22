// Filtrar os números primos da lista:
// Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
package Exercises;

import java.util.Arrays;
import java.util.List;


public class Desafio17FiltrarPrimos {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número primo utilizando a Stream API
        List<Integer> primos = numeros.stream()
                .filter(Desafio17FiltrarPrimos::Primo)  // Filtra apenas os números primos
                .distinct()
                .toList();  // Encontra o maior número na lista filtrada

        // Exibindo o resultado no console
        System.out.println(primos);
    }

    // Método para verificar se um número é primo
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        if (numero <= 3) {
            return true; // 2 e 3 são primos
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos (exceto 2 e 3)
        }
        // Verifica divisibilidade a partir de 5 até a raiz quadrada do número
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
