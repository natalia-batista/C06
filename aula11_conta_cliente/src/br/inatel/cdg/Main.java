package br.inatel.cdg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente [] clientes = new Cliente[2];

        clientes[0] = new Cliente();
        clientes[0].setNome("Maria");
        clientes[0].setCpf(12378901);

        clientes[1] = new Cliente();
        clientes[1].setNome("Pedro");
        clientes[1].setCpf(12356202);

        conta.setClientes(clientes);
        conta.deposita(2000);
        conta.sacar(1000);
        System.out.println(conta.getSaldo());

    }
}