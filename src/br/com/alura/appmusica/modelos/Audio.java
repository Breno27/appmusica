package br.com.alura.appmusica.modelos;

import br.com.alura.appmusica.operacoes.StatusReproducao;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int classicicacao;

    public void curtir() {
        this.totalCurtidas++;
    }

    public void contabilizaReproducao(){
        this.totalDeReproducao++;
    }

    public int getClassicicacao() {
        return this.classicicacao;
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
