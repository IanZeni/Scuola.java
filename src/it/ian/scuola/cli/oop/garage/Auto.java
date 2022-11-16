package it.ian.scuola.cli.oop.garage;

public class Auto extends Veicolo{
    protected int porte;
    protected boolean carburante;

    public Auto(String id, String marca, int anno, int cilindrata, int porte, boolean carburante) {
        super(id, marca, anno, cilindrata);
        this.porte = porte;
        this.carburante = carburante;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public boolean isCarburante() {
        return carburante;
    }

    public void setCarburante(boolean carburante) {
        this.carburante = carburante;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Numero di porte : " + porte);
        System.out.println("Tipo di carburante : " + carburante);
    }
}
