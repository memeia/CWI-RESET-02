package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaDigital extends Conta implements ContaBancaria  {
    public ContaDigital(int numeroDaConta, InstituicaoBancaria nomeDoBanco) {
        super(numeroDaConta, nomeDoBanco);
    }

    @Override
    public String toString() {
        return "Conta Digital " + super.toString();
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return null;
    }

    @Override
    public Double consultarSaldo() {
        return null;
    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

    }
}
