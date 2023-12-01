package AV2_POO;

public class PedidoItem {
    private String nomeEvento;
    private int qtdeIngresso;
    private double precoIngresso;

    // Construtor
    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }
    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }
    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public boolean atualizarEstoqueIngresso(Evento evento, int novaQuantidade) {
        if (evento != null) {
            evento.setQtdIngressos(novaQuantidade);
            return true;
        }
        return false;
    }
}
