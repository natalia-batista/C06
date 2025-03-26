public class Computador {
    public String marca;
    public float preco;
    public SistemaOperacional sistemaOperacional;
    public HardwareBasico[] hardwareBasico;
    public MemoriaUSB memoriaUSB;

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo +" bits");
        for(int i= 0; i<hardwareBasico.length; i++){
            System.out.println("Dispositivo: " + hardwareBasico[i].nome +" Capacidade: " + hardwareBasico[i].capacidade);
            System.out.println();
        }
    }

    void addMemoriaUSB(MemoriaUSB musb){
        memoriaUSB = musb;
    }

    public Computador(float preco, String marca) {
        this.preco = preco;
        this.marca = marca;
        sistemaOperacional = new SistemaOperacional();
        this.hardwareBasico = new HardwareBasico[3];
    }

}
