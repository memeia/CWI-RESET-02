package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaDigital;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {
        Conta marilia = new ContaDigital(25, InstituicaoBancaria.BRADESCO);
        System.out.println(marilia);


    }
}
