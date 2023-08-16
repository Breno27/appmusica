package br.com.alura.appmusica.modelos;

public class Audio {
    protected String titulo;
    protected int duracaoEmMinutos;
    private int totalDeReproducao;
    private int curtidas;

    private boolean tocando;

    protected boolean isTocando() {
        return tocando;
    }
//classificação

    public void curtir() {
        this.curtidas++;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }
}
