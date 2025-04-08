public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinhoCompras(){
        System.out.println("adicionando no carrinho "+nome);
    }

    public void calculaValorTotalCompra(){
        System.out.println("nome "+nome+" valor "+preco);
    }

    public void mostraInfo(){
        System.out.println("nome "+nome);
        System.out.println("preco "+preco);
        System.out.println("sabor "+sabor);
    }
}
