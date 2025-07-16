public class Conta {

    private int idConta;
    private int numero;
    private double saldo;
    private String tipo;
    private Cliente cliente;

    public Conta(int idConta, int numero, double saldo, String tipo, Cliente cliente) {
        this.idConta = idConta;
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
