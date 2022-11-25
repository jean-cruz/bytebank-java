package encapsulado.teste;

import encapsulado.modelo.ContaCorrente;
import encapsulado.modelo.ContaPoupanca;
import encapsulado.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        /*
        int a = 3;
        int b = a / 0;
        ContaCorrente outra = null;
        outra.deposita(200.0);
        */
        //Full Qualified Name - quando o nome da classe é composto pelo nome do pacote junto
        ContaCorrente cc = new encapsulado.modelo.ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        cc.transfere(10.0,cp);

        System.out.println("CC: "+cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());


    }
}
