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
public class Tplez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dichiarazione variabili
        String num1;
        String num2;
        int conto = 0;
        //caricare i dati[input]
        num1=JOptionPane.showInputDialog("Primo numero:");    
        num2=JOptionPane.showInputDialog("Secondo numero:");
        
        //faccio conto totale[elaborazione]
        try{
            conto = Integer.parseInt(num1) + Integer.parseInt(num2);
            //stampo il conto[output]
            if(conto>=150)
                JOptionPane.showMessageDialog(null,"OTTIMO TOTALE: "+ conto);
            else
                JOptionPane.showMessageDialog(null, "PESSIMO TOTALE: "+ conto);
        }
        catch(Exception errore){
            JOptionPane.showMessageDialog(null,"Scrivi meglio la prossima volta\nMi hai scritto: " + num1 + " - " + num2);
        }
    }    
}

