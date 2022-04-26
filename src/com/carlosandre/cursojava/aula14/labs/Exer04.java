package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe uma letra: ");
		String letra = scan.nextLine();
		
		if (letra.equalsIgnoreCase("a")) {
			System.out.println("vogal");
		} else if(letra.equalsIgnoreCase("e")) {
			System.out.println("vogal");
		} else if(letra.equalsIgnoreCase("i")) {
			System.out.println("vogal");
		} else if(letra.equalsIgnoreCase("o")) {
			System.out.println("vogal");
		} else if(letra.equalsIgnoreCase("o")) {
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
		}

	}

}
