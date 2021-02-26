package br.com.banco.desgraca;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
