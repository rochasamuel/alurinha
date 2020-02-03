package br.com.alura.java.io.teste;

import java.io.*;
/**
 * Teste da escrita de arquivos externos como por exemplo .txt
 *
 * @author Samuel Rocha
 * @version 1.0
 */
public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("java-io/src/lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Teste de adição de texto a um arquivo .txt");
        bw.newLine();
        bw.write("Aqui termina o texto adicionado");

        bw.close();
    }
}
