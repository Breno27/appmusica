package br.com.alura.appmusica.testes;

import br.com.alura.appmusica.modelos.MinhasPreferidas;
import br.com.alura.appmusica.modelos.Podcast;

public class PodcastTeste {
    public static void main(String[] args) {
        Podcast podcastUm = new Podcast("Ticaraticast", 120, "Carioca", 1);
        Podcast podcastDois = new Podcast("Inteligencia LTDA", 380, "Rogério Vilela", 20);
        podcastDois.setConvidado("Julio Cocielo");

        for (int i = 0; i < 400; i++) {
            podcastUm.curtir();
        }

        for (int i = 0; i < 600; i++) {
            podcastDois.curtir();
        }

        for (int i = 0; i < 1000; i++) {
            podcastUm.contabilizaReproducao();
        }
        for (int i = 0; i < 1500; i++) {
            podcastDois.contabilizaReproducao();
        }

        podcastUm.exibeDetalhes();
        System.out.println("-----------");
        podcastDois.exibeDetalhes();

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcastUm);
        preferidas.inclui(podcastDois);
    }
}
