package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("java-io/contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt","BR"),
                    "%s - Agência: %04d Conta: %08d Cliente: %s Saldo: %08.2f %n"
                    , tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();
        }

        scanner.close();
    }
}
