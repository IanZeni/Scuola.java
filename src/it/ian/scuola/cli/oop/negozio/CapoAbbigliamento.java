package it.ian.scuola.cli.oop.negozio;

public class CapoAbbigliamento extends TipoCapoAbbigliamento {
    protected Integer taglia;
    protected Integer quantitaAquistata;
    protected Integer quantitaDisponibile;

    public CapoAbbigliamento(String marca, String modello, float costo, Integer taglia, Integer quantitaAquistata, Integer quantitaDisponibile) {
        super(marca, modello, costo);
        this.taglia = taglia;
        this.quantitaAquistata = quantitaAquistata;
        this.quantitaDisponibile = quantitaDisponibile;
    }
    public void venduto(Integer capiVenduti){
        if(quantitaDisponibile>=capiVenduti){
            quantitaDisponibile = quantitaDisponibile - capiVenduti;
        } else {
            System.out.println("Operazione annullata!");
        }
    }
    @Override
    public void getDettagli(){
      super.getDettagli();
        System.out.println("Taglia : " + taglia);

    }
}
