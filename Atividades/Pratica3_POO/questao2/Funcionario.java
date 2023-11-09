package br.com.questao2;
// cadastrar os funcionários de uma empresa e calcular os proventos devidos a cada um deles por mês de trabalho
public abstract class Funcionario { // abstrata não cria objetos -> classe mãe abstrata e as filhas classe concreta
    private String nome;
    private double salario;
    private int matricula;

    public Funcionario(String nome, double salario, int matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double calcularProventos() {
        return getSalario();
    }

    public String toString() {
        return "Funcionario: " +
                "Nome='" + getNome() + "\n" +
                ", Salario=" + getSalario() + "\n" +
                ", Matricula=" + getMatricula()+
                '}';
    }
}

