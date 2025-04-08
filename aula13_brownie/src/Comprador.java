public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo; //o construtor é usado apenas uma vez
        //se eu fosse atualizar o saldo ao longo do código seria necessário usar get/set
    }

    public void efetuarCompra(Brownie brownie){
        System.out.println("COMPRANDO...");
        brownie.addCarrinhoCompras();
        brownie.calculaValorTotalCompra();
    }
}
