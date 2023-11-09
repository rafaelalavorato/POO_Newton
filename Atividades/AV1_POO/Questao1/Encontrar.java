package Questao1;

public class Encontrar {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Rafaela", "rafaela123@hotmail.com", "123456789");
        AchadoPerdido achadoPerdido = new AchadoPerdido("Rafaela Lavorato", "perdido celular da rafaela",
                "tipoIphone", "encontrado");
        achadoPerdido.buscarTitulo("Rafaela Lavorato");
        achadoPerdido.visualizarDetalhes();
    }
}

