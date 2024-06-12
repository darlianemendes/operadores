package org.example.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int quantidadeDeNumeroNaSequencia = scanner.nextInt();

        // Verifica se o valor de n é válido
        if (quantidadeDeNumeroNaSequencia <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            // Gera e imprime a sequência de Fibonacci
            gerarSequenciaFibonacci(quantidadeDeNumeroNaSequencia);
        }

        scanner.close();
    }

    public static void gerarSequenciaFibonacci(int n) {
        int num1 = 0, num2 = 1;

        // Imprime os primeiros quantidadeDeNumeroNaSequencia termos
        /*
        Em cada iteração, imprime o valor de num1,
        calcula o próximo termo da sequência (sum = num1 + num2),
        e atualiza num1 e num2 para os próximos termos.
         */
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            // Atualiza os valores para o próximo termo da sequência
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }

}
