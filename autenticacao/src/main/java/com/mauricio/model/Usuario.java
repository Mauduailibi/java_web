package com.mauricio.model;

public class Usuario {
    private String nome;
    private String usuario;
    private String senha;

    public Usuario(String n, String u, String s) {
        this.nome = n;
        this.usuario = u;
        this.senha = s;
    }

    public String getNome() {
        return this.nome;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }
}
