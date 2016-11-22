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
public class Tabelline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in, foglio="";
        
        in= JOptionPane.showInputDialog("Di quale numero vuoila tebellina?");
        int tab=Integer.parseInt(in);
        in= JOptionPane.showInputDialog("Fino a che numero vuoi la tabellina?");
        int num =Integer.parseInt(in);

        
        for(int i=0;i<num;i++){
            
            foglio+=tab+" x "+(i+1)+"= "+(tab*(i+1))+"\n";
        }
        JOptionPane.showMessageDialog(null, foglio);

    }
    
}
