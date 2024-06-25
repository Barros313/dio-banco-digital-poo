public abstract class Conta implements InterfaceConta {
    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private final Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO++;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDados() {
        System.out.printf("Titular: %s%n%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.getAgencia());
        System.out.printf("Número: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n%n", this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}