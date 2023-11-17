package Pratica7_POO;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String id_isbn, nm_titulo, cod_excluir, buscaTitulo;
        int id_categoria, id_editora;
        Double vl_preco, buscaValor;

        id_isbn = JOptionPane.showInputDialog("Digite ISDN");
        id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da categoria"));
        id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da editora"));
        nm_titulo = JOptionPane.showInputDialog("Digite titulo");
        vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preco do livro"));
        Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);

        cod_excluir = JOptionPane.showInputDialog("Digite ISBN para Excluir");
        Excluir excluir = new Excluir(cod_excluir);

        //Consulta titulo
        Consulta busca = new Consulta();
        buscaTitulo = JOptionPane.showInputDialog("Digite Titulo para buscar");
        busca.BuscaTitulo(buscaTitulo);

        //Consulta por valor
        buscaValor = Double.parseDouble(JOptionPane.showInputDialog("Digite Titulo para buscar"));
        busca.BuscaValor(buscaValor);
    }
}