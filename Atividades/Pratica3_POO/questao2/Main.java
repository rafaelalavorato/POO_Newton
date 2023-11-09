package br.com.questao2;

public class Main {
    public static void main(String[] args) {

        SalarioFixo s1 = new SalarioFixo("Rafaela", 5000, 123);
        System.out.println(s1.toString());

        Comissao c1 = new Comissao("Flavio", 3000, 1234, 5, 100);
        System.out.println(c1.toString());

        Produtividade p1 = new Produtividade("Junior", 2500, 12345, 5, 1000 );
        System.out.println(p1.toString());
    }
}
