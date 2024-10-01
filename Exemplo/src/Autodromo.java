public class Autodromo {
public static void main(String[] args) {
    Carro jeep = new Carro();
    //Encapsulamento
        jeep.setChassi ("88555");     
        jeep.ligar();
    //exemplo Abstração e Polimorfismo
    //Abstração: simplificação de uma ação, retirando aspectos não importantes para a aplicação
    Moto z400 = new Moto();  
    z400.setChassi("56552");    
    z400.ligar();
    //Polimorfismo: adquire o comportamento da classe que a extende
    Veiculo coringa = z400;
    coringa.ligar();
}
}
