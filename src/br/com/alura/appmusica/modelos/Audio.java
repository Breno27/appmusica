package br.com.alura.appmusica.modelos;

public class Audio {
    protected String titulo;
    protected int duracaoEmMinutos;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int classicicacao;
    private static boolean tocando;

    protected boolean isTocando() {
        return Audio.tocando;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducao++;
    }

    public int getClassicicacao() {
        return classicicacao;
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

    public int getTotalCurtidas() {
        return totalCurtidas;
    }
}
