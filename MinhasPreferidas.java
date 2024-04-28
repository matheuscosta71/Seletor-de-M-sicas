package br.com.alura.minhasmusicas.modelo;

import br.com.alura.minhasmusicas.Audio;

import java.sql.SQLOutput;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao()>= 9 ){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo()+" também é um dos que todos estão curtindo!");
        }
    }
}
