package br.com.alura.test;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TesteMatriculaAlunos {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as Collections", "Paulo Silveira");

        System.out.println(javaCollections.getAulas());

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 17));
        javaCollections.adiciona(new Aula("Listas de Objetos", 21));
        javaCollections.adiciona(new Aula("Relacionamentos com Coleções", 19));

        javaCollections.matricula(new Aluno("Samuel Rocha", 25468));
        javaCollections.matricula(new Aluno("Diego Vaz", 68795));
        javaCollections.matricula(new Aluno("Joao Homo", 13469));

//        System.out.println(javaCollections.getAlunos());

        javaCollections.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
