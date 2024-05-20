package javaInheritanceShop;

import java.util.Scanner;

import org.lessons.java.shop.Prodotto;

public class Shop {

	public static void main(String[] args) {
//importo metodo scanner	
		Scanner input = new Scanner (System.in);
		System.out.println("Qual'è prodotto ti serve? \n");
		
//	istanzio la classe col costruttore	
		Prodotto prodotto1 = new Prodotto(0, null, null,  0, 0, 0);
		
//		System.out.println("Inserisci il Nome del prodotto ");
//		prodotto1.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		prodotto1.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		prodotto1.prezzo  = input.nextFloat();
//	stampo riepilogo del prodotto	
		System.out.println(prodotto1);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Smartphone smartphone = new Smartphone(0, "Smartphone", "Samsung", 150, 0, 0, 15478447, 30);
//		System.out.println("Inserisci il Nome del prodotto ");
//		smartphone.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		smartphone.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		smartphone.prezzo  = input.nextFloat();
		
//	stampo riepilogo del prodotto	
		System.out.println(smartphone);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Televisori televisore = new Televisori(0, "TV", "LG", 785, 0, 0, 32, true);
//	stampo riepilogo del prodotto	
		System.out.println(televisore);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Prodotto cuffie = new Cuffie(0, "Cuffie", "Samsung", 124, 0, 0, "blu", "no");
//	stampo riepilogo del prodotto	
		System.out.println(cuffie);
		
	}

} 
