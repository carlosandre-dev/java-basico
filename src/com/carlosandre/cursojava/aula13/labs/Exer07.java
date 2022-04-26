package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double lado, area, dobro;

		System.out.println("Informe o lado do quadrado: ");
		lado = scan.nextDouble();

		area = lado * lado;
		dobro = area * area;

		System.out.println("A área do quadrado é de: " + area);
		System.out.println("O dobro dessa área é de: " + dobro);

	}

}
