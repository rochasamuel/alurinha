package br.com.alura.test;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TesteCurso {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as Collections", "Paulo Silveira");

        System.out.println(javaCollections.getAulas());

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 17));
        javaCollections.adiciona(new Aula("Listas de Objetos", 21));
        javaCollections.adiciona(new Aula("Relacionamentos com Coleções", 19));

        System.out.println(javaCollections.getAulas());
        System.out.println(javaCollections);
    }
}
