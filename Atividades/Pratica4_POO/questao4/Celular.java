package questao4;

public interface Celular {
void ligarDesligarCelular(boolean ligado);
void usarCamera(boolean usar);
void usarFoneDeOuvido(boolean usar);
void controlarVolume(boolean aumentar);

boolean enviarMensagem();
boolean acessarInternet();
boolean acessarEmails();
boolean verificarSistemaArquivos();
}

