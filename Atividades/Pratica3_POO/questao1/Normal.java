package br.com.questao1;
// Crie uma classe Normal , que herda e crie o método que imprime o valor do ingresso com a mensagem "Ingresso Normal"

public class Normal extends Ingresso{
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }
    public void imprimeIngresso() {
        System.out.println("Valor do ingresso normal = R$"
                + getValorIngresso());
    }
}
