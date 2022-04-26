package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("Informe o primeiro lado do triângulo: ");
		lado1 = scan.nextDouble();
		
		System.out.println("Informe o segundo lado do triângulo: ");
		lado2 = scan.nextDouble();
		
		System.out.println("Informe o terceiro lado do triângulo: ");
		lado3 = scan.nextDouble();
		
		if((lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1)) {
			if((lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3)) {
				System.out.println("Triângulo Equilátero");
			} else if((lado1 == lado2) || (lado1 == lado3) || (lado1 == lado3)) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é um triângulo");
		}
		scan.close();
	}

}
