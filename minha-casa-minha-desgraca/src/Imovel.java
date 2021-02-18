public class Imovel {

    private double valor;
    private Endereco endereco;

    public Imovel ( double valor, Endereco endereco){
        this.valor = valor;
        this.endereco = endereco;
    }
            public double getValor() {
            return valor;
    }
            public Endereco getEndereco() {
            return endereco;
    }
        String apresentacao() {
        return "Imovel localizado no endereço " +endereco+ "no valor de R$ " +valor;
    }

}
