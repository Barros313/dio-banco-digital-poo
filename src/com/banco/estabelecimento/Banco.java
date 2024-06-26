package com.banco.estabelecimento;

public class Banco {
    private String nome;
    private Endereco endereco;

    public Banco(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void getEndereco() {
        endereco.imprimirEnderecoFormatado();
    }
}
