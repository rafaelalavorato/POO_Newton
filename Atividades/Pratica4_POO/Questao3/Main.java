package Questao3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DistribuicaoAlimento alimento = new DistribuicaoAlimento("Na rua", "ajuda comnuitária", "BH",
                "28/09/2023", "29/09/2023", "arroz com feijão", 100);
        TrabalhoVoluntario voluntario = new TrabalhoVoluntario("Ajuda", "distribuição de agasalhos",
                "BH", "28/09/2023", "29/09/2023", "Voluntário", 5);
        System.out.println(alimento.imprimeProjeto());
        System.out.println(voluntario.imprimeProjeto());


    }
}
