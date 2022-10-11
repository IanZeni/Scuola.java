package it.ian.scuola.cli.oop.persona;

public class Persona {

    //Inizializzazione degli attributi
    private String nome;
    private String cognome;
    private String titolo;
    private String professione;

    //Inizializzazione primo costruttore
    public Persona(String nome, String cognome, String titolo, String professione){
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = titolo;
        this.professione = professione;
    }
    //Inizializzazione secondo costruttore
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.titolo = "";
        this.professione = "disoccupato";
    }
    //dichiarazione dei metodi utilizzati per impostare il titolo e la professione di una persona
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setProfessione(String professione) {
        this.professione = professione;
    }

    //dichiarazione del metodo utilizato per passare la stringa al main
    public String ottieniInfoPersona(){
        return titolo + " " + nome + " " + cognome + ", professione " + professione;
    }
}



