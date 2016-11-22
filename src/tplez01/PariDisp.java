/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class PariDisp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String risultato;
        String num= JOptionPane.showInputDialog("Inserisci il numero:");
        boolean raccomandato=true;
        int numi=Integer.parseInt(num);
        int resto=numi%2;
        if(resto==0)
            risultato="pari";
        else
            risultato="dispari";
        System.out.println("Risultato: "+num+" è "+risultato);
        
        if(resto==0 && numi<6)
            risultato="Vince pari";
        else{
            if(resto!=0 && numi<6)
                risultato="Vince dispari";
            else
                risultato="Si gioca con una mano, non due";
        }
        System.out.println("Risultato: "+risultato);
        
        if((numi>=0 && numi<6) || raccomandato== true)
            risultato="Partita validissima!";
        else
            risultato="Partita truccata!";
        System.out.println("Risultato: "+risultato);

    }
}
