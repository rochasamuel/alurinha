package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopia {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("java-io/src/lorem2.txt"); //System.in [entrada pelo teclado]
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        FileOutputStream fos = new FileOutputStream("java-io/src/lorem2copy.txt"); //System.out [saida pelo console]
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        while (linha != null /*&& linha.isEmpty()*/) { //tirar comentário para ler com teclado
            bw.write(linha);
            bw.newLine();
            //bw.flush();
            linha = br.readLine();
        }

        bw.write("Cópia deu certo!");

        br.close();
        bw.close();
    }
}
