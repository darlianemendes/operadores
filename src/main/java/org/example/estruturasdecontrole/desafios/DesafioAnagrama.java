package org.example.estruturasdecontrole.desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioAnagrama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("As palavras '" + palavra1 + "' e '" + palavra2 + "' são anagramas.");
        } else {
            System.out.println("As palavras '" + palavra1 + "' e '" + palavra2 + "' não são anagramas.");
        }

        scanner.close();
    }
    public static boolean saoAnagramas(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        /*
        Porque é necessário converter para um array de char?
        Converter a string para um array de caracteres (char[]) é necessário neste contexto,
        porque permite que você manipule e compare os caracteres individualmente de maneira eficiente.
         */
        char[] charArray1 = palavra1.toCharArray(); //toCharArray -> Este é um método da classe String em Java que converte a string em um array de caracteres (char[]).
        char[] charArray2 = palavra2.toCharArray();

        //Para ordenar os arrays de caracteres.
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //Arrays.equals -> Para comparar os arrays ordenados. Se forem iguais, as palavras são anagramas, caso contrário, não são.
        return Arrays.equals(charArray1, charArray2);
    }
}
