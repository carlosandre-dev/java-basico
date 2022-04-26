package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorHora, horasTrabalhadas, salario;
		
		System.out.println("Qual o seu valor hora?: ");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhou no mês?: ");
		horasTrabalhadas = scan.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		System.out.println("Seu salário do mês será de: " + salario);
		

	}

}
