package com.lucasfarias_yanbatista.semocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        CadastroEventos cadastroEventos = new CadastroEventos(); // Objeto de cadastro
        cadastroEventos.cadastrarEventos(); // Cadastra eventos pré-declarados no método

        ListView listView = findViewById(R.id.main_lista_evento);
        Adaptador adaptador = new Adaptador(cadastroEventos.eventos, this);
        listView.setAdapter(adaptador);
    }
}