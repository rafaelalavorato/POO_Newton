package Questao2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ProjetoSocial {
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog("(1) Distribuição de Alimentos \n(2) Trabalho Voluntário \n(3) Sair");


        switch (opcao) {
            case "1":
                DistribuicaoAlimento alimento = new DistribuicaoAlimento("Alimento na Rua", "ajuda comunitária",
                        "em BH","05/10/2023", "10/10/2023", "arroz com feijão e farofa", 100);

                alimento.validaProjeto("Alimento na Rua");
                JOptionPane.showMessageDialog(null, alimento.imprimeProjeto());

                break;
                case "2":
                    TrabalhoVoluntario voluntario = new TrabalhoVoluntario("Ajuda Comunitária", "distribuição de agasalhos",
                            "em BH","05/10/2023", "10/10/2023", "voluntário", 5);
                    voluntario.validaProjeto("Ajuda Comunitária");
                    JOptionPane.showMessageDialog(null, voluntario.imprimeProjeto());
                    break;
                }
            }

        }
