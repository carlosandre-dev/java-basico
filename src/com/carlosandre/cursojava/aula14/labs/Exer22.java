package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um número inteiro: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero + "é um número par");
		} else {
			System.out.println(numero + " é um número impar");
		}
		
		scan.close();

	}

}