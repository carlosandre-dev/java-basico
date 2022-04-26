package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double salarioAtual, salarioNovo, percentual1 = 0.20, percentual2 = 0.15, percentual3 = 0.10, percentual4 = 0.05, valorAumento;
		
		System.out.println("Informe o salário: ");
		salarioAtual = scan.nextDouble();
		
		if(salarioAtual <= 280) {
			valorAumento = salarioAtual * percentual1;
			salarioNovo = salarioAtual + valorAumento;
			System.out.println("Salário Atual: " + salarioAtual);
			System.out.println("Percentual de aumento: " + percentual1);
			System.out.println("Valor do aumento: " + valorAumento);
			System.out.println("Salário após aumento: " + salarioNovo);
		}

	}

}
