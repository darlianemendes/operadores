package org.example;

public class DesafioBiblioteca {

    public static void main(String[] args) {

        // Informações sobre a pessoa
        int idade = 20; // idade da pessoa
        boolean possuiCartaoMembro = true; // se a pessoa possui um cartão de membro válido
        boolean estaNaListaDeDevedores = false; // se a pessoa está na lista de devedores
        boolean eFuncionario = false; // se a pessoa é funcionária da biblioteca

        // Verificações
        boolean maiorDeIdade = idade >= 18;
        boolean condicoesPrincipais = maiorDeIdade && possuiCartaoMembro && !estaNaListaDeDevedores;
        boolean podeAcessar = condicoesPrincipais || eFuncionario;

        // Imprimir resultados das verificações
        System.out.println("Maior de idade: " + maiorDeIdade); // true
        System.out.println("Possui cartão de membro: " + possuiCartaoMembro); // true
        System.out.println("Está na lista de devedores: " + estaNaListaDeDevedores); // false
        System.out.println("É funcionário: " + eFuncionario); // false

        // Resultado final
        System.out.println("Pode acessar a biblioteca: " + podeAcessar); // true
    }
}
