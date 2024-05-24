package javaInheritanceShop;

import java.awt.Dimension;

public class Televisori extends Prodotto{
	
//	istanzio le variabili in agiunta le carateristiche della classe
	private int dimensioni;
	private  String smart;
	
//	agiungo el costruttore le carateristiche della classe
public Televisori(String nome, String marca, float prezzo, int dimensione, String smart) {
		super(nome, marca, prezzo);

		//		carateristiche specifiche del prodotto
		this.dimensioni = getDimensioni(dimensioni);
		this.smart = getSmart(smart);

}

	public int getDimensioni(int input) {
		this.dimensioni = input;
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	

	public String getSmart(String input) {
		smart = input;
		return smart;
	}

	public void setSmart(String smart) {
		this.smart = smart;
	}

	//stampo il riepilogo del prodotto con i dati specifici del prodotto	
	@Override
	public String toString() {
		String riepilogoProdotto = (super.toString()
				+ "DATI SPESIFICI: \n"
				+"Dimensione: " + this.dimensioni 
				+ " Polici" + "\n" 
				+ "Il televisore " + this.smart + " è una smart TV.  \n");
		return riepilogoProdotto;
	}
	
}
