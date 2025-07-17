import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Transacao transacao = new Transacao();
        BancoCliente clienteNovo = new BancoCliente();

        printTitulo("Bem_Vindo ao Banco");
        System.out.println("Boa Noite");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual serviço deseja: ");
        System.out.println("1 - Adicionar conta\n2 - Transação\n3 - Deposito\n4 - Saque\n5 - Ver Clientes");
        int escolha = entrada.nextInt();

        switch (escolha){
            case 1:
                printTitulo("Adiconar conta");
                //Add metodo depois
                //Criar a conta
                //Mostrar
                break;

            case 2:
                printTitulo("transação");
                //Add metodo para a transação
                //Add o valor da transação e tipo
                break;

            case 3:
                printTitulo("Deposito");
                //Add metodo para deposito
                //Não pode ser add 0(Zero)
                //Fazer a conta no metodo e depois mostrar aqui
                break;

            case 4:
                printTitulo("saque");
//                transacao.Saque();
                break;

            case 5:
                printTitulo("Clientes");

        }
    }

    public static void printTitulo (String Titulo){
        System.out.println("----------------------------------------------");
        System.out.printf("                  %s%n", Titulo.toUpperCase());
        System.out.println("----------------------------------------------");
    }
}