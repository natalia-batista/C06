public class Personagem {
    String nome;
    int pontos;
    Arma arma; //associacao

    void usarArma(){
        arma.resistencia-=2;
    }
    void tomarDano(){
        pontos -=5;
    }
}
