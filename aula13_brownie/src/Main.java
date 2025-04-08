//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BrownieCafe bc = new BrownieCafe("BC",25,"cafe");
        BrownieNutella bn = new BrownieNutella("BN",20,"nutella");
        BrownieDoceDeLeite bl = new BrownieDoceDeLeite("BL",15,"doce");


        bc.addCarrinhoCompras();
        bc.calculaValorTotalCompra();
        bc.adicionaCafe();
        bc.mostraInfo();

        System.out.println("---");

        bn.adicionaNutella();
        bn.addCarrinhoCompras();
        bn.calculaValorTotalCompra();
        bn.mostraInfo();

        System.out.println("---");

        bl.addCarrinhoCompras();
        bl.calculaValorTotalCompra();
        bl.adicionaDoceDeLeite();
        bl.mostraInfo();

        System.out.println("---");

        Comprador comprador = new Comprador("natalia",50);
        comprador.efetuarCompra(bl);

    }
}