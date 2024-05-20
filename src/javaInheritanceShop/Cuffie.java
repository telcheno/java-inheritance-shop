package javaInheritanceShop;

public class Cuffie extends Prodotto{
	private String colore;
	private String tipo;
	
	public Cuffie(int codice, String nome, String descrizione, float prezzo, float iva, float prezzoIva, String colore, String tipo) {
		super(codice, nome, descrizione, prezzo, iva, prezzoIva);
		this.colore = colore;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		String riepilogoProdotto = (super.toString()
				+ "DATI SPESIFICI: \n"
				+"Le ciffie sono di colore: " + this.colore  + "\n" 
				+ "Le cuffie " + this.tipo + " sono wireles.  \n");
		return riepilogoProdotto;
	}
}
