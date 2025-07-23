import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BancoCliente clienteNovo = new BancoCliente();
        Conta conta = new Conta();
        Transacao transacao = new Transacao();

        printTitulo("Bem_Vindo ao Banco");
        System.out.println("Boa Noite");

        Scanner entrada = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Qual serviço deseja: ");
            System.out.println("1 - Adicionar conta\n2 - Movimentação\n3 - Deposito\n4 - Saque\n5 - Ver Clientes\n6 - Sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    printTitulo("Adiconar conta");
                    clienteNovo.criarCliente();
                    System.out.println("Cliente Criado!!");
                    printTitulo("");
                    break;

                case 2:
                    printTitulo("Transações realizadas");
                    transacao.mostrarResumo();
                    printTitulo("");
                    break;

                case 3:
                    printTitulo("Deposito");
                    System.out.println("Qual valor deseja depositar: ");
                    double valorDeposito = entrada.nextDouble();
                    conta.deposito(valorDeposito);
                    transacao.registrarMovimentacao(valorDeposito);
                    System.out.printf("Valor depositado é de R$%.2f\n", valorDeposito);
                    printTitulo("");
                    break;

                case 4:
                    printTitulo("Saque");
                    System.out.println("Qual valor deseja sacar: ");
                    double valorSaque = entrada.nextDouble();
                    conta.saque(valorSaque);
                    transacao.registrarMovimentacao(valorSaque);
                    transacao.registroSaque(valorSaque);
                    System.out.printf("Valor de saque é de R$%.2f\n", valorSaque);
                    printTitulo("");
                    break;

                case 5:
                    printTitulo("Clientes");
                    clienteNovo.ListarCliente();
                    printTitulo("");
                    break;

                case 6:
                    System.out.println("Saindo!!");
            }
        }while(escolha != 6);
    }

    public static void printTitulo (String Titulo){
        System.out.println("----------------------------------------------");
        System.out.printf("                %s%n", Titulo.toUpperCase());
        System.out.println("----------------------------------------------");
    }
}