package it.ian.scuola.cli.oop.calciatore;

public class Calciatore {
    private String nome;
    private String cognome;
    private String ruolo;

    public Calciatore(String nome, String cognome, String ruolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public float capacitàDribbling(){
        return ((eta * capacita) % 0.86);
    }
}
