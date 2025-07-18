import java.util.Scanner;
import java.util.Random;

public class Transacao {

    private int idTransacao;
    private String tipo;
    private double valor;
    private Conta conta;

    private static int proxId = 1;

    Scanner entrada = new Scanner(System.in);

    public Transacao(int idTransacao, String tipo, double valor, Conta conta) {
        this.idTransacao = idTransacao;
        this.tipo = tipo;
        this.valor = valor;
        this.conta = conta;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    private String gerarTipo(){
        String[] tipos = {"Saque", "Deposito", "Transferencia"};
        Random random = new Random();
        return tipos[random.nextInt(tipos.length)];
    }

    private double gerarValor(){
        Random random = new Random();
        return 10 + (1000 - 10) * random.nextDouble();
    }

    public boolean Saque(double valor){

        if(valor > 0 && valor <= conta.getSaldo()){ //Faz verificação
            conta.setSaldo(conta.getSaldo() - valor); //Seta o valor da conta
            System.out.println("Saque de R$"+valor+" realizado com sucesso.");
            return true;
        }
        else{
            System.out.println("Saldo insuficiente ou valor invalido");
            return false;
        }
    }
}
