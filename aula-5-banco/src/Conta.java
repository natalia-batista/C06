public class Conta {
    //atributos
    int saldo;
    int limite;
    float numeroDaConta;
    String nomeDoDono;

    //metodos
    public void sacar(int quantidade){
        saldo -= quantidade;
    }
    public void depositar(int quantidade){
        saldo += quantidade;
    }
}
