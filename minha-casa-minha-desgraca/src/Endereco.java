public class Endereco {
    private final String logradouro;
    private final int numero;
    private final int complemento;
    private final String bairro;
    private final String cidade;
    private final UnidadeFederativa estado;

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public int getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

    public Endereco (String logradouro, int numero, int complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }
}
