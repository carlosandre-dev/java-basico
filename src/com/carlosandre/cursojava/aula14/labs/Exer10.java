package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Em que turno você estuda? (M - Matutino | V - Vespertino | N - Noturno): ");
		String letra = scan.nextLine();
		
		if (letra.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if(letra.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if(letra.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido!");
		}

	}

}
