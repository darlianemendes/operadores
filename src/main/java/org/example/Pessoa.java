package org.example;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Sobrescrevendo o método equals
    @Override
    public boolean equals(Object obj) {
        // Verifica se é a mesma referência
        if (this == obj) {
            return true;
        }

        // Verifica se o objeto é uma instância de Pessoa
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Converte o objeto para Pessoa
        Pessoa outraPessoa = (Pessoa) obj;

        // Compara nome e idade
        return nome.equals(outraPessoa.nome) && idade == outraPessoa.idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Alice", 30);
        Pessoa pessoa3 = new Pessoa("Bob", 25);

        // Comparação com ==
        System.out.println("pessoa1 == pessoa2: " + (pessoa1 == pessoa2));
        System.out.println("pessoa1 == pessoa3: " + (pessoa1 == pessoa3));

        // Comparação com equals
        System.out.println("pessoa1.equals(pessoa2): " + pessoa1.equals(pessoa2));
        System.out.println("pessoa1.equals(pessoa3): " + pessoa1.equals(pessoa3));
    }
}

