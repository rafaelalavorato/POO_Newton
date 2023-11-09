package br.com.questao1;
// Crie uma classe chamada Ingresso que possui um valor em reais e o construtor dessa classe e os métodos Set e Get.

public class Ingresso {
    private double valorIngresso;
    public Ingresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    public double getValorIngresso() {
        return valorIngresso;
    }
    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}

