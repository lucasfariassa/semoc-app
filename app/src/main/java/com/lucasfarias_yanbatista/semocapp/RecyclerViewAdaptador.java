package com.lucasfarias_yanbatista.semocapp;

//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;

// Tentativa de Uso do RecyclerView:

//public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.EventoView> {
//    private List<Evento> lista;
//
//    public RecyclerViewAdaptador(List lista) {
//        this.lista = lista;
//    }
//
//    @NonNull
//    @Override
//    public EventoView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_evento,
//                parent, false);
//        return new EventoView(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull EventoView holder, int position) {
//        Evento evento = lista.get(position);
//        holder.setData(evento.getData());
//        holder.setHora(evento.getHora());
//        holder.setLocal(evento.getLocal());
//        holder.setTitulo(evento.getTitulo());
//        holder.setDescricao(evento.getDescricao());
//    }
//
//    @Override
//    public int getItemCount() {
//        return lista.size();
//    }
//
//    public static class EventoView extends RecyclerView.ViewHolder {
//        private final TextView data, hora, local, titulo, descricao;
//
//        public EventoView(@NonNull View view) {
//            super(view);
//            data = view.findViewById(R.id.lista_elemento_data);
//            hora = view.findViewById(R.id.lista_elemento_hora);
//            local = view.findViewById(R.id.lista_elemento_local);
//            titulo = view.findViewById(R.id.lista_elemento_titulo);
//            descricao = view.findViewById(R.id.lista_elemento_descricao);
//        }
//
//        public void setData(String data) {
//            this.data.setText(data);
//        }
//
//        public void setHora(String hora) {
//            this.hora.setText(hora);
//        }
//
//        public void setLocal(String local) {
//            this.local.setText(local);
//        }
//
//        public void setTitulo(String titulo) {
//            this.titulo.setText(titulo);
//        }
//
//        public void setDescricao(String descricao) {
//            this.descricao.setText(descricao);
//        }
//    }
//}
