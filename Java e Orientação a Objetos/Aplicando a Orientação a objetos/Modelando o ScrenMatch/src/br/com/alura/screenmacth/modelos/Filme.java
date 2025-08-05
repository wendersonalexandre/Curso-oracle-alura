package br.com.alura.screenmacth.modelos;
import br.com.alura.screenmatch.calculo.Classificar;


public class Filme extends Titulo implements Classificar{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificar(){
        return 0;
    }
}