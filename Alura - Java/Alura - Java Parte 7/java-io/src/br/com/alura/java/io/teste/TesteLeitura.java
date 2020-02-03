package br.com.alura.java.io.teste;

import java.io.*;

/**
 * Teste da leitura de arquivos externos coomo por exemplo .txt
 *
 * @author Samuel Rocha
 * @version 1.0
 */
public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //busca arquivo
        FileInputStream fis = new FileInputStream("java-io/lorem.txt");
        //interpreta bytes retornados
        InputStreamReader isr = new InputStreamReader(fis);
        //interpreta chars novamente para ler as linhas completas
        BufferedReader br = new BufferedReader(isr);

        //atribui a string lida a uma variável
        String linha = br.readLine();

        //enquanto todas as linhas não são lidas, ele lê a proxima e a imprime no console
        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        //fecha a "porta" aberta para leitura
        br.close();
    }
}