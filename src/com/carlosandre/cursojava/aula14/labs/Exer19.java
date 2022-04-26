package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, centenas, dezenas, unidades;
		System.out.println("Digite um número inteiro menor que 1000");
		numero = scan.nextInt();
		
		centenas = numero / 100;
		dezenas = (numero - (centenas * 100)) / 10;
		unidades = (numero - (centenas * 100) - (dezenas * 10));
		
		System.out.println(numero + " = " + centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
		scan.close();
	}

}
