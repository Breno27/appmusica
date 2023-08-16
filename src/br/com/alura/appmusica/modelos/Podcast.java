package br.com.alura.appmusica.modelos;

import br.com.alura.appmusica.operacoes.Controlador;

public class Podcast extends Audio {
    private String apresentador;
    private String convidado;
    private int episodio; //descrição do episodio com get e set

    public Podcast(String titulo, int duracao, String apresentador, int episodio) {
        setTitulo(titulo);
        setDuracaoEmMinutos(duracao);
        setApresentador(apresentador);
        setEpisodio(episodio);
    }

    public void exibeDetalhes(){
        System.out.println("título: " + this.titulo);
        System.out.println("episodio: " + this.episodio);
        System.out.println("apresentador: " + this.apresentador);
        if (this.convidado != null) System.out.println("convidado: " + this.convidado);
        System.out.println("duração: " + this.duracaoEmMinutos);
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalDeReproducao());
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return episodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public int getClassicicacao() {
        return this.getTotalCurtidas() > 500 ? 10 : 8;
    }
}
