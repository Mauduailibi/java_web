package com.entra21.model;

import java.time.LocalDate;

public class Gasto {
    private int id;
    private int usuarioId;
    private String descricao;
    private double valor;
    private LocalDate dataGasto;
    private String categoria;

    public Gasto(int uid, String d, double v, LocalDate dg, String c) {
        this.usuarioId = uid;
        this.descricao = d;
        this.valor = v;
        this.dataGasto = dg;
        this.categoria = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(LocalDate dataGasto) {
        this.dataGasto = dataGasto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
