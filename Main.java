import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Transacao transacao = new Transacao();
        BancoCliente clienteNovo = new BancoCliente();
        Conta conta = new Conta();

        printTitulo("Bem_Vindo ao Banco");
        System.out.println("Boa Noite");

        Scanner entrada = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Qual serviço deseja: ");
            System.out.println("1 - Adicionar conta\n2 - Transação\n3 - Deposito\n4 - Saque\n5 - Ver Clientes\n6 - Sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    printTitulo("Adiconar conta");
                    clienteNovo.criarCliente();
                    System.out.println("Cliente Criado!!");
                    printTitulo("");
                    break;

                case 2:
                    printTitulo("transação");
                    //Add metodo para a transação
                    //Add o valor da transação e tipo
                    printTitulo("");
                    break;

                case 3:
                    printTitulo("Deposito");
                    System.out.println("Qual valor deseja depositar: ");
                    double valor = entrada.nextDouble();
                    conta.Deposito(valor);
                    System.out.println("Valor depositado é de R$"+valor);
                    printTitulo("");
                    break;

                case 4:
                    printTitulo("saque");
                    //Add metodo de saque
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
        System.out.printf("                  %s%n", Titulo.toUpperCase());
        System.out.println("----------------------------------------------");
    }
}