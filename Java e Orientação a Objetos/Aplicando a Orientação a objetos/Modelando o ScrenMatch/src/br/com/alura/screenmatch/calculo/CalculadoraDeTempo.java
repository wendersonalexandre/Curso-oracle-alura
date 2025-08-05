package br.com.alura.screenmatch.calculo;


import br.com.alura.screenmacth.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDucacaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal +=s.getDuracaoEMminutos();
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal +=titulo.getDucacaoEmMinutos();
    };
}
