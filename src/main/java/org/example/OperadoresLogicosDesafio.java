package org.example;

public class OperadoresLogicosDesafio {

    public static void main(String[] args) {
        System.out.println("Operadores Lógicos! Desafio");

        var trabalho1 = false;
        var trabalho2 = true;
        var tomouSorteve = true;

        var comprouTV30 = trabalho1 ^ trabalho2;
        var comprouTV50 = trabalho1 && trabalho2;

        System.out.printf("Deu certo os dois trabalhos. Comprou a TV 50? %s e tomou sorvete? %s \n", comprouTV50, tomouSorteve);
        System.out.printf("Deu certo um trabalho. Comprou TV 30? %s e Tomou sorteve? %s.\n", comprouTV30, tomouSorteve);
        System.out.printf("Tomou sorteve sem comprar nenhuma tv? %s", !tomouSorteve);

    }
}
