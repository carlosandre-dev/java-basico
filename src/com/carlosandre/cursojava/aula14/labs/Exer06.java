package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = scan.nextInt();
		
		if((num1 > num2) && (num1 > num3)) {
			System.out.println("O primeiro número é maior");
		} else if((num2 > num1) && (num2 > num3)) {
			System.out.println("O segundo número é maior");
		} else if((num3 > num1) && (num3 > num2)) {
			System.out.println("O terceiro número é maior");
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
