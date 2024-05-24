//Create una classe Carrello con metodo main, in cui chiedete all’utente 
//di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo 
//uno Smarphone o 
//un Televisore o 
//Cuffie 
//e in base alla scelta dell’utente utilizzate il costruttore opportuno.
//Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
package javaInheritanceShop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		//inporto metodo scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Sceglie il tuo prodotto. \n -1 Smartphone \n -2 Televisore \n -3 Cuffie. \n");
		//valoriso la variavile con input del utente
		String  scelta = input.nextLine();
		//converto la risposta in magiscolo
		String prodottoScelto = scelta.toUpperCase();
		
		//	istanzio	il prodotto per implementare gli atributi
		Prodotto prodotto = new Prodotto(null, null, 0f);
		
		//chiedo i dati reletivi al prodotto
		System.out.println("Compila i dati del tuo prodotto.");
		System.out.println("Nome del prodotto.");
		String nome = input.nextLine();
		prodotto.getNome(nome);

		System.out.println("Marca del prodotto.");
		String marca = input.nextLine();
		prodotto.getMarca(marca); 
		
		System.out.println("Compia il prezzo prodotto.");
		float prezzo = input.nextFloat();
		prodotto.getPrezzo(prezzo); 
		
		System.out.println("Il calcolo sarà fatto col 22% del'Iva. \n");
		
		//implemento la condizionale a secondo la scelta del utenete
		switch (prodottoScelto) {
			case "SMARTPHONE": {
				
				//chiedo i dati specifici del prodotto 
				System.out.println("Quanti GB di memoria ha lo smartphone?");
				int capacita = input.nextInt();
				
				//istanzio il prodotto sccelto
				Smartphone smartphone = new Smartphone(prodotto.getNome(nome), prodotto.getMarca(marca), prodotto.getPrezzo(prezzo), 0, 0);
				
				//asegno le carateristuche scelte
				smartphone.getMemoria(capacita);
				
				//stampo il riepilogo del prpdotto scelto 
				//con i dati generici e i dati specifici
				System.out.println(smartphone);
				break;
				
			}case "TELEVISORE":{
				//chiedo i dati specifici del prodotto 
				System.out.println("Il televisore puo colegarsi a internet? ");
				String tv = input.next();
				String tvSmart = tv.toUpperCase();
				System.out.println("Quanti polici ha il televisore?");
				int dimensioni = input.nextInt();
				
				//istanzio il prodotto sccelto
				Televisori televisori = new Televisori(prodotto.nome, prodotto.marca, prodotto.prezzo, 0, null);

				//asegno le carateristiche scelte
				televisori.getDimensioni(dimensioni);
				televisori.getSmart(tvSmart);

				//stampo il riepilogo del prpdotto scelto 
				//con i dati generici e i dati specifici
				System.out.println(televisori);
				break;
			
		}case "CUFFIE": {
			//chiedo i dati specifici del prodotto
			System.out.println("Le cuffie sono wirele? ");
			String wirele = input.next();
			String cuffieWirele = wirele.toUpperCase();
			System.out.println("Di che colore sono le cuffie?");
			String colore = input.next();
			String coloreScelto = colore.toUpperCase();
			
			//istanzio il prodotto sccelto
			Cuffie cuffie = new Cuffie(prodotto.getNome(nome), prodotto.getMarca(marca), prodotto.getPrezzo(prezzo), null, null);
			
			//asegno le carateristiche scelte
			cuffie.getColore(coloreScelto);
			cuffie.getTipo(cuffieWirele);

			//stampo il riepilogo del prpdotto scelto 
			//con i dati generici e i dati specifici
			System.out.println(cuffie);
			break;
		}
		default:
			//rispota defaaul se non è uno dei casi della condizionali
			System.out.println("Forse non hai scelto un prodotto disponibile");
		}
		
	}

}
