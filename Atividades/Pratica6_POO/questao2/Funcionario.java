package questao2;

	public class Funcionario extends Pessoa {
		protected String departamento;
		protected double salario;
	    protected String dataEntrada;
	    protected String rg;
	    protected boolean estaNaEmpresa;

	    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada, String rg) {
	        super(nome, email, telefone);
	        this.departamento = departamento;
	        this.salario = salario;
	        this.dataEntrada = dataEntrada;
	        this.rg = rg;
	        this.estaNaEmpresa = true;
	    }
	    
		public String getTelefone() {
			// TODO Auto-generated method stub
			return null;
		}


		public String getEmail() {
			// TODO Auto-generated method stub
			return null;
		}


		public String getNome() {
			// TODO Auto-generated method stub
			return null;
		}
	   
		public void bonificar(double valor) {
	        this.salario += valor;
	    }

	    public void demitir() {
	        this.estaNaEmpresa = false;
	    }

	    public void mostrarDados() {
	        System.out.println("Nome: " + getNome());
	        System.out.println("Email: " + getEmail());
	        System.out.println("Telefone: " + getTelefone());
	        System.out.println("Departamento: " + departamento);
	        System.out.println("Salário: " + salario);
	        System.out.println("Data de Entrada: " + dataEntrada);
	        System.out.println("RG: " + rg);
	        System.out.println("Está na Empresa: " + (estaNaEmpresa ? "Sim" : "Não"));
	    }

}

