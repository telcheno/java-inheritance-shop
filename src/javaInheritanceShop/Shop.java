package javaInheritanceShop;

import java.util.Scanner;

import org.lessons.java.shop.Prodotto;

public class Shop {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
System.out.println("Qual'è prodotto ti serve? \n");
		
		Prodotto prodotto1 = new Prodotto(0, null, null,  0, 0, 0);
		
//		System.out.println("Inserisci il Nome del prodotto ");
//		prodotto1.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		prodotto1.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		prodotto1.prezzo  = input.nextFloat();
		System.out.println(prodotto1);
		
		Smartphone smartphone = new Smartphone(0, "Smartphone", "Samsung", 150, 0, 0, 15478447, 30);
//		System.out.println("Inserisci il Nome del prodotto ");
//		smartphone.nome = input.nextLine();
//		System.out.println("Inserisci una descrizione del prodotto ");
//		smartphone.descrizione = input.nextLine();
//		System.out.println("Inserisci il prezzo del prodotto ");
//		smartphone.prezzo  = input.nextFloat();
		
		System.out.println(smartphone);
		
		Televisori televisore = new Televisori(0, "TV", "LG", 785, 0, 0, 32, true);
		System.out.println(televisore);
		
		Prodotto cuffie = new Cuffie(0, "Cuffie", "Samsung", 124, 0, 0, "blu", "no");
		System.out.println(cuffie);
		
		
	}

} 
