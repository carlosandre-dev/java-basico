package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2, resultado = 0;
		String operacao;
		boolean validar = true;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		numero2 = scan.nextInt();
		
		System.out.print("Informe a operação a realizar (+, -, *, /): ");
		operacao = scan.next();
		
		switch (operacao) {
		case "+": {
			resultado = numero1 + numero2;break;
		}
		case "-": {
			resultado = numero1 - numero2;break;
		}
		case "*": {
			resultado = numero1 * numero2;break;
		}
		case "/": {
			resultado = numero1 / numero2;break;
		}
		
		default:
			System.out.println("Operaçao inválida!");
			validar = false;
		}
		
		if(validar == true) {
			
			System.out.println("Resultado: " + resultado);
			if(resultado % 2 == 0) {
				System.out.println("Numero par");
			} else {
				System.out.println("Numero impar");
			}
			
			if(resultado < 0) {
				System.out.println("Numero negativo");
			} else {
				System.out.println("Numero positivo");
			}
			
			if(resultado % 1 != 0) {
				System.out.println("Numero decimal");
			} else {
				System.out.println("Numero inteiro");
			}
		}
		
		scan.close();

	}

}
