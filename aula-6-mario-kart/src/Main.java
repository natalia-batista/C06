//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        kart1.nome = "Glider";
        kart2.nome = "Roller";

        //como o motor é criado junto, atribuindo seus valores(composicao)
        kart1.motor.cilindradas = "50";
        kart1.motor.velocidadeMaxima = 100;

        kart2.motor.cilindradas = "100";
        kart2.motor.velocidadeMaxima = 145;

        //criando os pilotos (associacao)
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "Mario";
        piloto2.nome = "Luigi";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        //executando acoes do piloto
        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        //executando acoes do kart
        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.motor.mostraInfo();

        kart2.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.motor.mostraInfo();

    }
}