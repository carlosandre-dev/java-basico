package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero;
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		if(numero % 1 != 0) {
			System.out.println("Número decimal");
		} else {
			System.out.println("Nmero inteiro");
		}
		
		scan.close();

	}

}
