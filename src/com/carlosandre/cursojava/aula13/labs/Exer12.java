package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double pesoIdeal, altura;

		System.out.println("Informe a altura: ");
		altura = scan.nextDouble();

		pesoIdeal = (72.7*altura)-58;

		System.out.println("Seu peso ideal é: " + pesoIdeal);

	}

}
