package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double celsius, farenheit, temperatura;
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		farenheit = scan.nextDouble();
				
		temperatura = (5*(farenheit-32)/9);
		
		System.out.println(farenheit + " Farenheit equivale a " + temperatura + " em Celsius");

	}

}
