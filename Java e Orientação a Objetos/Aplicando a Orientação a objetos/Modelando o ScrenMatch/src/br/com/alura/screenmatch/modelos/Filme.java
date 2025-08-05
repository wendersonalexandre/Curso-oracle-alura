package br.com.alura.screenmatch.modelos;

public class Filme extends Titulo implements Classificacao{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificar(){
        return int pegaMedia / 2;
    }

    public void setAnoDeLancamento(int i) {

    }

    public void setDuracaoEmMinutos(int i) {

    }
}