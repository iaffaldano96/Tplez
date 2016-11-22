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
public class ElencoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Chiedere nomi e scrivere elenco con For
        
        String in, foglio="";
        int i;
        
        in= JOptionPane.showInputDialog("Quante persone ci sono?");
        int quanti=Integer.parseInt(in);
        
        //ciclo for
        for(i=0;i<quanti;i++){
            in = JOptionPane.showInputDialog("Inserisci il tuo nome:\n[Premere exit o solo invio per smettere di inserire]");
           foglio+= (i+1)+"- "+in+"\n";
            
        }
        JOptionPane.showMessageDialog(null, foglio);
  
        /*do{
            
            in = JOptionPane.showInputDialog("Inserisci il tuo nome:\n[Premere exit o solo invio per smettere di inserire]");
            if(!(in.equalsIgnoreCase("exit") || in.equalsIgnoreCase("") || in.equalsIgnoreCase(" ") )){
               foglio=foglio+ num+"- "+in+"\n";
               num++;
            }
        }        
        while(!(in.equalsIgnoreCase("exit") || in.equalsIgnoreCase("") ));  */
        
    }
    
}
