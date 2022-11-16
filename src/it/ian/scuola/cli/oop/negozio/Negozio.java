package it.ian.scuola.cli.oop.negozio;

public class Negozio {
    public static void main(String[] args) {
        TipoCapoAbbigliamento Abbigliamento1 = new TipoCapoAbbigliamento("Colmar","E45",350.5F);
        Abbigliamento1.getDettagli();
        System.out.println("Costo : " + Abbigliamento1.getCosto());
        System.out.println("Prezzo con sconto applicato :  " +  Abbigliamento1.applicaSconto(30) + "€");

        CapoAbbigliamento Abbigliamento2 = new CapoAbbigliamento("Levis","jeans 570SC",79.8F,40,30,30);
        Abbigliamento2.venduto(2);
        Abbigliamento2.getDettagli();
        System.out.println("Il prezzo finale è : " + Abbigliamento2.applicaSconto(30F) + "€");
    }
}
