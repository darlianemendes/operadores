package org.example.estruturasdecontrole;

import java.util.Scanner;

public class EstruturasDeRepeticao2 {

    public static void main(String[] args) {

        /*
        while (condição) {
        // bloco de código
        }
         */

        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        int numero = 12345;
        int somaDigitos = 0;
        while (numero > 0) {
            somaDigitos += numero % 10;
            numero /= 10;
        }
        System.out.println("Soma dos dígitos: " + somaDigitos);


        //Encontre o maior número da lista
        int[] numeros = {5, 8, 2, 1, 9, 4};
        int maior = numeros[0];
        int i = 1;
        while (i < numeros.length) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            i++;
        }
        System.out.println("Maior número: " + maior);

        /*
        do {
            // bloco de código
        } while (condição);
         */

        int contador2 = 0;
        do {
            System.out.println("Contador: " + contador2);
            contador2++;
        } while (contador2 < 5);


        int numero2 = 0;
        do {
            System.out.println("Número: " + numero2);
            numero2++;
        } while (numero2 <= 10 && numero2 % 2 == 0);


        //Insira números até que ele digite zero.
        // Calcule a soma dos números inseridos.
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero3;
        do {
            System.out.print("Digite um número (0 para sair): ");
            numero3 = scanner.nextInt();
            soma += numero3;
        } while (numero3 != 0);
        System.out.println("Soma dos números: " + soma);

    }
}
