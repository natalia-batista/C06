import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MemoriaUSB usb1 = new MemoriaUSB();
        usb1.nome = "Pen-drive";
        usb1.capacidade = 16;
        MemoriaUSB usb2 = new MemoriaUSB();
        usb2.nome = "Pen-drive";
        usb2.capacidade = 32;
        MemoriaUSB usb3 = new MemoriaUSB();
        usb3.nome = "HD Externo";
        usb3.capacidade = 1000;

        Computador[] computadores = new Computador[3];

        computadores[0] = new Computador(2059,"Apple");
        //composicao
        computadores[0].hardwareBasico[0] = new HardwareBasico();
        computadores[0].hardwareBasico[1] = new HardwareBasico();
        computadores[0].hardwareBasico[2] = new HardwareBasico();

        computadores[0].sistemaOperacional.nome = "Linux Ubuntu";
        computadores[0].sistemaOperacional.tipo = 32;
        computadores[0].hardwareBasico[0].nome = "Pentium Core i3";
        computadores[0].hardwareBasico[0].capacidade = 2200;
        computadores[0].hardwareBasico[1].nome = "Memoria RAM";
        computadores[0].hardwareBasico[1].capacidade = 8;
        computadores[0].hardwareBasico[2].nome = "HD";
        computadores[0].hardwareBasico[2].capacidade = 500;
        //agregacao
        computadores[0].addMemoriaUSB(usb1);


        computadores[1] = new Computador(3293,"Samsung");
        computadores[1].hardwareBasico[0] = new HardwareBasico();
        computadores[1].hardwareBasico[1] = new HardwareBasico();
        computadores[1].hardwareBasico[2] = new HardwareBasico();

        computadores[1].sistemaOperacional.nome = "Windows 8";
        computadores[1].sistemaOperacional.tipo = 64;
        computadores[1].hardwareBasico[0].nome = "Pentium Core i5";
        computadores[1].hardwareBasico[0].capacidade = 3370;
        computadores[1].hardwareBasico[1].nome = "Memoria RAM";
        computadores[1].hardwareBasico[1].capacidade = 16;
        computadores[1].hardwareBasico[2].nome = "HD";
        computadores[1].hardwareBasico[2].capacidade = 1000;
        computadores[1].addMemoriaUSB(usb2);

        computadores[2] = new Computador(7737,"Dell");
        computadores[2].hardwareBasico[0] = new HardwareBasico();
        computadores[2].hardwareBasico[1] = new HardwareBasico();
        computadores[2].hardwareBasico[2] = new HardwareBasico();

        computadores[2].sistemaOperacional.nome = "Windows 10";
        computadores[2].sistemaOperacional.tipo = 64;
        computadores[2].hardwareBasico[0].nome = "Pentium Core i7";
        computadores[2].hardwareBasico[0].capacidade = 4500;
        computadores[2].hardwareBasico[1].nome = "Memoria RAM";
        computadores[2].hardwareBasico[1].capacidade = 32;
        computadores[2].hardwareBasico[2].nome = "HD";
        computadores[2].hardwareBasico[2].capacidade = 2000;
        computadores[2].addMemoriaUSB(usb3);


        Cliente cliente = new Cliente();

        // cliente.computadores = computadores; -> isso seria uma agregação, colocar o array de computadores completo em cliente

        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, seja bem-vindo à PCMania! \n Por favor, digite seus dados:");
        System.out.print("Nome: ");
        cliente.nome = sc.next();
        System.out.print("CPF: ");
        cliente.cpf = sc.nextLong();

        System.out.println("Quais itens da promoção você gostaria de levar hoje?");
        System.out.println("Digite:\n 0-Sair \n 1-Promoção 1 \n 2-Promoção 2 \n 3- Promoção 3");
        int entrada = sc.nextInt();
        int i=0;
        while(entrada != 0){
            //LOGICA DA ESCOLHA DOS PRODUTOS E ASSOCIACAO
            //(associação porque eu escolho os elementos de computadores que vão para cliente

            if (entrada == 1){
                cliente.computadores[i] = computadores[0];
            }
            else if (entrada == 2){
                cliente.computadores[i] = computadores[1];
            }
            else if (entrada == 3){
                cliente.computadores[i] = computadores[2];
            }
            System.out.println("Digite:\n 0-Sair \n 1-Promoção 1 \n 2-Promoção 2 \n 3- Promoção 3");
            entrada = sc.nextInt();
            i++;
        }

        for(int j=0;j<cliente.computadores.length;j++){
            if(cliente.computadores[j] != null){
                cliente.computadores[j].mostraPCConfigs();

            }

        }
        cliente.mostraInfo();
        System.out.println("Total da compra: R$"+cliente.calculaTotalCompra()+"0");
    }
}