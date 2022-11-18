package encapsulado;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto cal = new CalculadorDeImposto();
        cal.registra(cc);
        cal.registra(seguroDeVida);

        System.out.println(cal.getTotalImposto());
    }
}
