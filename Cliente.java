import java.util.ArrayList;

public class Cliente {

    private int idCliente;
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;

    private Conta conta;

    public Cliente(int idCliente, String nome, int idade, String cpf, String telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID: " + idCliente + " | Nome: " + nome + " | Idade: " + idade + " | CPF: " + cpf + " | Telefone: " + telefone;
    }
}
