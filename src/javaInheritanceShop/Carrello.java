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
		Scanner input = new Scanner(System.in);
		System.out.println("Sceglie il tuo prodotto. \n -1 Smartphone \n -2 Televisore \n -3 Cuffie. \n");
		String  scelta = input.nextLine();
		String prodottoScelto = scelta.toUpperCase();
		
		Prodotto prodotto = new Prodotto(null, null, 0f);
		
		System.out.println("Compia i dati del tuo prodotto.");
		System.out.println("Nome del prodotto.");
		prodotto.nome = input.nextLine();

		System.out.println("Marca del prodotto.");
		prodotto.marca = input.nextLine();
		System.out.println("Compia il prezzo prodotto.");
		prodotto.prezzo = input.nextFloat();
		System.out.println("Il calcolo sarà fatto col 22% del'Iva. \n");
		
		switch (prodottoScelto) {
			case "SMARTPHONE": {
				System.out.println("Quanti GB di memoria ha lo smartphone?");
				Smartphone smartphone = new Smartphone(prodotto.nome, prodotto.marca, prodotto.prezzo, 0, 0);
				int capacita = input.nextInt();
				smartphone.getMemoria(capacita);
				
				System.out.println(smartphone);
				break;
				
		}case "TELEVISORE":{
			Televisori televisori = new Televisori(prodotto.nome, prodotto.marca, prodotto.prezzo, 0, null);
			System.out.println("Quanti polici ha il televisore?");
			int dimensioni = input.nextInt();
			televisori.getDimensioni(dimensioni);

			System.out.println("Il televisore puo colegarsi a internet? \n");
			String tv = input.nextLine();
			String tvSmart = tv.toLowerCase();
			televisori.getSmart(tvSmart);
						
			System.out.println(televisori);
			break;
			
		}case "CUFFIE": {
			System.out.println("Di che colore è le cuffie");
			String coloreScelto = input.nextLine();
			Cuffie cuffie = new Cuffie(prodotto.nome, prodotto.marca, prodotto.prezzo, null, null);
			cuffie.getColore(coloreScelto);
			
			System.out.println(cuffie);
		}
			break;
		default:
			System.out.println("Forse non hai scelto un prodotto disponibile");
		}
		
	}

}
