package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();



        Conta cc= new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2= new ContaCorrente(22,22);
        lista.add(cc2);

        Conta cc3= new ContaCorrente(22,22);

        System.out.println("São iguais ? ="+cc2.equals(cc3));

        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? "+existe);

        for (Conta conta: lista) {
            if(conta.equals(conta)){
                System.out.println("Já tenho essa conta!");
            }
        }
        System.out.println("--------------------------------");
        for (Conta conta: lista) {
            System.out.println(conta);
        }
    }
}
