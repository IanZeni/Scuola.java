package it.ian.scuola.cli.oop.negozio;

public class TipoCapoAbbigliamento {
    protected String marca;
    protected String modello;
    protected float costo;

    public TipoCapoAbbigliamento(String marca, String modello, float costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public float applicaSconto(float sconto) {
        return costo - ((costo * sconto) / 100);
    }

    public void modificaCosto(float nuovoPrezzo) {
        this.costo = nuovoPrezzo;
    }

    public void getDettagli() {
        System.out.println("Marca : " + marca);
        System.out.println("Modello : " + modello);
        System.out.println("Costo : " + costo);

    }
}
