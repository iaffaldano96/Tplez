package tplez01;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class Tplez01A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //dichiarare variabili
        final double PIGRECO = 3.1415;
        double costo_bi, raggio, costo_mc;
        String input, report;
        double area, volume_semi, utili, costi, ricavi, max_persone;

        //inserisco costo_mc
        input = JOptionPane.showInputDialog("Costo metrocubo:");
        costo_mc = Double.parseDouble(input);
        //chiedo costo presunto biglietto
        input = JOptionPane.showInputDialog("Costo biglietto:");
        costo_bi = Double.parseDouble(input);

        /*chiedi raggio
        input=JOptionPane.showInputDialog("Raggio:");
        raggio=Double.parseDouble(input);*/
        //preparo out
        report = "Report Finale\n";
        report = report + "Costo metrocubo:" + costo_mc + "\n";
        report = report + "Costo biglietto:" + costo_bi + "\n";

        //inizio elaborazione
        raggio = 6;
        report=calcolaUtilePerRaggio(raggio,report,costo_mc,costo_bi);
        raggio = 8;
        report=calcolaUtilePerRaggio(raggio,report,costo_mc,costo_bi);
        raggio = 10;
        report=calcolaUtilePerRaggio(raggio,report,costo_mc,costo_bi);
        raggio = 12;
        report=calcolaUtilePerRaggio(raggio,report,costo_mc,costo_bi);

        report = report + "----------\n" + new Date() + "\n";
        JOptionPane.showMessageDialog(null, new JTextArea(report));

    }
    
    public static String calcolaUtilePerRaggio(double r, String report, double costo_mcu, double costo_bigl){   
        double raggio = r;
        double PIGRECO=3.1415;
        double area = PIGRECO * raggio * raggio;
        double volume_semi = (PIGRECO * raggio * raggio * raggio) * 2 / 3;
        //double volume_semi=2/3*area*raggio;
        double max_persone = Math.floor(area);
        //costo all'ora
        double costo_mc=costo_mcu;
        double costo_bi=costo_bigl;
        double costi = volume_semi * costo_mc;
        costi=Math.floor(costi);
        double ricavi = max_persone * costo_bi;
        ricavi=Math.floor(ricavi);
        double utili = ricavi - costi;
        utili = Math.round(utili * 100);
        utili = utili / 100;

        //stampo gli output caso raggio
        
        report= report + "Raggio:" + raggio + "\n";
        report = report + "Max persone:" + max_persone + "\t";
        report = report + "Costi:" + costi + "\t";
        report = report + "Ricavi:" + ricavi + "\t";
        report = report + "Utili:" + utili + "\n";

        //mando indietro il report aggiornato con la nuova riga
        return report;
    }   
}  