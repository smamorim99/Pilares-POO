import Aplicativos.FacebookMessenger;
import Aplicativos.MSNMessenger;
import Aplicativos.ServicoDeMensagemInstantanea;
import Aplicativos.TelegramMessenger;

public class Computador {
    public static void main(String[] args) {
        ServicoDeMensagemInstantanea smi = null;

            String appEscolhido = "Telegram";
                
                if (appEscolhido.equals("MSN")) 
                    smi = new MSNMessenger();
                
                    else if(appEscolhido.equals("Messenger"))
                        smi = new FacebookMessenger();
                    
                else if (appEscolhido.equals("Telegram")) 
                    smi = new TelegramMessenger();
                    //System.out.println("Abrindo o aplicativo Telegram");
        
                    smi.enviarMensagem();
                    smi.receberMensagem();
    }

}
