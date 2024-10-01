package Aplicativos;
public class TelegramMessenger extends ServicoDeMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Você está online agora");
        System.out.println("Enviando mensagem pelo Telegram");
    }
    
    public void receberMensagem() {
        System.out.println("Nova mensagem Telegram");
    }
}