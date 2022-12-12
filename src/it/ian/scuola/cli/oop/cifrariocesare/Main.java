package it.ian.scuola.cli.oop.cifrariocesare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Inserisci una chiave di cifratura (numero intero) : ");
        int chiave = Integer.parseInt(Scanner.nextLine());
        System.out.println("inserici una frase da criptare : ");
        String frase = Scanner.nextLine();
        CrittorSupremo crittorSupremo = new CrittorSupremo();
        System.out.println("La farse criptata è : ");
        System.out.println(crittorSupremo.chyper(frase, chiave));
    }
}
