package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaBancaria;

import java.time.LocalDate;

public class ContaPoupanca implements ContaBancaria {
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
