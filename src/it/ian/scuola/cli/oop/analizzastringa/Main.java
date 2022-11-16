package it.ian.scuola.cli.oop.analizzastringa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreFrasi gestoreFrasi = new GestoreFrasi();
        System.out.println("Inserisci una frase! : ");
        String s = scanner.nextLine();
        gestoreFrasi.analizza(s);
        System.out.println("la frequenza di vocali è :");
        System.out.println(gestoreFrasi.getFreqVocali());
        System.out.println("la frequenza di spazi è : ");
        System.out.println(gestoreFrasi.getFreqSpazi());


    }
}
