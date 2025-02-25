//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Arma arma = new Arma(); //para agregar as classes é necessário criar a instancia
        jogador.energia = 100;
        jogador.vida = 10;
        arma.custoDeEnergia = 50;
        arma.dano = 3;
        jogador.arma = arma; //agregando as classes

        Jogador jogador2 = new Jogador();
        Arma arma2 = new Arma();
        jogador2.energia = 90;
        jogador2.vida = 10;
        arma2.custoDeEnergia = 60;
        arma2.dano = 5;
        jogador2.arma = arma2;

        jogador.atacar(jogador2);
        System.out.println(jogador.energia);
        System.out.println(jogador2.energia);
        System.out.println(jogador.vida);
        System.out.println(jogador2.vida);
        
        //System.out.println(jogador.toString());
        //System.out.println(jogador2.toString());
    }
}