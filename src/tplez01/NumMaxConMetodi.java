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
public class NumMaxConMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Quanti numeri?");
        int n_num = Integer.parseInt(input);
        
        int nume[]=new int[n_num];
        
        for(int i=0;i<nume.length;i++){
            input = JOptionPane.showInputDialog("Scrivi numero");
            nume[i] = Integer.parseInt(input);
        }
        
        String report="";
        for(int i=0;i<nume.length;i++){
            report+=nume[i]+"\n";
        }
        System.out.println(report);
        int max=nume[0];
        for(int i=1;i<nume.length;i++){
            if(nume[i]>max){
                max=nume[i];
            } 
        }
        System.out.println("Il numero maggiore è: "+max);
        
    }
    
    /*static int numMax(){
        
    }*/
    
}
