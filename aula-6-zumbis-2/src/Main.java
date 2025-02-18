//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.vida = 100;
        zumbi2.vida = 200;

        System.out.println(zumbi1.transfereVida(zumbi2,50));
        System.out.println(zumbi1.vida);
        System.out.println(zumbi2.vida);

        System.out.println(zumbi1.transfereVida(zumbi2,500));
        System.out.println(zumbi1.vida);
        System.out.println(zumbi2.vida);

        zumbi1 = zumbi2;

        zumbi1.vida = 500;
        System.out.println(zumbi1.vida);
        System.out.println(zumbi2.vida);
    }
}