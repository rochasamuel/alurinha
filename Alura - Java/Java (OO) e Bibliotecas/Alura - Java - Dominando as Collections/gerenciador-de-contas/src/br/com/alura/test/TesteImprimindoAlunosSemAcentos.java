package br.com.alura.test;

import java.util.*;

public class TesteImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        alunos.forEach((aluno) -> System.out.println(aluno));
    }
}
