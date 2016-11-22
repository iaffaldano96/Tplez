/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

/**
 *
 * @author tss
 */
public class SommaProdConMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=2, b=3, c=4; 
        int somma,prodotto;
        //richiamo i metodi
        somma=getSomma(a,b,c);
        prodotto=getProdotto(a,b,c);
        
        //stampo
        System.out.println("La somma dei numeri "+a+"-"+b+"-"+c+" è: "+somma+"\nIl prodotto dei numeri "+a+"-"+b+"-"+c+" è: "+prodotto);
    }
    
    //creo i due metodi che in entrambi mi ritorna un int
    static int getSomma(int x, int y, int z){
        //sommo
        int ris=x+y+z;
        return ris;
    }
    
    static int getProdotto(int x, int y, int z){
        //moltiplico
        int ris=x*y*+z;
        return ris;
    }
    
}
