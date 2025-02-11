import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int npa = entrada.nextInt();

        if(npa>=30 && npa<60){
            int np3 = entrada.nextInt();
            int nfa = (np3 + npa)/2;
            if(nfa>=50){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }
        else if(npa>60){
            System.out.println("Aprovado sem np3");
        }
        else{
            System.out.println("Reprovado");
        }

        entrada.close();
    }
}