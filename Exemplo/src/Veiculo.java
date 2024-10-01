public abstract class Veiculo {
    //Exemplo HERANÇA: classe responsável por compartilhar aspectos comuns a uma aplicação
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    //ExemploAbstração: ações que podem se extender a outras classes, mas que não funcionam do mesmo modo
    public abstract void ligar();
}
