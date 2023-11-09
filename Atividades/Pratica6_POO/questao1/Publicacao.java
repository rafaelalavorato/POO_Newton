package questao1;

	public class Publicacao {
		protected String dataPublicacao;
		protected  String textoPublicacao;
		protected  String linkMidia;
		protected  static double contadorPublicacao = 0;

	    public Publicacao(String dataPublicacao, String textoPublicacao, String linkMidia) {
	        this.dataPublicacao = dataPublicacao;
	        this.textoPublicacao = textoPublicacao;
	        this.linkMidia = linkMidia;
	        contadorPublicacao++;
	    }

	    public String getDataPublicacao() {
	        return dataPublicacao;
	    }

	    public String getTextoPublicacao() {
	        return textoPublicacao;
	    }

	    public String getLinkMidia() {
	        return linkMidia;
	    }

	    public static double getContadorPublicacao() {
	        return contadorPublicacao;
	    }

	    public void setTextoPublicacao(String textoPublicacao) {
	        this.textoPublicacao = textoPublicacao;
	    }

	    public void setLinkMidia(String linkMidia) {
	        this.linkMidia = linkMidia;
	    }
	}
