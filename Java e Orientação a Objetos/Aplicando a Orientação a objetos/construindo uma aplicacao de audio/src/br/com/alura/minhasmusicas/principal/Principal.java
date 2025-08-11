package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[]args){
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Don`t Cry");
        minhaMusica.setCantor("Guns´n Roses");

        for (int i = 0; i <1000;i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50;i++){
            minhaMusica.curti();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcos Mendes");

        for(int i = 0 ; i < 5000;i++){
            meuPodcast.reproduz();
        }

        for (int i = 0 ; i < 1000;i++){
            meuPodcast.curti();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
