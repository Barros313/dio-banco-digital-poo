import com.banco.contas.implementacao.*;
import com.banco.contas.*;
import com.banco.estabelecimento.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente gabrielBarros = new Cliente("Gabriel Barros");
        Endereco enderecoNubank = new Endereco(
                "Brasil",
                "SP",
                "São Paulo",
                "Pinheiros",
                "05409-000",
                "Rua Capote Verde",
                "39",
                ""
        );

        Banco nubank = new Banco("Nubank", enderecoNubank);

/*        Conta corrente = new ContaCorrente(gabrielBarros, nubank);
        Conta poupanca = new ContaPoupanca(gabrielBarros, nubank);

        corrente.depositar(100);
        poupanca.depositar(100);

        corrente.transferir(50, poupanca);

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(corrente);
        contas.add(poupanca);

        contas.forEach(InterfaceConta::imprimirExtrato);*/

        nubank.getEndereco();
    }
}
