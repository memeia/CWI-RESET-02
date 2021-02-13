public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("kako", 32, 1 );

        Filme filme1 = new Filme (" Star", "Comedia", 21.0, 2021,2, diretor1
        );
        Filme filme2 = new Filme (" Star2", "Terror", 22.0, 2020,3, diretor1
        );
        filme1.reproduzir();
        filme2.reproduzir();
    }
}
