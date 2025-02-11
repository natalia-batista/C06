import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(10)+1; //gera um numero entre 1 e 10
        System.out.print("tente adivinhar um numero entre 1 e 10:");
        Scanner entrada = new Scanner(System.in);
        int adivinhacao = entrada.nextInt();
        int contador = 0;
        contador++;

        while(adivinhacao != x) {
            System.out.println("tente novamente");
            adivinhacao = entrada.nextInt();
            contador++;
        }
        System.out.println("voce acertou apos "+contador+" tentativas");
    }
}