package javaIO;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        String nome = "Jean Vinicius";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(nome);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nomeRetorno = (String) ois.readObject();
        System.out.println(nomeRetorno);
        ois.close();


    }
}
