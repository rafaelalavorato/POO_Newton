import java.util.Scanner;

public class Notas {
    private String nome;
    private int matricula;
    private double notaAV1;
    private double notaAV2;
    private double notaAE;
    private String curso;
    private int periodo;

    public Notas(String nome, int matricula, double notaAV1, double notaAV2, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.curso = curso;
        this.periodo = periodo;
    }

    public void alteraNotaAV1(double novaNotaAV1) {
        this.notaAV1 = novaNotaAV1;}

    public void alteraNotaAV2(double novaNotaAV2) {
        this.notaAV2 = novaNotaAV2;}

    public void alteraNotaAE(double novaNotaAE) {
        this.notaAE = novaNotaAE;}

    public void avaliarAluno() {
        double somaNotasAV = notaAV1 + notaAV2;
        if (somaNotasAV >= 60) {
            System.out.println(nome + " está Aprovado.");
        } else {
            System.out.println(nome + " está em Recuperação.");
        }
    }

    public void avaliarRecuperacao(double notaAE) {
        double media = (notaAV1 + notaAV2 + notaAE) / 3;
        if (media >= 60) {
            System.out.println(nome + " está Aprovado na Recuperação.");
        } else {
            System.out.println(nome + " está Reprovado na Recuperação.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a matrícula do aluno: ");
        int matricula = scanner.nextInt();

        System.out.print("Informe a nota da AV1 do aluno: ");
        double notaAV1 = scanner.nextDouble();

        System.out.print("Informe a nota da AV2 do aluno: ");
        double notaAV2 = scanner.nextDouble();

        System.out.print("Informe o curso do aluno: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        String curso = scanner.nextLine();

        System.out.print("Informe o período do aluno: ");
        int periodo = scanner.nextInt();

        Notas aluno = new Notas(nome, matricula, notaAV1, notaAV2, curso, periodo);

        System.out.println("\nSituação do aluno:");
        aluno.avaliarAluno();

        System.out.print("\nInforme a nota da AE do aluno (caso necessário): ");
        double notaAE = scanner.nextDouble();
        aluno.alteraNotaAE(notaAE);

        System.out.println("\nSituação do aluno após a Recuperação:");
        aluno.avaliarRecuperacao(notaAE);

        scanner.close();
    }
}