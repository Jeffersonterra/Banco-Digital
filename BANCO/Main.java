package BANCO;

public class Main {
    public static void main(String[] args) {
        Cliente jefferson = new Cliente();
        jefferson.setNome("Jefferson");

        Conta cc = new ContaCorrente(jefferson);
        Conta poupanca = new ContaPoupannca(jefferson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirExtrato();
    }

}
