package br.com.alura.appmusica.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String convidado;
    private EpisodioPodcast episodio;

    public Podcast(String titulo, int duracao, String apresentador, EpisodioPodcast episodio) {
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
    }

    public void setEpisodio(EpisodioPodcast episodio) {
        this.episodio = episodio;
    }

    public EpisodioPodcast getEpisodio() {
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

}
