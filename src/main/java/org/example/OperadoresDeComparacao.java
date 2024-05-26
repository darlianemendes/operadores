package org.example;

public class OperadoresDeComparacao {

    public static void main(String[] args) {

        System.out.println("*** Operadores de Comparação ***");

        int a = 10;
        int b = 20;
        System.out.printf("O resultado da comparação a é igual a b, será: %s \n", a == b);
        System.out.printf("O resultado da comparação a é diferente a b, será: %s \n", a != b);
        System.out.printf("O resultado da comparação a maior que b, será: %s \n", a > b);
        System.out.printf("O resultado da comparação a menor que b, será: %s \n", a < b);
        System.out.printf("O resultado da comparação a maior ou igual b, será: %s \n", a >= b);
        System.out.printf("O resultado da comparação a menor ou igual b, será: %s \n", a <= b);
    }
}
