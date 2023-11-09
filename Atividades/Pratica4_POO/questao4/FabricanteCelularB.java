package questao4;

public class FabricanteCelularB extends FabricanteCelular {
    private boolean temRadio;
    
    public FabricanteCelularB(boolean temRadio, double preco) {
        super(preco);
        this.temRadio = temRadio;
    }
    
    public boolean isTemRadio() {
        return temRadio;
    }
    
    public void setTemRadio(boolean temRadio) {
        this.temRadio = temRadio;
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
