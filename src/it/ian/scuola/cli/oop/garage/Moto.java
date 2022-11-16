package it.ian.scuola.cli.oop.garage;

public class Moto extends Veicolo{
    protected boolean tempi;

    public Moto(String id, String marca, int anno, int cilindrata, boolean marce) {
        super(id, marca, anno, cilindrata);
        this.tempi = marce;
    }

    public boolean isTempi() {
        return tempi;
    }

    public void setTempi(boolean tempi) {
        this.tempi = tempi;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Tempi : " + tempi);
    }
}
