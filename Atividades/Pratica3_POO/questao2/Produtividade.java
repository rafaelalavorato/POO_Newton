package br.com.questao2;

public class Produtividade extends Funcionario{
    private double valor;
    private int producao;

    public Produtividade(String nome, double salario, int matricula, double valor, int producao) {
        super(nome, salario, matricula);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public double calcularProventos() {
        return  (getSalario() + (getValor() * getProducao()) );
    }

    public String toString() {
        return "Funcionario: " +
                "Nome='" + getNome() + "\n" +
                ", Salario=" + calcularProventos() + "\n" +
                ", Matricula=" + getMatricula() +
                '}';
    }
}
