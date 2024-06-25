package org.example.classesMetodosObj.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private static final ArrayList<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Cadastro de Livro");

            // Cadastro de Autor
            System.out.print("Nome do Autor: ");
            String nomeAutor = scanner.nextLine();
            System.out.print("Nacionalidade do Autor: ");
            String nacionalidadeAutor = scanner.nextLine();
            Autor autor = new Autor(nomeAutor, nacionalidadeAutor);

            // Cadastro de Categoria
            System.out.print("Nome da Categoria: ");
            String nomeCategoria = scanner.nextLine();
            Categoria categoria = new Categoria(nomeCategoria);

            // Cadastro de Livro
            System.out.print("Título do Livro: ");
            String tituloLivro = scanner.nextLine();
            Livro livro = new Livro(tituloLivro, autor, categoria);

            // Adicionando livro à lista
            livros.add(livro);

            // Perguntar se deseja cadastrar outro livro
            System.out.print("Deseja cadastrar outro livro? (sim/não): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        // Listar livros cadastrados
        listarLivros();

        scanner.close();
    }

    public static void listarLivros() {
        System.out.println("\nLivros cadastrados:");
        for (Livro livro : livros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}

