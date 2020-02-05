package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bytebank-herdado-conta/cc.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getTitular().getNome());
        System.out.println(cc.getSaldo());
    }
}
