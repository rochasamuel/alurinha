package br.com.alura.test;

import br.com.alura.modelo.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Trabalhando com ArrayList", 17);
        Aula a2 = new Aula("Listas de Objetos", 21);
        Aula a3 = new Aula("Relacionamentos com Coleções", 19);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas); //usando o metodo compareTo que teve de ser @override apos a
        // implementação da interface Comparable<Aula>

        aulas.sort(Comparator.comparing(Aula::getTempo)); //compara pelo tempo

        System.out.println(aulas);

    }
}
