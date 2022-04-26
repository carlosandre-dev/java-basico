package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, produto;
		double num3, soma, cubo;
		
		System.out.println("Digite o 1º número inteiro: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o 2º número inteiro: ");
		num2 = scan.nextInt();
				
		System.out.println("Digite 1 número real: ");
		num3 = scan.nextDouble();
		
		produto = (num1*2)*(num2/2);
		soma = (num1*3)+num3;
		cubo = num3*3;
		
		System.out.println("-> O produto do dobro do primeiro com metade do segundo é: " + produto);
		System.out.println("-> A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("-> O terceiro elevado ao cubo: " + cubo);
	}

}
