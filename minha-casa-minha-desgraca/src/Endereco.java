public class Endereco {
    String logradouro;
    int numero;
    int complemento;
    String bairro;
    String cidade;
    UnidadeFederativa estado;

    public Endereco (String logradouro, int numero, int complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;


    }
}
