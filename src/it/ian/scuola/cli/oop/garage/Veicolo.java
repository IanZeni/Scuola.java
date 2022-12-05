package it.ian.scuola.cli.oop.garage;

public class Veicolo {
    protected String id;
    protected String marca;
    protected int anno;
    protected int cilindrata;
    protected char tipoclasse;

    public Veicolo(String id, String marca, int anno, int cilindrata) {
        this.id = id;
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public void setTipoClasse(char tipo){
        tipoclasse = tipo;
    }

    public char getTipoclasse() {
        return tipoclasse;
    }

    public void stampa(){
        System.out.println("Marca :" + marca);
        System.out.println("Anno :" + anno);
        System.out.println("Cilindata :" + cilindrata);
    }
}
