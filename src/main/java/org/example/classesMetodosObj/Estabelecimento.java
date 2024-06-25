package org.example.classesMetodosObj;

public class Estabelecimento {

    public static void main(String[] args) {
        // Criando um objeto Pessoa
        Pessoa pessoa1 = new Pessoa("José", 40);
        Pessoa pessoa2 = new Pessoa("Raimunda", 55);
        Pessoa pessoa3 = new Pessoa("Benicio", 75);

        // Usando getters para acessar os valores
        System.out.println("Nome pessoa1: " + pessoa1.getNome());
        System.out.println("Idade pessoa1: " + pessoa1.getIdade());

        System.out.println("Nome pessoa2: " + pessoa2.getNome());
        System.out.println("Idade pessoa2: " + pessoa2.getIdade());

        System.out.println("Nome pessoa3: " + pessoa3.getNome());
        System.out.println("Idade pessoa3: " + pessoa3.getIdade());

        // Usando setters para modificar os valores
        pessoa1.setNome("José Maria");
        pessoa1.setIdade(30);

        // Verificando os valores modificados
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        //cumprimento
        pessoa1.cumprimento();
    }
}
