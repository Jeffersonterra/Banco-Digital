package BANCO;

public class ContaPoupannca extends Conta {
    public ContaPoupannca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("Veja seu Extrato de Conta Poupanca");
        super.imprimirInfosComuns();
    }
}
