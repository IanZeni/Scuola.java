package it.ian.scuola.cli.conversioni.ricercamultiplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int N = 5;
        int [] a = new int [N];
        int i, valore;
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inseriamo gli elementi nell'array: ");
        for (i = 0; i < N; i++) {
            System.out.println("inserisci elemento: ");
            a[i] = tastiera.nextInt();
        }
        System.out.println("Quale valore o suo multiplo dobbiamo cercare?: ");
        valore = tastiera.nextInt();


        for (i = 0; i < N; i++) {
            if (a[i] % valore == 0){
                System.out.println(" valore trovato in posizione: " + i);
            }
        }


    }
}
