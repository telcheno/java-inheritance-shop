package javaInheritanceShop;

import java.util.Scanner;

import org.lessons.java.shop.Prodotto;

public class Shop {

	public static void main(String[] args) {
//importo metodo scanner	
		Scanner input = new Scanner (System.in);
		System.out.println("Qual'è prodotto ti serve? \n");
		
//	istanzio la classe col costruttore	
		Prodotto prodotto = new Prodotto(null, null, 0);
		
//		System.out.println("Inserisci il Nome del prodotto ");
//		prodotto1.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		prodotto1.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		prodotto1.prezzo  = input.nextFloat();
//	stampo riepilogo del prodotto	
		System.out.println(prodotto);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Smartphone smartphone = new Smartphone("Smartphone", "Samsung", 45.50f, 30, 0);
//		System.out.println("Inserisci il Nome del prodotto ");
//		smartphone.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		smartphone.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		smartphone.prezzo  = input.nextFloat();
		
//	stampo riepilogo del prodotto	
		System.out.println(smartphone);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Televisori televisore = new Televisori("Tv", "LG", 450.50f, 32, false);
//	stampo riepilogo del prodotto	
		System.out.println(televisore);
		
//	istanzio il prodotto valirizando le carateristiche del prodotto	
		Prodotto cuffie = new Cuffie("Cuffie", "Samsung", 95.5f, "Blu", "Wires");
//	stampo riepilogo del prodotto	
		System.out.println(cuffie);
		
	}

} 
