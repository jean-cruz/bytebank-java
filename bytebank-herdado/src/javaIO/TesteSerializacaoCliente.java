package javaIO;

import br.com.bytebank.banco.modelo.Cliente;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Jean");
        cliente.setProfissao("Dev");
        cliente.setCpf("99933399909");

        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        //oos.writeObject(cliente);
        //oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente objRetorno = (Cliente) ois.readObject();
        System.out.println(objRetorno.getNome());
        ois.close();
    }
}
