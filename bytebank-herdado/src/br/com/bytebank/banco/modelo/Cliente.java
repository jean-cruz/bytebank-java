package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBank.
 *
 * @author jean.cruz
 * @version 0.2
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1l;
    private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNomeCpf(){
        return this.nome+" "+this.cpf;
    }

}
