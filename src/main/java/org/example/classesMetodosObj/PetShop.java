package org.example.classesMetodosObj;

public class PetShop {
    public static void main(String[] args) {

        // Criando objetos da classe Cachorro
        Cachorro cachorro1 = new Cachorro("Lili", 1);
        Cachorro cachorro2 = new Cachorro("Belinha", 10);
        Cachorro cachorro3 = new Cachorro("Julie", 11);

        // Acessando atributos e métodos
        System.out.println("Qual o nome da cachorrinha na espera 1: " + cachorro1.getNome());
        cachorro1.latir();

        System.out.println("Qual o nome da cachorrinha na espera 2: " + cachorro2.getNome());
        cachorro1.latir();

        System.out.println("Qual o nome da cachorrinha na espera 3: " + cachorro3.getNome());
        cachorro1.latir();
    }
}
