package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int umReal, cincoReais, dezReais, cinquentaReais, cemReais, saque;
		System.out.println("Digite o valor do saque: ");
		saque = scan.nextInt();
		
		cemReais = saque / 100;
		cinquentaReais = (saque - (cemReais * 100)) / 50;
		dezReais = (saque - (cemReais * 100) - (cinquentaReais * 50)) / 10;
		cincoReais = (saque - (cemReais * 100) - (cinquentaReais * 50) - (dezReais * 10)) / 5;
		umReal = (saque - (cemReais * 100) - (cinquentaReais * 50) - (dezReais * 10) - (cincoReais * 5));
		
		System.out.println("Saque R$ " + saque);
		System.out.println("Notas de R$ 100 = " + cemReais);
		System.out.println("Notas de R$ 50 = " + cinquentaReais);
		System.out.println("Notas de R$ 10 = " + dezReais);
		System.out.println("Notas de R$ 5 = " + cincoReais);
		System.out.println("Notas de R$ 1 = " + umReal);
		scan.close();

	}

}
