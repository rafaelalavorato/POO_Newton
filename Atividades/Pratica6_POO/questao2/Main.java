package questao2;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("João", "joao@email.com", "123456789", "TI", 5000.0, "01/01/2020", "123456789");
        funcionarios[1] = new Funcionario("Maria", "maria@email.com", "987654321", "RH", 4500.0, "02/02/2020", "987654321");
        funcionarios[2] = new Funcionario("Pedro", "pedro@email.com", "111222333", "Vendas", 5500.0, "03/03/2020", "111222333");
        funcionarios[3] = new Funcionario("Ana", "ana@email.com", "333444555", "Contabilidade", 4800.0, "04/04/2020", "333444555");
        funcionarios[4] = new Funcionario("Lucas", "lucas@email.com", "555666777", "Marketing", 5200.0, "05/05/2020", "555666777");

        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
            System.out.println();
        }

        Empresa empresa = new Empresa("Minha Empresa", "123456789");
        for (Funcionario funcionario : funcionarios) {
            empresa.adicionarFuncionario(funcionario);
        }
    }
}
