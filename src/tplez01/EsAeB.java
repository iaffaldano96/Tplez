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
public class EsAeB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //confronta due numeri
        String fine;
        //int a= Integer.parseInt(JOptionPane.showInputDialog("Dimmi a");
        String n1= JOptionPane.showInputDialog("Primo numero:");
        int a=Integer.parseInt(n1);
        String n2= JOptionPane.showInputDialog("Secondo numero:");
        int b=Integer.parseInt(n2);
        if(a>b)
            fine=" maggiore di ";
        else{
            if(a==b)
                fine=" uguale a ";
            else
                fine=" minore di ";
        }
        JOptionPane.showMessageDialog(null,"Risultato: "+a+" è"+fine+b);
    }
}
