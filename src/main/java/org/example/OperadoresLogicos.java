package org.example;

public class OperadoresLogicos {

    public static void main(String[] args) {

        System.out.println("*** Operadores Lógicos ***");

        boolean condicao1 = true;
        boolean condicao2 = 2 > 8;

        System.out.printf("Condição && (E LÓGICO) quando apenas um é verdadeiro, resultado é: %s\n", condicao1 && !condicao2);
        System.out.printf("Condição || (OU LÓGICO) quando apenas um é verdadeiro, resultado é: %s\n", condicao1 || condicao2);
        System.out.printf("Condição ^ (OU LÓGICO EXCLUSIVO) uma únca afirmação possível, resultado é: %s\n", condicao1 ^ condicao2);
        System.out.printf("Negação dupla: %s\n", !!condicao1);
        System.out.printf("Negação única: %s\n", !condicao2);
    }
}
