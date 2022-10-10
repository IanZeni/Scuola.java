package it.ian.scuola.cli.oop.persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Marco", "Bianchi");
        Persona persona2 = new Persona("Renato", "Caputo", "Sig.", "barbiere");
        System.out.println(persona1.ottieniInfoPersona());
        System.out.println(persona2.ottieniInfoPersona());
        persona1.setTitolo("Ing.");
        persona1.setProfessione("analista programmatore");
        System.out.println(persona1.ottieniInfoPersona());
    }
}
