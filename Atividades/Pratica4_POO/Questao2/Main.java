package Questao2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(); // cria o objeto cc vazio do tipo ContaCorrente
        cc.depositar(1200.20); // chama o método depositar
        cc.sacar(300); // chama o método sacar

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.50);
        cp.sacar(25);

        GeradorExtratos gerador = new GeradorExtratos(); 
        gerador.gerarConta(cc); // recebe a conta corrente e retorna o getsaldo
        gerador.gerarConta(cp);
    }
}
