package org.example.estruturasdecontrole.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escadas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sequência de números separados por espaço:");
        String[] input = scanner.nextLine().split(" ");
        int[] sequencia = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            sequencia[i] = Integer.parseInt(input[i]);
        }

        List<List<Integer>> escadas = encontrarEscadas(sequencia);

        System.out.println("Escadas encontradas:");
        for (List<Integer> escada : escadas) {
            System.out.println(escada);
        }
    }

    public static List<List<Integer>> encontrarEscadas(int[] sequencia) {
        List<List<Integer>> escadas = new ArrayList<>();

        if (sequencia.length < 2) {
            return escadas; // Se a sequência tiver menos de 2 números, não tem escadas
        }

        int inicio = 0;
        while (inicio < sequencia.length - 1) {
            int diferencaEntreDoisPrimeirosNumeroConsecutivos = sequencia[inicio + 1] - sequencia[inicio];
            int fim = inicio + 1;

            while (fim < sequencia.length - 1 && sequencia[fim + 1] - sequencia[fim] == diferencaEntreDoisPrimeirosNumeroConsecutivos) {
                fim++;
            }

            if (fim - inicio >= 1) {
                List<Integer> escada = new ArrayList<>();
                for (int i = inicio; i <= fim; i++) {
                    escada.add(sequencia[i]);
                }
                escadas.add(escada);
            }

            inicio = fim + 1;
        }

        return escadas;
    }
}

