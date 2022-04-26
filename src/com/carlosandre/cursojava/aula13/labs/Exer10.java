package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double celsius, temperatura;
		final double fator = 1.8;
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		celsius = scan.nextDouble();
				
		temperatura = (celsius*fator)+32;
		
		System.out.println(celsius + " Celsius equivale a " + temperatura + " em Farenheit");

	}

}
