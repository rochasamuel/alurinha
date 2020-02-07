package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Teste da escrita de arquivos externos como por exemplo .txt
 *
 * @author Samuel Rocha
 * @version 1.0
 */
public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

//        PrintStream ps = new PrintStream("java-io/src/lorem4.txt");
//
//        ps.println("Teste de adição de texto a um arquivo .txt");
//        ps.println();
//        ps.print("Aqui termina o texto adicionado");
//
//        ps.close();

        long ini = System.currentTimeMillis(); //capturar milisegundos desde 01-01-1970 no inicio do progama

        PrintWriter pw = new PrintWriter("java-io/src/lorem4.txt");

        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        pw.close();

        long fim = System.currentTimeMillis(); // capturar no fim

        System.out.println("Passaram " + (fim - ini) + " milissegundos"); //tempo decorrido de execução;
    }
}
