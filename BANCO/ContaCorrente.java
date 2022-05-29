package BANCO;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("Veja seu extrato de Conta Correte");
        super.imprimirInfosComuns();

    }
}
