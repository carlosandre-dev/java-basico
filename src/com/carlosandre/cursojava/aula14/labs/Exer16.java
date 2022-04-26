package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a, b = 0, c = 0, delta, x1 = 0, x2 = 0; 
		
		System.out.println("Insira o valor de A: ");
		a = scan.nextDouble(); 

		if(a == 0) {
			System.out.println("Não é uma equação do 2º grau");
		}
		
		if(a > 0) {
			System.out.println("Insira o valor de B: ");
			b = scan.nextDouble();
			System.out.println("Insira o valor de C: ");
			c = scan.nextDouble(); 
		}
		
		delta = ((b*b)-(4*a*c));
		
		if (delta < 0){ 
			System.out.println("Equação não possui valores reais");
		} else if (delta == 0) {
			x1 = (-b + Math.sqrt (delta)) / ( 2*a );
			System.out.println("Equação possui apenas uma raiz real");
			System.out.println("\nx1 vale: " + x1);
		} else{  
			x1 = (-b + Math.sqrt (delta)) / ( 2*a ); 
			x2 = (-b - Math.sqrt (delta)) / ( 2*a );
			System.out.println("Delta vale :"+ delta); 
			System.out.println("\nx1 vale: "+ x1 + "\n x2 vale: "+ x2);
		} 
		
		scan.close();

	}

}
