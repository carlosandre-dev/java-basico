package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valorHora, horasTrabalhadas, salarioBruto, salarioLiquido, inss, sindicato, descontos, ir = 0, taxa = 0, fgts;
		
		System.out.println("Quanto você ganha por hora?: ");
		valorHora = scan.nextDouble();
		System.out.println("Quantas horas trabalhou no mês?: ");
		horasTrabalhadas = scan.nextDouble();
		
		salarioBruto = valorHora * horasTrabalhadas;
		
		if(salarioBruto < 900) {
			System.out.println("Isento de IR");
		} else if((salarioBruto > 900) && (salarioBruto <= 1500)) {
			ir = salarioBruto * 0.05;
			taxa = 0.05 * 100;
		} else if((salarioBruto > 1500) && (salarioBruto <= 2500)) {
			ir = salarioBruto * 0.10;
			taxa = 0.10 * 100;
		} else {
			ir = salarioBruto * 0.20;
			taxa = 0.20 * 100;
		}
		
		inss = salarioBruto * 0.10;
		sindicato = salarioBruto * 0.03;
		fgts = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - inss - ir - sindicato;
		descontos = ir + inss + sindicato;
		
		System.out.println("Salário Bruto: " + "("+ valorHora + "*" + horasTrabalhadas +")     :R$" + salarioBruto);
		System.out.println("(-) IR " + "("+taxa+"%)"+" : R$"+ir);
		System.out.println("(-) INSS " + "(10%) : R$"+inss);
		System.out.println("Sindicato: R$ " + sindicato);
		System.out.println("FGTS (11%) : R$" + fgts);
		System.out.println("Total de descontos : R$ "+descontos);
		System.out.println("Salário Líquido : R$ " + salarioLiquido);

	}

}
