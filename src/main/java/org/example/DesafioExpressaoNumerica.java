package org.example;

public class DesafioExpressaoNumerica {

    public static void main(String[] args) {
        // Passo 1: Calcular 3 elevado a 2
        double potencia = Math.pow(3, 2); // 3^2 = 9

        // Passo 2: Somar o resultado com 5
        double soma = potencia + 5; // 9 + 5 = 14

        // Passo 3: Dividir 8 por 2
        double divisao = 8 / 2; // 8 / 2 = 4

        // Passo 4: Multiplicar os resultados das duas operações anteriores
        double multiplicacao = soma * divisao; // 14 * 4 = 56

        // Passo 5: Calcular a raiz quadrada de 16
        double raiz = Math.sqrt(16); // sqrt(16) = 4

        // Passo 6: Subtrair o resultado da raiz quadrada do resultado da multiplicação
        double resultadoIntermediario = multiplicacao - raiz; // 56 - 4 = 52

        // Passo 7: Calcular 10^3
        double potenciaDez = Math.pow(10, 3); // 10^3 = 1000

        // Passo 8: Dividir o resultado da expressão pelo resultado de 10^3
        double resultadoFinal = resultadoIntermediario / potenciaDez; // 52 / 1000 = 0.052

        // Imprimir o resultado final
        System.out.println("O resultado da expressão é: " + resultadoFinal); // Saída: O resultado da expressão é: 0.052
    }
}

