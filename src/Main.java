import com.banco.contas.implementacao.*;
import com.banco.contas.*;
import com.banco.estabelecimento.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente gabrielBarros = new Cliente("Gabriel Barros");

        Conta corrente = new ContaCorrente(gabrielBarros);
        Conta poupanca = new ContaPoupanca(gabrielBarros);

        corrente.depositar(100);
        poupanca.depositar(100);

        corrente.transferir(50, poupanca);

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(corrente);
        contas.add(poupanca);

        contas.forEach(InterfaceConta::imprimirExtrato);
    }
}
