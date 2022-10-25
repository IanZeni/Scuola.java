package it.ian.scuola.cli.oop.motorino;

public class MotorinoImmatricolato extends Motorino{
    protected float maxVelocita = 50;
    protected String targa;

    public MotorinoImmatricolato(String colore, String tipo, float velocita, boolean antifurto, float maxVelocita, String targa) {
        super(colore, tipo, velocita, antifurto);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }
    public void getMax(){
        System.out.println("Velocità massima: " + maxVelocita);
    }

    @Override
    public void accelera(float velocitaAggiunta) {
        float s = velocita + velocitaAggiunta;
        if ( s < maxVelocita){
            velocita = s;
        }else{
            velocita = maxVelocita;
        }
    }
}
