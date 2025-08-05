import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Velozes e Furiosos");;
        meuFilme.setAnoDelancamento(2021);
        meuFilme.setDucacaoEmMinutos(140);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações:  " + meuFilme.getTotalDeAvaliacoes() );
        System.out.println( + meuFilme.pegaMedia() );

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDelancamento(2021);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorTemporadas(50);
        lost.setEpisodiosPorTemporadas(12);
        System.out.println(lost);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Gato de botas");;
        outroFilme.setAnoDelancamento(2016);
        outroFilme.setDucacaoEmMinutos(148);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}