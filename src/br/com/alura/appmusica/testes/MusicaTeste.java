package br.com.alura.appmusica.testes;

import br.com.alura.appmusica.modelos.MinhasPreferidas;
import br.com.alura.appmusica.modelos.Musica;

public class MusicaTeste {
    public static void main(String[] args) {
        Musica musicaUm = new Musica("Crawling", 3, "Mike Shinoda");
        Musica musicaDois = new Musica("Soldier side", 3, "Daron Malakian");
        musicaDois.setGrupo("System of a Down");

        for (int i = 0; i < 50; i++) {
            musicaUm.curtir();
        }

        for (int i = 0; i < 100; i++) {
            musicaDois.curtir();
        }

        for (int i = 0; i < 1000; i++) {
            musicaUm.reproduz();
        }
        for (int i = 0; i < 2100; i++) {
            musicaDois.reproduz();
        }

        musicaUm.exibeDetalhes();
        System.out.println("-----------");
        musicaDois.exibeDetalhes();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musicaUm);
        preferidas.inclui(musicaDois);

    }
}