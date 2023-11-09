public class EmpregadoFaculdade {
    private String nome;
    private double salario;
    private int horas;

    public EmpregadoFaculdade(String nome, double salario, int horas) {
        this.nome = nome;
        this.salario = salario;
        this.horas = horas;
    }

    public double getGastos() {
        return this.salario + (40 * this.horas);
    }

    public String getInfo() {
        double salarioTotal = this.salario + (40 * this.horas);
        return "Nome: " + this.nome + " com salário: R$" + salarioTotal;
    }

    public static void main(String[] args) {
        EmpregadoFaculdade empregado = new EmpregadoFaculdade("João", 2000.0, 10);

        System.out.println("Gastos do empregado: R$" + empregado.getGastos());
        System.out.println(empregado.getInfo());
    }
}