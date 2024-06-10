package org.example.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioEscada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da escada: ");
        int altura = scanner.nextInt();

        /*
        int i = 1; i <= altura; i++
        -> controla o número de linhas da escada. Cada iteração deste loop representa um degrau da escada.
        int j = 1; j <= i; j++
        -> controla o número de asteriscos em cada linha. Para a linha i, ele imprime i asteriscos.
         */

        /*
        System.out.print("*") imprime um asterisco sem mudar de linha.
        System.out.println() é usado para mudar para a próxima linha após imprimir todos os asteriscos de um degrau.
         */
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
