package org.example.classesMetodosObj;

public class Cachorro {
    // Atributos
    private String nome;
    private int idade;

    // Construtor -> Usado para inicializar o estado do objeto.
    public Cachorro(String nome, int idade) {
        this.nome = nome; //`this.nome` refere-se ao campo da classe, `nome` refere-se ao parâmetro
        this.idade = idade;
    }

    // Método -> atribuindo comportamento
    public void latir() {
        System.out.println("Au Au!");
    }

    // Getters e Setters -> Métodos de acesso e modificação dos atributos da classe.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

