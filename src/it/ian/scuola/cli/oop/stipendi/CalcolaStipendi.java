package it.ian.scuola.cli.oop.stipendi;

public class CalcolaStipendi {
    public static void main(String[] args) {
        Dipendente Dipendente1 = new Dipendente("00309", 1000F, 7.50F);
        System.out.println("Dipendente 1 ========");
        Dipendente1.stampa();

        int oreStraordinario = 10;
        System.out.println("Ore straordinario : " + oreStraordinario);
        System.out.println("Stipendio finale : " + Dipendente1.paga(oreStraordinario));

        DipendenteA Dipendente2 = new DipendenteA("00201",1500F, 8.5F, 0);
        System.out.println("Dipendente 2 ========");
        Dipendente2.stampa();
        Dipendente2.stampaMalattia();
        Dipendente2.prendiMalattia(5);
        Dipendente2.stampaMalattia();
        int oreStraordinario1 = 3;
        System.out.println("Ore straordinario : " + oreStraordinario1);
        System.out.println("Stipendio finale : " + Dipendente2.paga(oreStraordinario1));
    }
}
