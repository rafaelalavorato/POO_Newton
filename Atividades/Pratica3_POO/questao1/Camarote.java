package br.com.questao1;
// Crie uma classe Camarote, que herda Ingresso e possui a localização do camarote e um valor adicional.
//Crie o construtor dessa classe com o valor do ingresso, valor adicional e localização do camarote

public class Camarote extends Ingresso{
    private double valorAdicional;
    private String localizacao;

    public Camarote(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeIngresso() {
        System.out.println("Valor do ingresso Camarote = R$ " +
                (getValorIngresso() + getValorAdicional() + ", localização " + getLocalizacao()));
    }
}
