package javaInheritanceShop;

public class Smartphone extends Prodotto {
//	istanzio le variabili in agiunta le carateristiche della classe
	private int imei;
	private int memoria;

//	agiungo el costruttore le carateristiche della classe
	public Smartphone(int codice, String nome, String descrizione, float prezzo, float iva, float prezzoIva, int imei, int memoria) {
//nel costruttore la dicitura "super" si riferisce alla classe padre che gestisce le carateristiche della suer classe		
		super(codice, nome, descrizione, prezzo, iva, prezzoIva);
		this.imei = getImei();
		this.memoria = memoria; 
	}
	
	public int getImei() {
		imei = rand.nextInt(100000000);
		return imei;
	}

	public int getMemoria() {
		return memoria;
	}

	@Override
	public int getCodice() {
		int codSmart = rand.nextInt(100000000);
		return codSmart;
	}
		
		@Override
		public String toString() {
			String riepilogoProdotto = (super.toString()
					+ "DATI SPESIFICI: \n"
					+"Memoria: " + this.memoria 
					+ " GB" + "\n" 
					+ "Codice IMEI: " + this.imei + ". \n");
			return riepilogoProdotto;
		}

}
