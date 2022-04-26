package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, media;
		char conceito;
		String resultado;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 9 && media <= 10) {
			conceito = 'A';
			resultado = "APROVADO";
		} else if(media >= 7.5 && media < 9.0) {
			conceito = 'B';
			resultado = "APROVADO";
		} else if(media >= 6.0 && media < 7.5) {
			conceito = 'C';
			resultado = "APROVADO";
		} else if(media >= 4.0 && media < 6.0) {
			conceito = 'D';
			resultado = "REPROVADO";
		} else {
			conceito = 'E';
			resultado = "REPROVADO";
		}
		
		System.out.println("=============================");
		System.out.println("--- Resultado do semestre ---");
		System.out.println("=============================");
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("------------------------------");
		System.out.println("Resultado: " + resultado);
		
	}

}
