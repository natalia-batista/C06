import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite a quantidade de lanche 1:");
        int lanche1 = entrada.nextInt();
        System.out.print("digite a quantidade de lanche 2:");
        int lanche2 = entrada.nextInt();
        System.out.print("digite a quantidade de lanche 3:");
        int lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        int media = total / 3;

    System.out.println("total de lanches: " + total);
    System.out.println("media de lanches: " + media);


        entrada.close();
    }
}