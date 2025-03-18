package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente [] clientes;

    public Conta() {
        this.clientes = new Cliente[2];
    }

    public float getSaldo() {
        return saldo;
    }

    public void setClientes(Cliente[] clientes) {
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
}
