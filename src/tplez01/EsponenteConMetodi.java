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
public class EsponenteConMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
        int base= getQuanti("Inserisci numero base", 1, 12);
        int esp= getQuanti("Max esponente?", 1, 12);
        //int num=1;
        int nume[]= new int[esp];
        
        //perché uso i-1 nel for, quindi inizializzo
        nume[0]=base;
        
        for(int i=1;i<esp;i++){
           // num=num*base;
            //nume[i]=num;
            nume[i]=nume[i-1]*base;
        }
        //con metodo
        for(int i=1;i<esp;i++){
            nume[i]=potenza(base,i);
        }
        //output 
        String report="";
        for(int i=1 ;i<esp;i=i+2){
            report+=base+"^"+(i+1)+"= "+nume[i]+"\n";
        }
        System.out.println(report);
        int ris=potenza(base, esp);
        System.out.println("Calcolo potenza:"+ris);
    }
    
    static int getQuanti(String titolo, int min, int max){
        boolean ok=false;
        int quanti=0;
        while(ok==false){
            String input= JOptionPane.showInputDialog(titolo);
            try{
                quanti=Integer.parseInt(input);
                if(quanti>=min && quanti<=max)
                    ok=true;
            }
            catch (Exception e){
                    ok=false;
            }
            if(!ok)
                JOptionPane.showMessageDialog(null, "Dati errati o fuori range ("+min+".."+max+")");
        }
        return quanti;
    }
    
    static int potenza(int b, int e){
        int ris=1;
        for(int i=0;i<e;i++){
            ris=ris*b;
        }
        return ris;
    }
}
