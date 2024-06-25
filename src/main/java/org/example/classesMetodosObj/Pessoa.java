package org.example.classesMetodosObj;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Método
    public void cumprimento() {
        System.out.println("Olá, tudo bem?");
    }

    // Getter para o campo 'nome'
    public String getNome() {
        return nome;
    }

    // Setter para o campo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o campo 'idade'
    public int getIdade() {
        return idade;
    }

    // Setter para o campo 'idade'
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

