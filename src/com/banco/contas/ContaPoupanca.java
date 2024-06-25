package com.banco.contas;

import com.banco.contas.implementacao.Conta;
import com.banco.estabelecimento.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***%n");
        this.imprimirDados();
    }
}
