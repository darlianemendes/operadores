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

        //Aninhando
        int nota = 85;
        if (nota >= 90) {
            System.out.println("A nota é A.");
        } else if (nota >= 80) {
            System.out.println("A nota é B.");
        } else if (nota >= 70) {
            System.out.println("A nota é C.");
        } else {
            System.out.println("A nota é D ou F.");
        }

        /*
        Operadores relacionais e lógicos
        As condições no if geralmente usam operadores relacionais (==, !=, >, <, >=, <=) e lógicos (&&, ||, !).
         */
        boolean estudante = true;
        int idadeEstudante = 17;
        if (idadeEstudante < 18 && estudante) {
            System.out.println("Você é um estudante menor de idade.");
        }


        /*
        Bloco de Código:
        Se o bloco if ou else tiver apenas uma linha de código, as chaves {} podem ser omitidas
        Embora não seja recomendado para que o código em si fique mais legível.
         */
        if (idade >= 18)
            System.out.println("Você é maior de idade.");
        else
            System.out.println("Você é menor de idade.");

        /*
        Escopo de Variáveis:
        As variáveis declaradas dentro de um bloco if ou else não são acessíveis fora desse bloco.
         */
        if (true) {
            int x = 10;
            System.out.println(x); // Isso funciona
        }
        // System.out.println(x); // Isso causaria um erro de compilação

    }
}
