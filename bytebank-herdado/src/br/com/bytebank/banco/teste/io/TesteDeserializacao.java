package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDeserializacao {
    public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente objRetorno = (ContaCorrente) ois.readObject();
        System.out.println(objRetorno.getNumero());
        System.out.println(objRetorno.getTitular());
        ois.close();

    }
}
