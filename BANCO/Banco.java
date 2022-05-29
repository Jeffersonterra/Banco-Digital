package BANCO;

import java.util.List;

public class Banco {

    private String nome;
    private List<String> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getContas() {
        return contas;

    }

    public void setContas(List<String> contas) {
        this.contas = contas;
    }
}
