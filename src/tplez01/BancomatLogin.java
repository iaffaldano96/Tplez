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
public class BancomatLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //variabili
        String input, in,esc="1234", psw="007";
        boolean b_acceso = true;
        int conto_banc=0;
        //cicli login
        do {
            //input= JOptionPane.showInputDialog("Inserisci i tuoi dati:");
            //input= JOptionPane.showInputDialog("Inserisci il tuo nome:");
            in = JOptionPane.showInputDialog("Inserisci la tua psw oppure 1234 per uscire:");
            if (in.equalsIgnoreCase(esc))
                b_acceso = false;
            else {
                if (in.equalsIgnoreCase(psw)){
                    JOptionPane.showMessageDialog(null, "Codice bancomat giusto");
                    //ciclio operazioni
                    boolean altre_op=true;
                    JOptionPane.showMessageDialog(null, "Saldo attuale: " + conto_banc);
                    while(altre_op==true){
                        //outpu per ogni operazione
                        String risultato="Hai chiesto cose sbaglliate. Riprova";
                        in= JOptionPane.showInputDialog("Vuoi fare v p o x per le operazioni?");
                        
                        //controllo cosa fare
                        if(in.equalsIgnoreCase("x")){
                            altre_op=false;
                            risultato="Arrivederci";
                        }
                        
                        if(in.equalsIgnoreCase("v")){
                            in = JOptionPane.showInputDialog("Saldo attuale: " + conto_banc + "\nQuanti soldi versi?");
                            int num = Integer.parseInt(in);
                            conto_banc = conto_banc + num;
                            risultato= "Versamento effettutato: "+num+"\nSaldo attuale: "+conto_banc;
                        }
                        
                        if(in.equalsIgnoreCase("p")){
                            input = JOptionPane.showInputDialog("Quanto vorresti prelevare?");
                            int pre = Integer.parseInt(input);
                            if (pre > conto_banc) {
                                risultato = "Il tuo saldo è di: " + conto_banc + ".\nImpossibile prelevare questa somma";
                            }
                            else {
                                conto_banc = conto_banc - pre;
                                risultato = "Hai prelevato: " + pre + " euro.\nIl saldo attuale è di: " + conto_banc;
                            }
                            
                        }
                        //faccio veedre il risultato ogni volta hce faccio un'operazione
                        JOptionPane.showMessageDialog(null, risultato);
                    }// fine while
                }
                else{
                    JOptionPane.showMessageDialog(null, "Codice errato. Ritenta.\n Dopo 5 tentativi si spegnerà automaticamente");
                    
                }
                
            }
        }
        while (b_acceso == true);
    }

}
