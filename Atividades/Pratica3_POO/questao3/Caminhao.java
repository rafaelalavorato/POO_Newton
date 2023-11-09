package br.com.questao3;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public void exibirDados () {
        System.out.println("Dados do veículo: Placa: " + getPlaca() + ", ano: " + getAno() + " e números de eixos: " + getEixos());
    }
}