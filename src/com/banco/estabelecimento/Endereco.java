package com.banco.estabelecimento;

public class Endereco {
    private final String pais;
    private final String estado;
    private final String cidade;
    private final String bairro;
    private final String cep;
    private final String rua;
    private final String numero;
    private final String complemento;

    public Endereco(String pais, String estado, String cidade, String bairro, String cep, String rua, String numero, String complemento) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getPais() {
        return pais;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    @Override
    public String toString() {
        return "Endereço: " +
                "País - '" + pais + '\'' +
                ", Estado (UF) - '" + estado + '\'' +
                ", Cidade - '" + cidade + '\'' +
                ", Bairro - '" + bairro + '\'' +
                ", CEP - '" + cep + '\'' +
                ", Rua - '" + rua + '\'' +
                ", Número -'" + numero + '\'' +
                ", Complemento - '" + complemento;
    }

    public void imprimirEnderecoFormatado() {
        System.out.printf("%s, %s - %s%n%s - %s (%s)", rua, numero, bairro, cidade, estado, pais);
    }
}
