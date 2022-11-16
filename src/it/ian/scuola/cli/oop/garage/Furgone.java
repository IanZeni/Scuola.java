package it.ian.scuola.cli.oop.garage;

public class Furgone extends Veicolo {
    protected float capacita;

    public Furgone(String id, String marca, int anno, int cilindrata, float capacita) {
        super(id, marca, anno, cilindrata);
        this.capacita = capacita;
    }

    public float getCapacita() {
        return capacita;
    }

    public void setCapacita(float capacita) {
        this.capacita = capacita;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Capacità furgone : " + capacita);
    }
}
