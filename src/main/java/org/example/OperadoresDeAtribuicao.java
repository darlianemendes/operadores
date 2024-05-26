package org.example;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {

        System.out.println("*** Operadores de Atribuição ***");
        int a = 3;
        int b = a;
        int c = a + b;
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);

        c += b; //c = c + b
        c -= b; //c = c - b
        c *= b; //c = c * b
        c /= b; //c = c / b
        System.out.println("O valor de c = \n" + c);

        /*
        Operador de Módulo (%): Retorna o resto da divisão de um número por outro.
        Paridade:
        Par: n % 2 == 0 (resto é 0)
        Ímpar: n % 2 == 1 (resto é 1)
        Expressão c %= b;: É equivalente a c = c % b; e atualiza c com o resto da divisão de c por b.
         */
        c %= 2; //c = c % 2 (0 -> par // 1 -> impar)
        System.out.println("O valor de c = " + c);
    }
}
