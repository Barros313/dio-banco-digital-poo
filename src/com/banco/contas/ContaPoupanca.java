package com.banco.contas;

import com.banco.contas.implementacao.Conta;
import com.banco.estabelecimento.Cliente;
import com.banco.estabelecimento.Banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***%n");
        this.imprimirDados();
    }
}
