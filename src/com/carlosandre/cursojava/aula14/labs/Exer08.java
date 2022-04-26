package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double produto1, produto2, produto3;
		
		System.out.println("Informe o valor do produto 1: ");
		produto1 = scan.nextDouble();
		
		System.out.println("Informe o valor do produto 2: ");
		produto2 = scan.nextDouble();
		
		System.out.println("Informe o valor do produto 3: ");
		produto3 = scan.nextDouble();
		
		if((produto1 < produto2) && (produto1 < produto3)) {
			System.out.println("O primeiro produto é o mais barato");
		} else if((produto2 < produto1) && (produto2 < produto3)) {
			System.out.println("O segundo produto é o mais barato");
		} else if((produto3 < produto2) && (produto3 < produto1)) {
			System.out.println("O terceiro produto é o mais barato");
		} else if((produto1 == produto2) && (produto1 == produto3) && (produto2 == produto3)){
			System.out.println("Os preços são iguais");
		} else {
			System.out.println("Espere a promoção");
		}
	}

}
