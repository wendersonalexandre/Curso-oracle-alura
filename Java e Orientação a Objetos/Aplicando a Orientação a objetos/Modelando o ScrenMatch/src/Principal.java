public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Velozes e Furiosos";
        meuFilme.anoDelancamento = 2021;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 4.5;
        meuFilme.totalDeAvaliacoes = 1000;
        meuFilme.ducacaoEmMinutos = 140;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDelancamento);

    }
}
