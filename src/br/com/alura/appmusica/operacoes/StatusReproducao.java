package br.com.alura.appmusica.operacoes;

public enum StatusReproducao {

    REPRODUCAO;
    private static boolean reproduzindo;

    public static boolean isReproduzindo() {
        return StatusReproducao.reproduzindo;
    }

    public static void iniciarReproducao() {
        StatusReproducao.reproduzindo = true;
    }

    public static void pararReproducao() {
        StatusReproducao.reproduzindo = false;
    }
}
