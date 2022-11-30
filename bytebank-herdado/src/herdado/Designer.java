package herdado;

public class Designer extends Funcionario implements Autenticavel {
    private int senha;
    public double getBonificacao(){
        System.out.println("chamando a bonificação do herdado.Designer.");
        return 200;
    }
    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

}
