public class Cantina {
    String nome;
    Salgado []salgados = new Salgado[3];

    void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if(salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }
    void mostraInfo(){
        System.out.println("Nome: "+ nome);
        for(Salgado atual : salgados){
            System.out.println(atual.nome);
        }
    }
}
