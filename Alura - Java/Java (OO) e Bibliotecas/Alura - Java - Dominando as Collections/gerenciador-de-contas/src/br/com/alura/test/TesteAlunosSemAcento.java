package br.com.alura.test;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcento {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();

        alunos.add("Samuel Rocha");
        alunos.add("João Silva");
        alunos.add("Diego Vaz");
        alunos.add("Luiz Homo");

        System.out.println(alunos);
        System.out.println(alunos.size());

        boolean adicionou = alunos.add("Samuel Rocha");
        System.out.println("Foi adicionado: " + adicionou);

        System.out.println(alunos.size());
        System.out.println(alunos);
    }
}
