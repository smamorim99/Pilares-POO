package Estabelecimento;

import Equipamentos.Impressao.Impressora;
import Equipamentos.Multifuncao.Multifuncional;
import Equipamentos.Copias.Copiadora;
import Equipamentos.Digitalizacao.Digitalizadora;


public class Fabrica {
public static void main(String[] args) {
    Multifuncional em = new Multifuncional();
    Impressora Impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em; 
        
        Impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
      


    
}
}
