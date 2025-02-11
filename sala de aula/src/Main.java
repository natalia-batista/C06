import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("entre com o numero de alunos matriculados:");
        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10:
            case 20:
                System.out.println("sala I-16");
            break;
            case 30:
                System.out.println("sala I-22");
            break;
        }
        entrada.close();
    }
}