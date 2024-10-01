package Aplicativos;
public abstract class ServicoDeMensagemInstantanea {
    //Emcapsular = aglomerar algumas funcionalidades que so funcionam dentro da classe
    public void enviarMensagem() {
        //método
        validarConectadoInternet();
        
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
       
    }
    //métodos protected só são visiveis arquivos de mesmo pacote!
    protected void validarConectadoInternet() {
        System.out.println("Validando conexão de internet...");
        
    }
    private void salvarHistoricoMensagem() {
       
    }

}
