//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bilbo", 5);
        cachorro.emitirSom();
        cachorro.mostraInfo();

        System.out.println("------");

        Lontra lontra = new Lontra("Ottie", 5);
        lontra.emitirSom();
        lontra.mostraInfo();
        lontra.nadar();

        System.out.println("------");

        Boi boi = new Boi("Ben",20);
        boi.emitirSom();
        boi.mostraInfo();
    }
}