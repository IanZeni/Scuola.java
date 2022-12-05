package it.ian.scuola.cli.oop.garage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Integer posti = 15;
        String scelta;
        String marca;
        char db;
        int cilindrata, anno,porte,carico,tempi;

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
            switch (scelta){
                case "A": {
                    System.out.println("Inserimento dati auto : ");
                    System.out.println("Inserici marca : ");
                    marca = input.nextLine();
                    System.out.println("Inserici anno : ");
                    anno = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci cilindrata : ");
                    cilindrata = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci numero porte : ");
                    porte = Integer.parseInt(input.nextLine());
                    System.out.println("Diesel o Benzina : ");
                    db = input.nextLine().charAt(0);
                  //  Auto a= new Auto(marca, anno, cilindrata, porte, db);

                  // garage[posti]=a;

                    garage[posti].setTipoClasse('a');

                }


            }

        }while(scelta != "X");
    }
}
