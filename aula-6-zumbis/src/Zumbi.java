public class Zumbi {
    String nome;
    int vida;
    int dano;

    public Zumbi() {
        System.out.println("Esse construtor foi chamado!");
    }

    void seAlimentar() {
        System.out.println("Zumbi " + nome+ " está se alimentando...");
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Dano: " + dano);
    }

    void causarDano(Zumbi zumbiAlvo, int qtdDano){
        zumbiAlvo.vida -= qtdDano;
    }
}
