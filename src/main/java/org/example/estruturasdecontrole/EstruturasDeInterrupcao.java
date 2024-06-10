package org.example.estruturasdecontrole;

public class EstruturasDeInterrupcao {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Número: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Número ímpar: " + i);
        }

        System.out.printf("O valor da soma é: %d", soma(2, 4));
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
