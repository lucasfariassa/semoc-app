package com.lucasfarias_yanbatista.semocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    CadastroEventos cadastroEventos = new CadastroEventos(); // Objeto de cadastro

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        cadastroEventos.cadastrarEventos(); // Cadastra eventos pré-declarados no método

        ListView listView;
        listView = findViewById(R.id.main_lista_evento);
        ListViewAdaptador adaptador = new ListViewAdaptador(cadastroEventos.eventos, this);
        listView.setAdapter(adaptador);

        // Tentativa de Uso do RecyclerView:

//        RecyclerView recyclerView = findViewById(R.id.main_lista_evento_recyclerView);
//        RecyclerViewAdaptador adaptador = new RecyclerViewAdaptador(cadastroEventos.eventos);
//        recyclerView.setAdapter(adaptador);
//        recyclerView.setLayoutManager(new LinearLayoutManager());
//        recyclerView.addOnItemTouchListener(new EventoClickListener(this, recyclerView,
//                new EventoClickListener.OnItemClickListener() {
//            @Override
//            public void onItemClick(View view, int position) {
//                // Clique:
//                setContentView(R.layout.evento_detalhes);
//            }
//
//            @Override
//            public void onLongItemClick(View view, int position) {
//                // CLique Longo: Nada
//            }
//        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_item_mesasRedondas:
                //exibir apenas mesas redondas;
                return true;
            case R.id.menu_item_jornadasDePesquisa:
                //exibir apenas jornadas de pesquisa;
                return true;
            case R.id.menu_item_inscrevase:
                //redirecionar para o sympla;
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sympla.com.br/evento/25-semoc-educacao-inclusiva-2022/1729833")));
                return true;
            case R.id.menu_item_email:
                //enviar email;
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + "semoc@ucsal.br"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}