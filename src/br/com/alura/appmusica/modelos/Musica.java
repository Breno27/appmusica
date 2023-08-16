package br.com.alura.appmusica.modelos;

import br.com.alura.appmusica.operacoes.Controlador;

public class Musica extends Audio implements Controlador {
    private String compositor;
    private String grupo;
    /*
    * album genero com getters e settes
    * */

    public Musica(String titulo, int duracao, String compositor) {
        setTitulo(titulo);
        setDuracaoEmMinutos(duracao);
        setCompositor(compositor);
    }

    public void exibeDetalhes() {
        System.out.println("título: " + this.titulo);
        System.out.println("compositor: " + this.compositor);
        if (this.grupo != null) System.out.println("grupo: " + this.grupo);
        System.out.println("duracao: " + this.duracaoEmMinutos);
        System.out.println("Curtidas: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalDeReproducao());
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public int getClassicicacao() {
        return this.getTotalDeReproducao() > 2000 ? 10 : 7;
    }

    @Override
    public String reproduzir() {
        if (this.grupo != null) {
            return "Reproduzindo :" + this.getTitulo() + "de: " + this.grupo;
        } else {
            return "Reproduzindo :" + this.getTitulo() + "de: " + this.compositor;
        }
    }

    @Override
    public String pausar() {
        return isTocando() ? "Pause" : "Não há musica em reprodução";
    }
}
