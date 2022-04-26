package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o sexo (F - Feminino ou M - Masculino): ");
		String letra = scan.nextLine();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if(letra.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
