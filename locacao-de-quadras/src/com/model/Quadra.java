package com.model;

public class Quadra {
    private String nome;
    private String tipo;
    private Double valorMinuto;

    public Quadra() {
    }

    public Quadra(String nome, String tipo, Double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.valorMinuto = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(Double valor) {
        this.valorMinuto = valor;
    }

    @Override
    public String toString() {
        return "Quadra [nome=" + nome + ", tipo=" + tipo + ", valor=" + valorMinuto + "]";
    }

}
