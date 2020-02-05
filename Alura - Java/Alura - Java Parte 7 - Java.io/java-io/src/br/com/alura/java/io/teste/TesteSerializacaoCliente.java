package br.com.alura.java.io.teste;

import br.com.bytebank.banco.modelo.Cliente;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Samuel Rocha");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("05613920133");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-io/cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-io/cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
    }
}
