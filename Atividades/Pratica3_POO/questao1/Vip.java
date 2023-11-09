package br.com.questao1;
// Crie uma classe VIP, que herda Ingresso e possui um valor adicional.
// Crie o construtor dessa classe com o valor do ingresso e  um método que imprime o valor do ingresso com o adicional incluído
// e a mensagem "Ingresso VIP"

public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(double valorIngresso, double valorAdicional) {
        super(valorIngresso); // pegando o valor do ingresso e mandando para a class main
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeIngresso() {
        System.out.println("Valor do ingresso VIP = R$ " +
                (getValorIngresso() + getValorAdicional()));
    }
}
