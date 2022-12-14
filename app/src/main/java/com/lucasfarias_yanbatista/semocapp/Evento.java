package com.lucasfarias_yanbatista.semocapp;

public class Evento {
    private String data, hora, local, titulo, descricao, tag;

    public Evento(String data, String hora, String local, String titulo, String descricao,
                  String tag) {
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tag = tag;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
