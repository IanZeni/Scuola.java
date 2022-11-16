package it.ian.scuola.cli.oop.analizzastringa;

public class GestoreFrasi {
    protected String testo;
    protected int vocali;
    protected int spazi;

    public String getTesto() {
        return testo.toLowerCase();
    }

    public void analizza(String testo) {
        this.testo = testo;

        for (int i = 0; i < testo.length(); i++) {
            char ch = getTesto().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vocali++;
            }
            if (ch == ' ') {
                spazi++;
            }
        }
    }

    public float getFreqVocali() {
        System.out.println("x");
        return vocali / testo.length();
    }
    public float getFreqSpazi(){
        System.out.println("y");
        return spazi / testo.length();
    }
}
