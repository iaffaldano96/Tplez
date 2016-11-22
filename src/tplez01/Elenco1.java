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
public class Elenco1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Chiedere nomi e scrivere elenco
        
        String in, risultato="";
        
        int num=1;
        
        do{
            
            in = JOptionPane.showInputDialog("Inserisci il tuo nome:\n[Premere exit o solo invio per smettere di inserire]");
            if(!(in.equalsIgnoreCase("exit") || in.equalsIgnoreCase("") || in.equalsIgnoreCase(" ") )){
               risultato=risultato+ num+"- "+in+"\n";
               num++;
            }
        }        
        while(!(in.equalsIgnoreCase("exit") || in.equalsIgnoreCase("") ));  
        JOptionPane.showMessageDialog(null, risultato);
    }
    
}
