package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano = 0;
		System.out.println("Informe um ano para verificar se é bisexto");
		ano = scan.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " é um ano Bissexto!");
		} else{
			System.out.println(ano + " não é um ano Bissexto!");
		}
		
		scan.close();
	}

}
