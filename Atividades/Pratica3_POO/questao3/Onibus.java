package br.com.questao3;

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int eixos) {
        this.assentos = eixos;
    }

    public void exibirDados () {
        System.out.println("Dados do veículo: Placa: " + getPlaca() + ", ano: " + getAno() + " e assentos: " + getAssentos());
    }
}
