import java.util.HashSet;
import java.util.Set;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Set<Cliente> clientes;

    public Conta() {
        this.clientes = new HashSet<>();
        this.limite = 2000;

        //setClientes(new Cliente[2]); //posso usar o setter para fazer isso
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void sacar(float quantia){
        if(quantia <= saldo){
            saldo -= quantia;
        }
    }
    public void deposita(float quantia){
        saldo += quantia;
    }

    public void mostraInfo(){
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
        for(Cliente cliente : this.clientes){
            try{
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e);
            }

        }



    }
}

