package com.dh.hotel.model;

public class Filial {

    private int id;
    private String nome;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private int eh5estrelas;

    public Filial(String nome, String rua, String numero, String cidade, String estado, int eh5estrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eh5estrelas = eh5estrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEh5estrelas() {
        return eh5estrelas;
    }

    public void setEh5estrelas(int eh5estrelas) {
        this.eh5estrelas = eh5estrelas;
    }
}
