public class Imovel {
    private final double valor;
    private final Endereco endereco;

    public double getValor() {
        return valor;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public Imovel(double valor, Endereco endereco){
        this.valor = valor;
        this.endereco = endereco;
    }
    String apresentacao() {
        return "Imóvel localizado no endereço " + endereco.getLogradouro() + ". Valor de R$ " + valor;
    }

}
