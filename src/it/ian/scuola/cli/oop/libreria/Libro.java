package it.ian.scuola.cli.oop.libreria;

import java.util.Scanner;

public class Libro {
    private String autore;
    private String titolo;
    private Integer numeroCopie;

    public void inizializzazione() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire Autore: ");
        autore = input.nextLine();
        System.out.println("Inserire Titolo: ");
        titolo = input.nextLine();
        System.out.println("Inserire Numero Copie: ");
        numeroCopie = Integer.parseInt(input.nextLine());
    }

    public void prestito(String prest) {
        if(titolo.equalsIgnoreCase(prest)) {
            numeroCopie--;
            System.out.println("Numero copie = " + numeroCopie);
        }
    }

    public void restituzione(String rest) {
        if(titolo.equalsIgnoreCase(rest)) {
            numeroCopie++;
            System.out.println(numeroCopie);
        }
    }

    public void stampaDati() {
        System.out.println("Autore = " + autore);
        System.out.println("Titolo = " + titolo);
        System.out.println("Numero Copie = " + numeroCopie);
    }
}
