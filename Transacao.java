public class Transacao {

    int idTransacao;
    String tipo;
    double valor;
    Conta conta;

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
}
