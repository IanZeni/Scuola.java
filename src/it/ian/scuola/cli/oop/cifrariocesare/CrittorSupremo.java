package it.ian.scuola.cli.oop.cifrariocesare;

public class CrittorSupremo {
    protected String alfabeto;

    public CrittorSupremo() {
        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
    public String chyper(String messaggio, int chiave) {
        char[] messaggioChar = messaggio.toUpperCase().toCharArray();
        for(int i = 0; i < messaggio.length(); i++) {
           if(alfabeto.indexOf(messaggioChar[i]) != -1){
               int indice = alfabeto.indexOf(messaggioChar[i]);
               indice = indice + chiave;
               while(indice >= 26){
                   indice = indice - 26;
               }
               while(indice < 0){
                   indice = indice + 26;
               }
               messaggioChar[i] = alfabeto.charAt(indice);
           }
        }
    return new String(messaggioChar);
    }
}
