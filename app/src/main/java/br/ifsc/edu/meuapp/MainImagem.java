package br.ifsc.edu.meuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainImagem extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_imagem);
        imageView = findViewById(R.id.imageView);
    }
    
    public void mudaTexto (View view){
        imageView.setImageResource(R.drawable.cachorro);

    }
}
