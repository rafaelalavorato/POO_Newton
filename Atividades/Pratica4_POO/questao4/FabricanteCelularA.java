package questao4;

public class FabricanteCelularA extends FabricanteCelular {
    private boolean temTV;
    
    public FabricanteCelularA(boolean temTV, double preco) {
        super(preco);
        this.temTV = temTV;
    }
    
    public boolean isTemTV() {
        return temTV;
    }
    
    public void setTemTV(boolean temTV) {
        this.temTV = temTV;
    }
    
    @Override
    public void ligarDesligarCelular(boolean ligado) {
        // Implementação específica para ligar/desligar celular
    }
    
    @Override
    public void usarCamera(boolean usar) {
        // Implementação específica para usar a câmera
    }
    
    @Override
    public void usarFoneDeOuvido(boolean usar) {
        // Implementação específica para usar o fone de ouvido
    }
    
    @Override
    public void controlarVolume(boolean aumentar) {
        // Implementação específica para controlar o volume
    }
}
