package it.ian.scuola.cli.oop.motorino;

public class Motorino {
    protected String colore;
    protected String tipo;
    protected float velocita;
    protected boolean antifurto;

    public Motorino(String colore, String tipo, float velocita, boolean antifurto) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;
        this.antifurto = antifurto;
    }

    public float getVelocita() {
        return velocita;
    }

    public void accelera(float velocitaAggiunta) {
        if (antifurto) {
            velocita += velocitaAggiunta;
        }
    }
    public void inserisciAntifurto(){
        antifurto = true;
    }

    public void togliAntifurto(){
        antifurto = false;
    }
}


