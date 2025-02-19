public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    //composicao
    public Kart() {
        motor = new Motor(); //constutor
    }

    void pular(){
        System.out.println("pular");
    }
    void soltarTurbo(){
        System.out.println("soltarTurbo");
    }
    void fazerDrift(){
        System.out.println("fazerDrift");
    }
}
