package it.ian.scuola.cli.oop.stipendi;

public class Dipendente {
    public String matricola;
    protected float stipendio;
    protected float straordinario;

    public Dipendente(String matricola, float stipendio, float straordinario){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    public float getStipendio() {
        return stipendio;
    }
    public float paga(int oreStraordinario){
    return (stipendio + (oreStraordinario * straordinario));
    }
    public void stampa(){
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Straordinario: " + straordinario);
    }
}
