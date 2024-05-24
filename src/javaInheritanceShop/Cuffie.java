package javaInheritanceShop;

public class Cuffie extends Prodotto{
	private String colore;
	private String tipo;
	public Cuffie(String nome, String marca, float prezzo, String colore, String tipo) {
		super(nome, marca, prezzo);
		
		this.colore = getColore(colore);
		this.tipo = tipo;
	}

	
	public String getColore(String input) {
		colore = input;
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}


	public String getTipo(String input) {
		this.tipo = input;
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		String riepilogoProdotto = (super.toString()
				+ "DATI SPESIFICI: \n"
				+"Le Cuffie sono di colore " + this.colore  + ". \n" 
				+ "Le Cuffie " + this.tipo + " sono wireles.  \n");
		return riepilogoProdotto;
	}
}
