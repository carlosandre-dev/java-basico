package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double arquivo, velocidade, tempo, tempoMinutos;
		
		System.out.println("Informe o tamanho do arquivo de download em MB: ");
		arquivo = scanner.nextDouble();
		
		System.out.println("Qual velocidade da sua internet? ");
		velocidade = scanner.nextDouble();
		
		tempo = arquivo / velocidade;
		
		System.out.printf("O tempo aproximado de download é de: " + tempo);
		
	}
}
