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
public class ArreyBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Quanti oggi?");
        int max = Integer.parseInt(input);
        String nomi[] = new String[max];
        int anni[] = new int[max];

        for (int i = 0; i < nomi.length; i++) {
            int mancano = nomi.length - i;
            input = JOptionPane.showInputDialog("Come ti chiami? [-" + mancano + "]");
            nomi[i] = input;
            input = JOptionPane.showInputDialog("In che anno sei nato? [-" + mancano + "]");
            anni[i] = Integer.parseInt(input);

        }
        //con html
        String reportHTML = "";
        reportHTML = "<table>";
        for (int i = 0; i < nomi.length; i++) {
            reportHTML = "<tr><td>" + nomi[i] + "</td></tr>";
        }
        reportHTML = "<table>";
        System.out.println(reportHTML);

        System.out.println();

        //con java normale
        String report = "";
        for (int i = 0; i < nomi.length; i++) {
            report += (i + 1) + "# " + anni[i] + " - " + nomi[i] + "\n";
        }
        System.out.println(report);

    }

}
