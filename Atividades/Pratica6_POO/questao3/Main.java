package questao3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            artigos.add(new Artigo("Artigo " + i, "Resumo do Artigo " + i, "Autor " + i));
        }

        Edicao edicao = new Edicao(1, 1, "01/01/2023", 1000);

        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Minha Revista Científica", 1234567890, "Mensal");
        revista.adicionaEdicao(edicao);
    }
}