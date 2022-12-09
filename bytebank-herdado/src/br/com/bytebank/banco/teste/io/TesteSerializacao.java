package br.com.bytebank.banco.teste.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Jean");
        cliente.setProfissao("Dev");
        cliente.setCpf("99933399909");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
