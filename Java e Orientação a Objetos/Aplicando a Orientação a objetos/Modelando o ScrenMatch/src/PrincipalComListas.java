import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8.5);
        Filme filmeDoPaulo = new Filme("dogvile", 2003);
        filmeDoPaulo.avalia(6);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        for (Titulo item:listaDeAssistidos){
            System.out.println(item.getNome());
            System.out.println();
        }
    }
}
