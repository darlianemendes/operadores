package org.example;

public class OperadoresDeAtribuicaoUnario {

    public static void main(String[] args) {

        System.out.println("*** Operadores Unários ***");
        var a = 1;
        var b = 2;

        // incremento maior precedência
        a++; // a = a + 1
        System.out.println("O valor de a com incremento é: " + a);
        a--; // a = a - 1
        System.out.println("O valor de a com decremento é: " + a);

        // decremento menor precedência
        ++b; // b = b + 1
        System.out.println("O valor de a com incremento pré-fixado é: " + b);
        --b; // b = b - 1
        System.out.println("O valor de a com decremento pré-fixado é: " + b);

        //Falando sobre precedência...
        System.out.printf("Esta validação será? %s \n", ++a == b--);
        System.out.println("Pós decremento pós-fixado: " + b);
    }
}
