package it.ian.scuola.cli.oop.persona;

public class Persona {
    private String nome;
    private String cognome;
    private String titolo;
    private String professione;

    public Persona(String nome, String cognome, String titolo, String professione){
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = titolo;
        this.professione = professione;
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = "";
        this.professione = "disoccupato";
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setProfessione(String professione) {
        this.professione = professione;
    }

    public String ottieniInfoPersona(){
        return titolo + " " + nome + " " + cognome + ", professione " + professione;
    }
}


