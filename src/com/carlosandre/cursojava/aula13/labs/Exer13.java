package com.carlosandre.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorHora, horasTrabalhadas, salarioBruto, salarioLiquido, inss, sindicato, ir;
		
		System.out.println("Quanto você ganha por hora?: ");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhou no mês?: ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = valorHora * horasTrabalhadas;
		inss = salarioBruto * 11/100;
		ir = salarioBruto * 8/100;
		sindicato = salarioBruto * 5/100;
		salarioLiquido = salarioBruto - inss - ir - sindicato;
		
		System.out.println("Salário Bruto: R$ " + salarioBruto);
		System.out.println("INSS: R$ " + inss);
		System.out.println("IR: R$ " + ir);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("Seu salário do mês será de: " + salarioLiquido);

	}

}
