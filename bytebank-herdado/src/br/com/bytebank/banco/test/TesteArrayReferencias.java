package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        //Conta[] contas = new Conta[5];
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22,11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,22);
        referencias[1] = cc2;

        referencias[3] = new Cliente();
        Cliente cliente = (Cliente) referencias[3];


        //System.out.println("contas[0] = "+contas[0].getNumero());
        //System.out.println("contas[1] = "+contas[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println("ref = "+ref.getNumero());
        System.out.println("cc2 = "+cc2.getNumero());
    }
}
