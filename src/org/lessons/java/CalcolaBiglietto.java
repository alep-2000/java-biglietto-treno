package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di km che devi percorrere: ");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		
		System.out.print("Inserisci la tua età: ");
		String strEta = in.nextLine();
		int intEta = Integer.valueOf(strEta);
		
		float prezzoIniziale = 0.21F;
		double prezzoFinale = prezzoIniziale * intKm;
		String prezzoFormattato = String.format("%.2f", prezzoFinale);
		
		if(intEta < 18) {
			prezzoFinale = prezzoIniziale * intKm - 0.2;
		}else if(intEta > 65){
			prezzoFinale = prezzoIniziale * intKm - 0.4;
		}else{
		    prezzoFinale = prezzoIniziale * intKm ;
		}
		System.out.println("Il passeggero percorrerà: " + intKm + "km" + "\n" + "La sua età è: " + intEta + "anni" + "\n" + "Il prezzo da pagare è: " + prezzoFinale + " euro");
	}
}
