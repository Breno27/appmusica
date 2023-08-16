package br.com.alura.appmusica.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassicicacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso");
        } else {
            System.out.println(audio.getTitulo() + " também estão curtindo");
        }
    }
}
