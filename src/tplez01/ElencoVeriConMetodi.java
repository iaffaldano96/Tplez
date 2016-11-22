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
public class ElencoVeriConMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //chiedo quanti alunnni e il voto mimimo per la promozione
        String input = JOptionPane.showInputDialog("Quanti alunni?");
        int n_num = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Qual è il voto minimo per essere promosso?");
        int minimo = Integer.parseInt(input);
        
        //creo i due vettori
        String nomi[] = new String[n_num];
        int voti[] = new int[n_num];
        double media = 0;
        //modo per inizializzare un array
           //String modelliFiat=[]={"punto","panda", "124"};
           // System.out.print(modelliFiat[0]);
        //fine altro modo
        
        //carico i dati nell'array
        for (int i = 0; i < nomi.length; i++) {
            input = JOptionPane.showInputDialog("Inserire nome");
            nomi[i] = input;
            input = JOptionPane.showInputDialog("Inserire voto");
            n_num = Integer.parseInt(input);
            voti[i] = n_num;
            media += voti[i];
        }//fine caricamento
        
        //stampo il vettore con prox e bocc
        String report = "";
        for (int i = 0; i < voti.length; i++) {
            if (voti[i] >= minimo) {
                report += nomi[i] + " - " + voti[i] + " - Promosso\n";
            } else {
                report += nomi[i] + " - " + voti[i] + " - Bocciato\n";
            }
        }
        System.out.println(report);//fine stampa
        
        //altra versione che elabora i dati con metodi
        int max, min;
        //utilizzo metodo per ottenere il voto max di un array
        //a max assegno il num che mi ritorna il metodo getMax che vuole come parametro l'array voti in cui cercare
        max= getMax(voti);
        min= getMin(voti);
        media= getMedia(voti);
        
        //estraggo in che pos è
        int posmax=getindexMax(voti);
        //uso la pos per cercare il nome e voto
        String nomemax;
        nomemax=nomi[posmax];
        int votomax=voti[posmax];
        
        //stampo 
        System.out.println("Persona con voto più alto: " + nomemax + "\nPersona con voto più basso: "  + votomax + "\nVoto medio: " + media);
        //fine stampa
    }

    //creo metodo,  static obbligatorio
    //che tipo di metodo (int, String..)
    //dopo il nome del metodo, get[cosa fa], Max[su che cosa]
    //infine dentro parentesi gli passo i parametri dichiarati [ex.  int[] valori---- String frase]
    //o più parametri (int x, int y, int z)
    //le graffe per racchiudere il codice da eseguire
    //scrivere il comando return alla fine del codice del tipo dichiarato all'inizio del metodo
    //dichiara e inizializza all'inizio del codice la variabile usata come return [ int ris=0;  return ris;]
 
    static int getindexMax(int[] valori){     
        int ris=0;     
        int indexMax=0;//per salvare la posizione del migliore
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > ris) {
                //caso migliore max
                ris = valori[i];
                //salvo dove sta il migliore
                indexMax=i;
            }
        }
        return ris;
    }


    static int getMax(int[] valori){     
        int massi=0;     
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] > massi) {
                massi = valori[i];
                
            }
        }
        return massi;
    }

    static int getMin(int[] valori){     
        int mini;
         mini=999999999;
        //altro sistema migliore
        //assumo che il primo sia il minore  e parto dal primo numero;
        mini=valori[0];
        //aloora i diventa i=1;
        for (int i = 1; i < valori.length; i++) {
            if (valori[i] < mini) {
                mini = valori[i];
                
            }
        }//fine ciclo
        return mini;
    }
    
    static int getMedia(int[] valori){     
        int somma=0;
        int ris;
        //li sommo tutti
        for (int i = 0; i < valori.length; i++) {
            somma+=valori[i];
        }//fine ciclio
        //calcolo la media
        ris=somma/valori.length;
        return ris;
    }

}
