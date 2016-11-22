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
public class Esponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String input=JOptionPane.showInputDialog("Inserisci il numero base");
        int base=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Quante potenze vuoi?");
        int esp=Integer.parseInt(input);
        int num=1;
        int nume[]= new int[esp];
        nume[0]=base;
        for(int i=1;i<nume.length;i++){
           // num=num*base;
            //nume[i]=num;
            nume[i]=nume[i-1]*base;
        }
        String report="";
        for(int i=1 ;i<nume.length;i=i+2){
            report=report+base+"^"+(i+1)+"= "+nume[i]+"\n";
        }
        System.out.println(report);
    }
    
}
