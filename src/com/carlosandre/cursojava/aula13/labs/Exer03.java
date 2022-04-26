package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A Soma de " + numero1 + " + " + numero2 + " é: " + soma);

	}

}
