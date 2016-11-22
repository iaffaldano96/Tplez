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
public class Esercizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Quanti alunni?");
        int n_num = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Qual è il voto minimo per essere promosso?");
        int minimo = Integer.parseInt(input);

        String nomi[] = new String[n_num];
        int voti[] = new int[n_num];
        double media = 0;
        for (int i = 0; i < nomi.length; i++) {
            input = JOptionPane.showInputDialog("Inserire nome");
            nomi[i] = input;
            input = JOptionPane.showInputDialog("Inserire voto");
            n_num = Integer.parseInt(input);
            voti[i] = n_num;
            media += voti[i];
        }

        String report = "";
        for (int i = 0; i < voti.length; i++) {
            if (voti[i] >= minimo) {
                report += nomi[i] + " - " + voti[i] + " - Promosso\n";
            } else {
                report += nomi[i] + " - " + voti[i] + " - Bocciato\n";
            }
        }
        System.out.println(report);

        String input2 = "";
        int max =voti[0], min = voti[0], i;
        for (i = 0; i < nomi.length; i++) {
            if (voti[i] > max) {
                max = voti[i];
                input = nomi[i];
            } else {
                if(voti[i]<min){
                    min = voti[i];
                    input2 = nomi[i];
                }    
            }
        }
        media = media / voti.length;
        System.out.println("Persona con voto più alto: " + input + " - " + max + "\nPersona con voto più basso: " + input2 + "  - " + min + "\nVoto medio: " + media);

    }
}
