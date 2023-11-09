package questao1;

import java.util.ArrayList;

	public class Main{
		protected String dataCriacao;
	    protected  String nomeUsuario;
	    protected String dataNascimento;
	    protected String senha;
	    protected ArrayList<Publicacao> publicacoes = new ArrayList<>();

	    public Main(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
	        this.dataCriacao = dataCriacao;
	        this.nomeUsuario = nomeUsuario;
	        this.dataNascimento = dataNascimento;
	        this.senha = senha;
	    }

	    public void inserePublicacao(Publicacao publi) {
	        publicacoes.add(publi);
	    }

	    public void imprimePublicacoes() {
	        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
	        for (Publicacao publi : publicacoes) {
	            System.out.println("Data de Publicação: " + publi.getDataPublicacao());
	            System.out.println("Texto da Publicação: " + publi.getTextoPublicacao());
	            System.out.println("Link de Mídia: " + publi.getLinkMidia());
	            System.out.println();
	        }
	    }
}