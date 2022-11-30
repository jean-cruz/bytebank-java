package herdado;

import herdado.AutenticacaoUtil;
import herdado.Autenticavel;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil autenticacaoUtil;
    public Cliente(){
        this.autenticacaoUtil = new AutenticacaoUtil();
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
