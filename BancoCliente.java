import java.util.ArrayList;
import java.util.Random;

public class BancoCliente {
    private Random random = new Random();
    private ArrayList<Cliente> clientes;
    private int proxId = 1;

    public Cliente criarCliente(){
        String[] nomes = {"Djalma", "Lucas", "Ana", "João", "Bruna", "Fernanda", "Carlos"};
        String nome = nomes[random.nextInt(nomes.length)];;
        int idade = random.nextInt(60) + 18;
        String cpf = gerarCpf();
        String telefone = gerartelefone();

        Cliente novo = new Cliente(proxId++, nome, idade, cpf, telefone);
        clientes.add(novo);
        return novo;
    }  //Gera o cliente automatico

    private String gerarCpf(){
        StringBuilder cpf = new StringBuilder();
        for(int i = 0; i < 11; i ++){
            cpf.append(random.nextInt(10));
        }
        return cpf.toString();
    }

    private String gerartelefone(){
        int ddd = 11 + random.nextInt(89);
        int numero1 = 90000 + random.nextInt(10000);
        int numero2 = 1000 + random.nextInt(9000);
        return ("(" + ddd + ")" + numero1 + "-" + numero2);
    }

    public void ListarCliente(){
        for(Cliente c : clientes){
            System.out.println(c);
        }
    }
}
