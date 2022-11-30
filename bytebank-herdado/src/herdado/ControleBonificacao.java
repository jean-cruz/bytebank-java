package herdado;

public class ControleBonificacao {
    private double soma;

    public void registro(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;
    }
    public double getSoma() {
        return soma;
    }
}
