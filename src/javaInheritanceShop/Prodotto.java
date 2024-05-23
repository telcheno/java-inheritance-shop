//Nel progetto java-inheritance-shop
//Creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da:
//- codice (numero intero)
//- nome
//- marca
//- prezzo
//- iva
//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
//- il codice prodotto sia accessibile solo in lettura
//- gli altri attributi siano accessibili sia in lettura che in scrittura
//Lo shop gestisce diversi tipi di prodotto:
//- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//- Cuffie, caratterizzate dal colore e se sono wireless o cablate
//Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.

package javaInheritanceShop;

//importo il metodo random per generare il numero per il codice
import java.util.Random;

//creo la classe prodotto
public class Prodotto {
	
//	istanzio le caratteristiche del prodotto
	private int codice;
	protected String nome;
	protected String marca; 
	protected float prezzo;; 
	private float iva;
	private float prezzoIva;
	
//creo il costruttore del prodotto con i parametri
	public  Prodotto( String nome, String marca, float prezzo) {
		//stanzio le variabili del prodotto
		
		this.codice = getCodice();//	asegno il metodo che genera codice random
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = getIva(); // asegno il metodo che calcola l'iva
		this.prezzoIva = getPrezzoIva();// asegno il metodo che calcola il prozzo col'iva
	}
	
//========================================//
//metodi getters - setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

//	creo nel metodo getIva  il calcolo del iva che è solo in lettura
	public float getIva() {
		iva = prezzo * 22 / 100;
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

//	creo nel metodo getPrezzoIva  il calcolo del prezzo col iva che è solo in lettura
	public float getPrezzoIva() {
		prezzoIva = prezzo + iva;
		return prezzoIva;
	}

	public void setPrezzoIva(float prezzoIva) {
		this.prezzoIva = prezzoIva;
	}

	
	//	istanzio il metodo Random
	Random rand = new Random();

//	creo il metodo che genera il numero random che sara asegnato al codice del prodotto
	public int getCodice() {
		codice = rand.nextInt(100000000);
		return codice;
	}

	
//	spongo il riepilogo delprodotto col metodo toString
	public String toString() {
		String riepilogoProdotto = ("DATI DEL PRODOTTO: \n" 
				+ "Codice identificativo: "  + this.codice + "\n" 
				+ "Nome prodotto: " + this.nome + "\n" 
				+ "Descrizione prodotto (marca): " +  this.marca + "\n" 
				+ "Prezzo base: " + "€ " + this.prezzo + "\n" 
				+ "Iva 22%: € " + this.getIva() + "\n" 
				+ "Prezzo col'Iva €: " + this.getPrezzoIva() + ". \n" 
				+ "PRODOTTO: " + this.codice + " - "  + this.nome + " - " + this.marca + " - €" + this.getPrezzoIva() + "\n  \n");
		return riepilogoProdotto;
	}
}