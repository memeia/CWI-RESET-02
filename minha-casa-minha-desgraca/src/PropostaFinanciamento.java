public class PropostaFinanciamento {
    private Beneficiario beneficiario;
    private Imovel imovel;
    private int prazoDePagamentoEmMeses;


    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public int getPrazoDePagamentoEmMeses() {
        return prazoDePagamentoEmMeses;
    }

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, int prazoDePagamentoEmMeses) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoDePagamentoEmMeses = prazoDePagamentoEmMeses;
    }


    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        boolean foiAprovado = beneficiario.getSalario() * prazoDePagamentoEmMeses >= 0.5 * imovel.getValor();

        if (imovel.getEndereco().getEstado() == UnidadeFederativa.SP ){
            foiAprovado = beneficiario.getSalario() * prazoDePagamentoEmMeses >= 0.65 * imovel.getValor();
        }
        if (imovel.getEndereco().getEstado() == UnidadeFederativa.RJ ){
            foiAprovado = beneficiario.getSalario() * prazoDePagamentoEmMeses >= 0.6 * imovel.getValor();
        }

        if (foiAprovado) {
            imprimirPropostaAprovada();
        }
        else {
            imprimirPropostaNegada();
        }
    }
    private void imprimirPropostaAprovada (){
        System.out.println(
                "Parabéns " + beneficiario.getNome() +
                " sua proposta para a compra do imovel no endereço " + imovel.getEndereco() +
                        " no prazo de " +                 prazoDePagamentoEmMeses + "foi aceita!"
        );
    }
    private void imprimirPropostaNegada (){
        System.out.println(
                "Prezado cliente " + beneficiario.getNome() +
                " infelizmente sua proposta para a compra do imovel no endereço " + imovel.getEndereco() +
                        " no prazo de " + prazoDePagamentoEmMeses + "não foi aceita!"
        );
    }

}
