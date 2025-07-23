public class Transacao {

    private int totalMovimentacoes;
    private double valorTotalMovimentado;
    private double valorTotalSaida;

    public void registrarMovimentacao(double valor) {
        totalMovimentacoes++;
        valorTotalMovimentado += valor;
    }

    public void registroSaque(double valor){
        totalMovimentacoes++;
        valorTotalSaida -= valor;
    }

    public int getTotalMovimentacoes() {
        return totalMovimentacoes;
    }

    public double getValorTotalMovimentado() {
        return valorTotalMovimentado;
    }

    public void mostrarResumo() {
        System.out.println("Total de transações: " + totalMovimentacoes);
        System.out.printf("Valor total movimentado: R$ %.2f\n", valorTotalMovimentado);
        System.out.printf("Valor total sacado: R$ %.2f\n", valorTotalSaida);
    }
}
