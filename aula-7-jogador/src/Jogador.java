public class Jogador {
    Arma arma; //agregacao
    int energia;
    int vida;



    void atacar(Jogador alvo){
        if(energia>=arma.custoDeEnergia){
            alvo.vida -= arma.dano;
            energia -= arma.custoDeEnergia;
        }
    }

    public Jogador() {
    }

    public Jogador(int vida, int energia, Arma arma) {
        this.vida = vida;
        this.energia = energia;
        this.arma = arma;
    }

   //toString -> falta esse método
}
