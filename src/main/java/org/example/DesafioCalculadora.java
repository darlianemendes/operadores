package org.example;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        var numero2 = entrada.nextDouble();

        System.out.println("Digite o sinal da operação que deseja fazer: ");
        var sinalOperacao = entrada.next();

        double resultado = "+".equals(sinalOperacao) ? numero1 + numero2 : 0;
        resultado = "-".equals(sinalOperacao) ? numero1 - numero2 : resultado;
        resultado = "*".equals(sinalOperacao) ? numero1 * numero2 : resultado;
        resultado = "/".equals(sinalOperacao) ? numero1 / numero2 : resultado;
        resultado = "%".equals(sinalOperacao) ? numero1 % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", numero1, sinalOperacao, numero2, resultado);
        entrada.close();

//        //Usando if else
//        if (sinalOperacao.equals("+")) {
//            System.out.printf("O resultado é: %s", numero1 + numero2);
//        } else if (sinalOperacao.equals("-")) {
//            System.out.printf("O resultado é :%s", numero1 - numero2);
//        } else if(sinalOperacao.equals("/")) {
//            System.out.printf("O resultado é: %s", numero1 / numero2);
//        } else if(sinalOperacao.equals("%")) {
//            System.out.printf("O resultado é: %s", numero1 % numero2);
//        }
    }
}
