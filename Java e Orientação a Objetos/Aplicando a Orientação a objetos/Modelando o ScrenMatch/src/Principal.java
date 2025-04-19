public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Velozes e Furiosos";
        meuFilme.anoDelancamento = 2021;
        meuFilme.ducacaoEmMinutos = 140;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilmes(10);
        meuFilme.avaliaFilmes(8);
        meuFilme.avaliaFilmes(9);
        System.out.println( + meuFilme.getTotalDeAvaliacoes() );
        System.out.println( + meuFilme.pegaMedia() );
    }
}
