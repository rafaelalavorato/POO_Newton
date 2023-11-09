package questao4;

public abstract class FabricanteCelular implements Celular {
    private double preco;
    
    public FabricanteCelular(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public boolean enviarMensagem() {
        // Implementação comum para enviar mensagem
        return true;
    }
    
    @Override
    public boolean acessarInternet() {
        // Implementação comum para acessar a Internet
        return true;
    }
    
    @Override
    public boolean acessarEmails() {
        // Implementação comum para acessar emails
        return true;
    }
    
    @Override
    public boolean verificarSistemaArquivos() {
        // Implementação comum para verificar o sistema de arquivos
        return true;
    }
}
