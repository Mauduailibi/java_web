package com.entra21.model;

public class Usuario {
    private int id;
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(String n, String u, String s) {
        this.nome = n;
        this.usuario = u;
        this.senha = s;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String u) {
        this.usuario = u;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String s) {
        this.senha = s;
    }
}
