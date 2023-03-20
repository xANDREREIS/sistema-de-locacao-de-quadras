package com.model;

public class Locatario {
    String nome;
    String cpf;
    String telefone;
    int anoNascimento;

    public Locatario() {
    }

    public Locatario(String nome, String cpf, String telefone, int anoDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.anoNascimento = anoDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoDeNascimento) {
        this.anoNascimento = anoDeNascimento;
    }

    @Override
    public String toString() {
        return "Locatario [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", anoDeNascimento="
                + anoNascimento + "]";
    }

}
