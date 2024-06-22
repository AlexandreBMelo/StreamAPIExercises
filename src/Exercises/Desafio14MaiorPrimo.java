// Encontre o maior número primo da lista:
// Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.


package Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14MaiorPrimo{
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número primo utilizando a Stream API
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14MaiorPrimo::ehPrimo)  // Filtra apenas os números primos
                .max(Integer::compareTo);  // Encontra o maior número na lista filtrada

        // Exibindo o resultado no console
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não foi encontrado nenhum número primo na lista.");
        }
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
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

