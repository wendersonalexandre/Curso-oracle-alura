public class Filme {
    String nome;
    int anoDelancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int ducacaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDelancamento);
    }

    void avaliaFilmes(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
