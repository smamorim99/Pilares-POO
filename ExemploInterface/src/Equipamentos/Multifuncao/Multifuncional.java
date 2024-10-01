package Equipamentos.Multifuncao;

import Equipamentos.Copias.Copiadora;
import Equipamentos.Digitalizacao.Digitalizadora;
import Equipamentos.Impressao.Impressora;

public class Multifuncional implements Impressora, Copiadora, Digitalizadora {

    @Override
    public void copiar(){ 
        System.out.println("Copia via MULTIFUNCIONAL");       
    }
    public void digitalizar(){
        System.out.println("Digitalizando via MULTIFUNCIONAL");
    }
    public void imprimir(){
        System.out.println("Imprimindo via MULTIFUNCIONAL");
    }
 
}
