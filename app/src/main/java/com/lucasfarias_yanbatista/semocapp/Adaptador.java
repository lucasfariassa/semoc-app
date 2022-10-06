package com.lucasfarias_yanbatista.semocapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter {

    private List<Evento> lista;
    private Context context;

    public Adaptador(List<Evento> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.lista_item_evento, viewGroup, false);
        }
        TextView data = view.findViewById(R.id.lista_elemento_data);
        TextView hora = view.findViewById(R.id.lista_elemento_hora);
        TextView local = view.findViewById(R.id.lista_elemento_local);
        TextView titulo = view.findViewById(R.id.lista_elemento_titulo);
        TextView descricao = view.findViewById(R.id.lista_elemento_descricao);

        Evento evento = lista.get(i);

        data.setText(evento.getData());
        hora.setText(evento.getHora());
        local.setText(evento.getLocal());
        titulo.setText(evento.getTitulo());
        descricao.setText(evento.getDescricao());

        return view;
    }
}
