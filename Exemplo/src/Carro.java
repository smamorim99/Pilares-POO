public class Carro extends Veiculo{
    //Exemoplo de Encapsulamento: açoes que deven ficar visiveis somente a clase ao qual pertencem
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
