//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //três instâncias da mesma classe
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.saldo = 10000;
        conta2.saldo = 20000;

        conta1.sacar(1000);

    }
}