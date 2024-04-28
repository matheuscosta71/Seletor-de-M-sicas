package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.Musica;
import br.com.alura.minhasmusicas.Podcast;
import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");
        minhaMusica.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Natália");
        meuPodcast.setTitulo("Mesa de bar");

        for (int i = 0; i < 2000 ; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000 ; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
