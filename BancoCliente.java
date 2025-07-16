import java.util.ArrayList;

public class BancoCliente {
    private ArrayList<Cliente> clientes;

    public BancoCliente(){
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
