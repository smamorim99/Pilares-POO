package Aplicativos;
public class MSNMessenger extends ServicoDeMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Você está online agora");
        System.out.println("Enviando mensagem pelo MSN");
    }
    
    public void receberMensagem() {
       System.out.println("Nova mensagem MSN!");
    }
    
  
}