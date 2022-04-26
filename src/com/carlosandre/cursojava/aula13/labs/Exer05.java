package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a distância em metros: ");
		double metros = scan.nextDouble();
		
		double conversao = metros * 100;
		
		System.out.println(metros + " metro(s) equivale a " + conversao + " centímetros");
		
	}

}
