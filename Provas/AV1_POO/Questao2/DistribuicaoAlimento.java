package Questao2;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String datainicio,
                                String datafim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }
    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }
    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        setNomeProjeto(nomeProjeto);
        if (getDatafim() == "")
            return true;
        else
            return false;
    }

    public String imprimeProjeto() {
        return "Projeto Distribuição de Alimentos:\n" +
                "Nome do Projeto: " + getNomeProjeto() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Data de Início: " + getDatainicio() + "\n" +
                "Data de Fim: " + getDatafim() + "\n" +
                "Descrição do Alimento: " + getDescAlimento() + "\n" +
                "Quantidade de Alimento: " + getQtde();
    }
}