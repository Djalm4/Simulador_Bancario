import java.util.ArrayList;
import java.util.Random;

public class BancoCliente {
    final private Random random = new Random();
    final private ArrayList<Cliente> clientes;
    private int proxId = 1;

    public BancoCliente(){
        clientes = new ArrayList<>();
    }

    public Cliente criarCliente(){
        String[] nomes = {"Mario", "Lucas", "Ana", "João", "Bruna", "Bruno","Fernanda", "Carlos", "Renato", "Renata"};
        String nome = nomes[random.nextInt(nomes.length)];;
        int idade = random.nextInt(60) + 18;
        String cpf = gerarCpf();
        String telefone = gerartelefone();

        Cliente novo = new Cliente(proxId++, nome, idade, cpf, telefone);

        int idConta = random.nextInt(1000) + 1;
        Conta novaConta = new Conta();
        novo.setConta(novaConta);
        clientes.add(novo);
        return novo;
    }

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

    public Conta buscarId(int id){
        for(Cliente cliente : clientes){
            Conta conta =   cliente.getConta();
            if(conta != null && conta.getIdConta() == id){
                return conta;
            }
        }
        return null;
    }
}
