package br.com.alura.appmusica.testes;

import br.com.alura.appmusica.modelos.Musica;
import br.com.alura.appmusica.modelos.Podcast;
import br.com.alura.appmusica.operacoes.StatusReproducao;

public class TestaControlador {
    public static void main(String[] args) {
        StatusReproducao statusReproducao = StatusReproducao.REPRODUCAO;

        //ao pausar uma musica que esteja trocando return pause
        Musica musica = new Musica("Your love", 3, "Josie");
        System.out.println(musica.reproduzir());
        System.out.println(musica.pausar());

        //ao pausar sem que nada esteja tocando retorna tratativa
        System.out.println(musica.pausar());


        Podcast podcast = new Podcast("Podpah", 180, "Igão", 123);
        System.out.println(podcast.reproduzir());

        //ao pausar sem que nada esteja tocando retorna tratativa
        System.out.println(musica.pausar());
        System.out.println(musica.pausar());
        System.out.println(musica.pausar());
        System.out.println(musica.pausar());

    }
}
