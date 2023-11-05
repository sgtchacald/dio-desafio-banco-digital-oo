import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import cliente.Cliente;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();
        c1.setNome("Diego dos Santos Cordeiro");
        c1.setTelefone("21994674449");
        c1.setEndereco("Rua Ferreira de andrade, cachambi.");
        c1.setRendaMensal(8500.00);

        ContaCorrente cc = new ContaCorrente(c1);
        ContaPoupanca poupanca = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.depositar(100);
        cc.depositar(100);
        cc.depositar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
