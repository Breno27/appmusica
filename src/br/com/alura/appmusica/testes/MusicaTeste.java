package br.com.alura.appmusica.testes;

import br.com.alura.appmusica.modelos.Musica;

public class MusicaTeste {
    public static void main(String[] args) {
        Musica musicaUm = new Musica("Crawling", 3, "Mike Shinoda");
        Musica musicaDois = new Musica("Soldier side", 3, "Daron Malakian");
        musicaDois.setGrupo("System of a Down");

        musicaUm.exibeDetalhes();
        System.out.println("-----------");
        musicaDois.exibeDetalhes();
    }
}