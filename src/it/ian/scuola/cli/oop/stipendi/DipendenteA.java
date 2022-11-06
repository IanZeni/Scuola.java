package it.ian.scuola.cli.oop.stipendi;

public class DipendenteA extends Dipendente {
    protected int malattia = 0;

    public DipendenteA(String matricola, float stipendio, float straordinario, int malattia) {
        super(matricola, stipendio, straordinario);
        this.malattia = malattia;
    }

    public void prendiMalattia(int giorniMalattia) {
        malattia = malattia + giorniMalattia;
    }


    @Override
    public float paga(int oreStraordinario) {
        float p = super.paga(oreStraordinario);
        return (p - (malattia * 15));
    }

    public void stampaMalattia() {
        System.out.println("Malattia :" + malattia);
    }
}
