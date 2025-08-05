import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmacth.*;

public class Principal {
    public static <CalculadoraDeTempo> void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Velozes e Furiosos");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2021);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(12);
        lost.setMinutosPorTemporadas(50);
        lost.exibeFichaTecnica();

        System.out.println(lost);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Gato de Botas");
        outroFilme.setAnoDeLancamento(2016);
        outroFilme.setDuracaoEmMinutos(148);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println("Tempo total calculado: " + calculadora.getTempoTotal() + " minutos");

        Recomendacao filtra = new filtra;
    }
}
