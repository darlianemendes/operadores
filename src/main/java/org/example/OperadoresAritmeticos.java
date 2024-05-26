package org.example;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        System.out.println("*** Operadores Aritméticos em Java ***");
        var numero1 = 34.56;
        var numero2 = 2.2;
        System.out.printf("O resultado da operação soma será: %.2f\n", numero1 + numero2);
        System.out.printf("O resultado da operação subtração será: %.2f\n", numero1 - numero2);
        System.out.printf("O resultado da operação multiplicação será: %.2f\n", numero1 * numero2);
        System.out.printf("O resultado da operação divisao será: %.2f\n", numero1 / numero2);
        System.out.printf("O resultado do resto da divisão será: %.2f\n\n", numero1 % numero2);

        int numero3 = 8;
        int numero4 = 3;
        System.out.printf("O resultado da operação soma será: %d\n", numero3 + numero4);
        System.out.printf("O resultado da operação subtração será: %d\n", numero3 - numero4);
        System.out.printf("O resultado da operação multiplicação será: %d\n", numero3 * numero4);
        System.out.printf("O resultado da operação divisao será: %d\n\n", numero3 / numero4);
        System.out.printf("O resultado da operação divisao se eu quiser um resultado double será: %.2f\n\n", numero3 / (double)numero4);
        System.out.printf("O resultado do resto da divisão será: %d\n\n", numero3 % numero4);

        System.out.println("*** Operadores mais complexas ***");
        /*
        Precedência:
        Ordem pela qual devem ser realizadas as operações numa expressão.
        Nesse caso: primeiro a multiplicação -> soma -> subtração
         */
        System.out.printf("O resultado da expressão será: %.2f", numero1 + numero2 - numero3 * numero4);
    }
}
