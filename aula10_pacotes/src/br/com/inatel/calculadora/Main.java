package br.com.inatel.calculadora;

import br.com.inatel.calculadora.soma.Soma;

public class Main {
    public static void main(String[] args) {
        //a classe main fica no pacote principal do projeto
        Soma s = new Soma();
        s.metodoA();
        System.out.println(s.getSaldo());
    }

}
