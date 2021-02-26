package br.com.banco.desgraca;

public class Transacao {
    private TipoTransacao tipo;
    private Data data;
    private double valor;

    public TipoTransacao getTipo() {
        return tipo;
    }

    public Data getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public Transacao(TipoTransacao tipo, Data data, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;


    }
}
