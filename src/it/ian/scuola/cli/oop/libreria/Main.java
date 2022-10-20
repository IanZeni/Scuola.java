package it.ian.scuola.cli.oop.libreria;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Libro[] libri = new Libro[100];
        Integer libriDaInserire = null;

        do {
            System.out.println("Inserire il numero di libri da inserire: ");
            libriDaInserire = Integer.parseInt(input.nextLine());
        } while (libriDaInserire >= 100);

        for(int i=0; i<libriDaInserire; i++){
            if(libri[i] == null) {
                Libro libro = new Libro();
                libro.inizializzazione();
                libri[i] = libro;
            }
        }

        Integer scelta;
        do {
            scelta = getScelta();
            switch (scelta){
                case 1 -> {
                    for(int i=0; i<100; i++){
                        if(libri[i] == null) {
                            Libro libro = new Libro();
                            libro.inizializzazione();
                            libri[i] = libro;
                            break;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Inserisci il titolo: ");
                    String titolo = input.nextLine();
                    for(int i=0; i<100; i++){
                        if(libri[i] != null) {
                            libri[i].prestito(titolo);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Inserisci il titolo: ");
                    String titolo = input.nextLine();
                    for(int i=0; i<100; i++){
                        if(libri[i] != null) {
                            libri[i].restituzione(titolo);
                        }
                    }
                }
                case 4 -> {
                    for(int i=0; i<100; i++){
                        if(libri[i] != null) {
                            libri[i].stampaDati();
                        }
                    }
                }
            }

        } while(scelta != 5);


    }

    private static Integer getScelta(){
        String menu = """
        0========================0
        |          Menu          |
        0========================0
        [1] Aggiungi libro
        [2] Prestito
        [3] Restituzione
        [4] Stampa libri
        [5] Esci
        |========================|
        """;
        System.out.print(menu);
        return Integer.parseInt(input.nextLine());
    }



}
