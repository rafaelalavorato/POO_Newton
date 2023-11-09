package br.com.questao2;

public class SalarioFixo extends Funcionario{
    public SalarioFixo(String nome, double salario, int matricula) {
        super(nome, salario, matricula);
    }

    public double calcularProventos() {
        return getSalario();
    }
}

