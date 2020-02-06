package br.com.alura.test;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as Collections", "Paulo Silveira");

        System.out.println(javaCollections.getAulas());

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 17));
        javaCollections.adiciona(new Aula("Listas de Objetos", 21));
        javaCollections.adiciona(new Aula("Relacionamentos com Coleções", 19));

        //salvar aulas imutavei em um array para ordenalo e imprimir ordenado
        List<Aula> aulasMutaveis = new LinkedList<>(javaCollections.getAulas());
        Collections.sort(aulasMutaveis);

        System.out.println(aulasMutaveis);

        System.out.println(javaCollections);
    }
}
