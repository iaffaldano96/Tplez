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
public class SoldiInBanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String input, risultato;
        double conto = 0,num, pre;
        
        input = JOptionPane.showInputDialog("Saldo attuale: "+conto+"\nQuanti soldi versi?");
        num = Double.parseDouble(input);
        conto = conto+num;
        input = JOptionPane.showInputDialog("Saldo attuale: "+conto+"\nQuanti soldi versi?");
        num = Double.parseDouble(input);
        conto = conto+num;
        input = JOptionPane.showInputDialog("Saldo attuale: "+conto+"\nQuanti soldi versi?");
        num = Double.parseDouble(input);
        conto = conto+num;
        input = JOptionPane.showInputDialog("Saldo attuale: "+conto+"\nQuanti soldi versi?");
        num = Double.parseDouble(input);
        conto = conto+num;

        input = JOptionPane.showInputDialog("Quanto vorresti prelevare?");
        pre = Double.parseDouble(input);
        
        if (pre>conto) {
            conto = (Math.floor(conto * 100)) / 100;
            risultato="Il tuo saldo è di: " + conto + ".\nImpossibile prelevare questa somma";
        } 
        else {
            conto=conto-pre;
            conto = (Math.floor(conto * 100)) / 100;
            risultato="Hai prelevato: " + pre + " euro.\nIl tuo saldo attuale è di: " + conto;
        }
        JOptionPane.showMessageDialog(null, risultato);
    }

}
