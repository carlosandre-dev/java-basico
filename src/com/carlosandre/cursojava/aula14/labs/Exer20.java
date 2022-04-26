package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = scan.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = scan.nextDouble();
		
		System.out.print("Informe a terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
			System.out.println("Média: " + media);
		} else if(media >= 7) {
			System.out.println("Aprovado");
			System.out.println("Média: " + media);
		} else {
			System.out.println("Reprovado");
			System.out.println("Média: " + media);
		}		

	}

}
