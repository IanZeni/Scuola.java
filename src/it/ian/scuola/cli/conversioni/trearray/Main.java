package it.ian.scuola.cli.conversioni.trearray;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        final int N = 5;

        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        Scanner tastiera = new Scanner(System.in);


        System.out.println("primo array:");

        for (int i = 0; i < N; i++) {
            System.out.println("inserisci elemento: ");
            a[i] = tastiera.nextInt();
        }


        System.out.println("secondo array");

        for (int i = 0; i < N; i++) {
            System.out.println("inserisci elemento: ");
            b[i] = tastiera.nextInt();
        }


        System.out.println("array dei valori massimi");

        for (int i = 0; i < N; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }

        }
        System.out.println("L'array più grande è: " + Arrays.toString(c));
    }
}