//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Esfilha";
        salgado2.nome = "Pastel";
        salgado3.nome = "Coxinha";

        cantina.nome = "Cantina do Inatel";
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);
        cantina.mostraInfo();

    }
}