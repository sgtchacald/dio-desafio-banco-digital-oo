package banco.conta;

import cliente.Cliente;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    public void imprimirExtrato() {
        System.out.println("=== Extrato banco.conta.Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
