package br.com.alura.screenmacth.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int ativa;
    private int episodiosPorTemporadas;
    private int minutosPorTemporadas;
    private int duracaoEMminutos;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAtiva() {
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorTemporadas() {
        return minutosPorTemporadas;
    }

    public void setMinutosPorTemporadas(int minutosPorTemporadas) {
        this.minutosPorTemporadas = minutosPorTemporadas;
    }

    public int getDuracaoEMminutos() {
        return duracaoEMminutos;
    }

    public void setDuracaoEMminutos(int duracaoEMminutos) {
        this.duracaoEMminutos = duracaoEMminutos;
    }
}
