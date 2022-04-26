package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double PI = 3.1416;
		double raio;
        double area;
        
		System.out.println("Informe o raio de um círculo: ");
		raio = scan.nextDouble();
		
		area = PI* (raio*raio);
		
		System.out.println("A área do circulo é de: " + area);		
	}

}
