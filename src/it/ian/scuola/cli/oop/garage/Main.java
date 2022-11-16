package it.ian.scuola.cli.oop.garage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Integer posti = 15;
        String scelta;
        Scanner input = new Scanner(System.in);
        Veicolo[] garage = new Veicolo[posti];
        do {
            System.out.println("""
                    0===Inserimento oggetti nel vettore===0
                    - moto ---> M
                    - auto ---> A
                    - furgone ---> F
                    - fine ---> X
                    - Scelta :
                    0======================================0
                    """);
            scelta = input.nextLine();
        }while(scelta != "X");
    }
}
