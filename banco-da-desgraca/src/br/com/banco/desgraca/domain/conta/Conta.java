package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.InstituicaoBancaria;

import java.util.Locale;

abstract public class Conta {
    private int numeroDaConta;
    private InstituicaoBancaria nomeDoBanco;

    public Conta(int numeroDaConta, InstituicaoBancaria nomeDoBanco) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoBanco = nomeDoBanco;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public InstituicaoBancaria getNomeDoBanco() {
        return nomeDoBanco;
    }

    private String getNomeDoBancoFormatado(){
        return nomeDoBanco.toString().substring(0,1).toUpperCase() + nomeDoBanco.toString().substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return getNomeDoBancoFormatado() + " " +  numeroDaConta;
    }
}
