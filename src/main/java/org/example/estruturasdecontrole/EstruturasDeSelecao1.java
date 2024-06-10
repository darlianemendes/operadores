package org.example.estruturasdecontrole;

public class EstruturasDeSelecao1 {

    public static void main(String[] args) {

        /*IF-ELSE
        if (condicao) {
            // bloco de código se a condição for verdadeira
        } else {
            // bloco de código se a condição for falsa
        }
         */

        int idade = 18;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        int numero = 15;
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else if (numero % 3 == 0) {
            System.out.println("Divisível por 3");
        } else {
            System.out.println("Número ímpar e não divisível por 3");
        }


        // Verifique se um número é positivo, negativo ou zero.
        int valor = 0; // pode ser qualquer valor
        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (valor < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
