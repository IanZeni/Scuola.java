package it.ian.scuola.cli.oop.persona;

public class Main {
    public static void main(String[] args) {

        //dichiarazione degli oggetti
        Persona persona1 = new Persona("Marco", "Bianchi");
        Persona persona2 = new Persona("Renato", "Caputo", "Sig.", "barbiere");

        //stampre a schermo le informazioni delle due persone
        System.out.println(persona1.ottieniInfoPersona());
        System.out.println(persona2.ottieniInfoPersona());

        //cambio dei parametri dell oggetto persona 1
        persona1.setTitolo("Ing.");
        persona1.setProfessione("analista programmatore");

        //stampare a schermo l oggetto persona 1 modificato
        System.out.println(persona1.ottieniInfoPersona());
    }
}
