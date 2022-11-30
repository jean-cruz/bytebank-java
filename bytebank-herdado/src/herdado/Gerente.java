package herdado;

public class Gerente extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticacaoUtil;
    public Gerente(){
        this.autenticacaoUtil = new AutenticacaoUtil();
    }
    public double getBonificacao(){
        System.out.println("chamando a bonificação do gerente.");
        return super.getSalario();
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticacaoUtil.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }
}
