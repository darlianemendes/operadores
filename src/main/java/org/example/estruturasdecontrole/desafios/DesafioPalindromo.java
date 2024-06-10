package org.example.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioPalindromo {

    /*
    Verificando se uma palavra ou número é um palíndromo.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou número: ");
        String entrada = scanner.nextLine();

        if (isPalindromo(entrada)) {
            System.out.println("A palavra ou número '" + entrada + "' é um palíndromo.");
        } else {
            System.out.println("A palavra ou número '" + entrada + "' não é um palíndromo.");
        }

        scanner.close();
    }

    /*
    Este método recebe uma string e verifica se ela é um palíndromo.
    Inicializamos dois índices, inicio e fim, que apontam para o início e o fim da string, respectivamente.
    Usamos um loop while para comparar os caracteres nas posições inicio e fim.
    Se os caracteres forem diferentes, retorna false, indicando que a string não é um palíndromo.
    Caso contrário, incrementa inicio e decrementa fim para continuar a comparação.
    Se o loop concluir sem encontrar caracteres diferentes, retorna true, indicando que a string é um palíndromo.
     */

    public static boolean isPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
}
