import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner para ler do teclado a posicao digitada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do campo minado: ");
        int dim = entrada.nextInt();
        boolean [][] campoMinado = new boolean [dim][dim];

        //gerando numero aleatorio
        Random rand = new Random();
        int x = rand.nextInt(dim);
        int y = rand.nextInt(dim);
        campoMinado[x][y] = true;

        while(true){
            System.out.println("digite a coordenada x: ");
            int testex = entrada.nextInt();
            System.out.println("digite a coordenada y: ");
            int testy = entrada.nextInt();
            if(campoMinado[testex][testy]){
                System.out.println("Bomba atingida!");
                break;
            }
        }
    }
}