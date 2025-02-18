//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        personagem.nome = "Pedro";
        personagem.pontos = 100;
        personagem.arma = arma; //agregação
        personagem.arma.nome = "espada";
        personagem.arma.poder = 10;
        personagem.arma.resistencia = 10;
        personagem.arma.descricao = "Dois gumes";

        personagem.usarArma();
        System.out.println(personagem.arma.resistencia);
        personagem.tomarDano();
        System.out.println(personagem.pontos);
    }
}