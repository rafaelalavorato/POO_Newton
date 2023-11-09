package br.com.questao2;

public class Comissao extends Funcionario {
    private double percentual;
    private double vendas;

    public Comissao(String nome, double salario, int matricula, double percentual, double vendas) {
        super(nome, salario, matricula);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }
    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double calcularProventos() {
      return (getSalario() + (getPercentual() * getVendas() / 100) );
    }

    public String toString() {
        return "Funcionario: " +
                "Nome='" + getNome() + "\n" +
                ", Salario=" + calcularProventos() + "\n" +
                ", Matricula=" + getMatricula()+
                '}';
    }
}
