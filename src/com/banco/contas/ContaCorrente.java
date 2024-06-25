package com.banco.contas;

import com.banco.contas.implementacao.Conta;
import com.banco.estabelecimento.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***%n");
        this.imprimirDados();
    }
}
