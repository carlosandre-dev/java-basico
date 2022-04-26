package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double precoAlcool = 1.9, precoGasolina = 2.5, desconto = 0, precoTotal = 0, valorPago = 0, litros = 0;
		String tipoCombustivel;
		
		System.out.print("Quantos litros vendidos?: ");
		litros = scan.nextDouble();
		
		System.out.print("A - álcool ou G - gasolina?: ");
		tipoCombustivel = scan.next();
		
		if(tipoCombustivel.equalsIgnoreCase("A") || tipoCombustivel.equalsIgnoreCase("a")) {
			precoTotal = precoAlcool * litros;
			if(litros <= 20) {
				desconto = (precoTotal * 3) / 100;
			} else {
				desconto = (precoTotal * 5) / 100;
			}
			valorPago = precoTotal - desconto;
			System.out.println("Total a pagar: R$ " + valorPago);
		}
		
		if(tipoCombustivel.equalsIgnoreCase("G") || tipoCombustivel.equalsIgnoreCase("g")) {
			precoTotal = precoGasolina * litros;
			if(litros <= 20) {
				desconto = (precoTotal * 4) / 100;
			} else {
				desconto = (precoTotal * 6) / 100;
			}
			valorPago = precoTotal - desconto;
			System.out.println("Total a pagar: R$ " + valorPago);
		}
		
		scan.close();
	}

}
