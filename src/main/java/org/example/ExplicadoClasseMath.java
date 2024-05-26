package org.example;

public class ExplicadoClasseMath {

    public static void main(String [] args) {
        System.out.println("*** Explicando classe MATH ***");
        /*
        A linguagem Java está equipada com uma biblioteca abrangente para funções e operações matemáticas.
        Ela é chamada de classe "Math" e reside no pacote java. lang .
        A biblioteca Math inclui métodos para operações numéricas fundamentais,
        trigonometria, encontrar min-max, gerar números aleatórios e operações logarítmicas.
         */
        int valor = -10;
        int valorAbsoluto = Math.abs(valor);
        System.out.println("Aqui ele trará o valor absoluto: " + valorAbsoluto);

        int a = 5;
        int b = 10;
        int max = Math.max(a, b); // max será 10
        int min = Math.min(a, b); // min será 5
        System.out.println("Aqui trará o valor máximo entre a e b: " + max);
        System.out.println("Aqui trará o valor mínimo entre a e b: " + min);

        double raiz = Math.sqrt(25);
        System.out.println("Aqui trará a raiz quadrada do valor infomado no parâmetro: " + raiz);

        double potencia = Math.pow(2, 3); // potencia será 8.0
        System.out.println("Aqui trará a potência sendo: primero valor a base segundo valor o expoente: " + potencia);

        /*
        A hipotenusa é igual à raiz quadrada da soma dos catetos ao quadrado
         */
        double cateto1 = 3;
        double cateto2 = 4;
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}
