public class Filme {
    String nome;
    int anoDelancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int ducacaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    } 

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
