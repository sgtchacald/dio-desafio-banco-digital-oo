package banco.conta;

import cliente.Cliente;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
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

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Nome do Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Renda Mensal do Titular: %.2f", this.cliente.getRendaMensal()));
        System.out.println(String.format("Telefone do Titular: %s", this.cliente.getTelefone()));
        System.out.println(String.format("Número Agencia: %d", this.agencia));
        System.out.println(String.format("Numero banco.conta.Conta: %d", this.numero));
        System.out.println(String.format("Saldo em banco.conta.Conta: %.2f", this.saldo));
    }
}
