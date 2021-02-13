public class Filme {
   private String nome;
   private String tipoDeFilme;
   private double duraca;
   private int lancamento;
   private int avaliacao;
   private Diretor diretor;

    public Filme(String nome, String tipoDeFilme, Double duraca, int lancamento, int avaliacao, Diretor diretor) {
        this.nome = nome;
        this.tipoDeFilme = tipoDeFilme;
        this.duraca = duraca;
        this.lancamento = lancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }


    void reproduzir ( ){
       System.out.println("Nome do filme: " +nome +"\nTipo: " +tipoDeFilme+"\nDuração: " +duraca+"\nDiretor do Filme: "+diretor.nome );

   }


}
