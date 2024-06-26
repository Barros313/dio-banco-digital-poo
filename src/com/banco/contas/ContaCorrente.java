package com.banco.contas;

import com.banco.contas.implementacao.Conta;
import com.banco.estabelecimento.Cliente;
import com.banco.estabelecimento.Banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***%n");
        this.imprimirDados();
    }
}
