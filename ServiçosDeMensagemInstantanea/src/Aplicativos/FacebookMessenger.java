package Aplicativos;
public class FacebookMessenger extends ServicoDeMensagemInstantanea {
    @Override
    public void enviarMensagem() { 
        validarConectadoInternet();
        System.out.println("Você está online agora");
        System.out.println("Enviando Mensagem pelo Messenger");
    }
    public void receberMensagem(){
        System.out.println("Nova mensagem no Messenger!");
    }
}
