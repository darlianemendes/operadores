package org.example.estruturasdecontrole;

public class EstruturasDeRepeticao1 {

    public static void main(String[] args) {

        /*
        for (inicializacao; condição; incremento) {
            // bloco de código
        }
         */

        //percorrer sobre os número de 0 até menor que 5
        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        //percorrer sobre a lista de numeros
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.println("Número: " + num);
        }

        //Soma dos números de 1 a 10
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
