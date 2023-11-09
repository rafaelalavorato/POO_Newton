package questao2;

public class Empresa {
	protected String nome;
	protected String cnpj;
	protected int qtdeDeFuncionarios;
	protected Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeDeFuncionarios = 0;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeDeFuncionarios < 100) {
            funcionarios[qtdeDeFuncionarios] = funcionario;
            qtdeDeFuncionarios++;
        } else {
            System.out.println("A capacidade máxima de funcionários foi atingida.");
        }
    }
}
