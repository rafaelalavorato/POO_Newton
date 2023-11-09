package questao3;
import java.util.ArrayList;

class Artigo {
    private String titulo;
    private String resumo;
    private String autores;

    public Artigo(String titulo, String resumo, String autores) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}

class Edicao {
    private int numero;
    private int volume;
    private String dataEdicao;
    private int tiragem;
    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, String dataEdicao, int tiragem) {
        this.numero = numero;
        this.volume = volume;
        this.dataEdicao = dataEdicao;
        this.tiragem = tiragem;
        this.artigos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void adicionaArtigo(Artigo artigo) {
        artigos.add(artigo);
    }
}

class RevistaCientifica {
    private String titulo;
    private long issn;
    private String periodicidade;
    private ArrayList<Edicao> edicoes;

    public RevistaCientifica(String titulo, long issn, String periodicidade) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
        this.edicoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public void adicionaEdicao(Edicao edicao) {
        edicoes.add(edicao);
    }
}

