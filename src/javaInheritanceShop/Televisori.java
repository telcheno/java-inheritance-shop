package javaInheritanceShop;

public class Televisori extends Prodotto{
//	istanzio le variabili in agiunta le carateristiche della classe
	private int dimensioni;
	private boolean smart;
	
//	agiungo el costruttore le carateristiche della classe
	public Televisori(int codice, String nome, String descrizione, float prezzo, float iva, float prezzoIva, int dimensioni, boolean  smart) {
		super(codice, nome, descrizione, prezzo, iva, prezzoIva);
		
//		carateristiche specifiche del prodotto
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

//stampo il riepilogo del prodotto con i dati specifici del prodotto	
	@Override
	public String toString() {
		String riepilogoProdotto = (super.toString()
				+ "DATI SPESIFICI: \n"
				+"Dimensione: " + this.dimensioni 
				+ " Polici" + "\n" 
				+ "Il televisore " + this.smart + " è smart.  \n");
		return riepilogoProdotto;
	}
	
}
