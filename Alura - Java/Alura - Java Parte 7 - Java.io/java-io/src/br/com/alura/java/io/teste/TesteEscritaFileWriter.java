package br.com.alura.java.io.teste;

import java.io.*;

/**
 * Teste da escrita de arquivos externos como por exemplo .txt
 *
 * @author Samuel Rocha
 * @version 1.0
 */
public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("java-io/src/lorem2.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        FileWriter fw = new FileWriter("java-io/src/lorem3.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/src/lorem3.txt"));

        bw.write("Teste de adição de texto a um arquivo .txt");
//        bw.write(System.lineSeparator());
        bw.newLine();
        bw.write("Aqui termina o texto adicionado");

        bw.close();
    }
}
