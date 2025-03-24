package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nave nave = new Nave("Coracao de Ouro", 10, "Normal");
        Asteroide asteroide = new Asteroide("B12", "Grande");

        nave.atirar(asteroide);
    }
}