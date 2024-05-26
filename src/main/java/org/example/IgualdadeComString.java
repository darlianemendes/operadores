package org.example;

public class IgualdadeComString {

    public static void main(String [] args) {

        System.out.println("*** Igualdade com String ***");
        /*
        Aqui, s1 e s2 apontam para o mesmo objeto "SOU UMA STRING" no pool de strings.
         */
        String s1 = "SOU UMA STRING";
        String s2 = "SOU UMA STRING";
        System.out.printf("Essa comparação é: %s\n", s1 == s2);

        /*
        Aqui o equals irá comparar se o conteúdo de dois objetos é igual.
         */
        String s3 = new String("SOU UMA STRING");
        System.out.printf("Essa comparação é: %s\n", s1.equals(s3));
    }
}
