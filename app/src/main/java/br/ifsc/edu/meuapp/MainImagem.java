package br.ifsc.edu.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class MainImagem extends AppCompatActivity {
    ImageView imageView;
    private int i=0; //posição da imagem
    List<Integer> lista_imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_imagem);
        imageView = findViewById(R.id.imageView);

        lista_imagem = Arrays.asList(
                R.drawable.porquinho,
                R.drawable.patinho,
                R.drawable.cachorro,
                R.drawable.gardem,
                R.drawable.happy
        );
    }

    public void mudaFoto (View view){

        if(i<=lista_imagem.size()-1){
            imageView.setImageResource(lista_imagem.get(i));
        }else {
            i=0;
            imageView.setImageResource(lista_imagem.get(i));
        }
           i++;
        }

};





