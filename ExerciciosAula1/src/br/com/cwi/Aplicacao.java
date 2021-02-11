package br.com.cwi;

public class Aplicacao {
    void main (){
        // Exercicio 1
        Calculadora cassio = new Calculadora();

        double resultado = cassio.soma(2,5);
        System.out.println("A soma é "+resultado);

        resultado = cassio.subtracao(2,5);
        System.out.println("A subtração é "+resultado);

        resultado = cassio.multiplicacao(2,5);
        System.out.println("A multiplicação é "+resultado);

        resultado = cassio.divisao(2,5);
        System.out.println("A divisão é "+resultado);

        // Exercicio 2
        Comprador phill =new Comprador();

        System.out.println(phill.menorQue(9,6));

        // Exercicio 3
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Marilia Ferreira";
        aluno1.notaFinal = 7;


        System.out.println("Aluno: "+ aluno1.nome );
        System.out.println("Aluno aprovado: "+ aluno1.aprovacao());
    }
}
