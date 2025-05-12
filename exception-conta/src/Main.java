import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Joao");
        cliente1.setCpf(12345);

        cliente2.setNome("Maria");
        cliente2.setCpf(98765);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(null);

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.deposita(500);
        conta.mostraInfo();

        System.out.println("Fim da main");


    }
}