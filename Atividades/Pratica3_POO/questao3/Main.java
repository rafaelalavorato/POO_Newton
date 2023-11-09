package br.com.questao3;

public class Main {
    public static void main(String[] args) {

      Onibus o1 = new Onibus("ZAB-4613", 2008, 44);
      o1.exibirDados();

      Caminhao c1 = new Caminhao("ZAB-4613", 2008, 2);
      c1.exibirDados();

    }
}
