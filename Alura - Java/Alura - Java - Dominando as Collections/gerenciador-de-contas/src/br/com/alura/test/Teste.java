package br.com.alura.test;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        String aula1 = "Java = Dominando a Orientação a Objetos";
        String aula2 = "Avançando na Vida Com IA";
        String aula3 = "Desenvolvimento Web Descomplicado";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
//        aulas.forEach(aula -> System.out.println(aula));
    }
}
