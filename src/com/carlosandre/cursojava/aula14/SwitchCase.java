package com.carlosandre.cursojava.aula14;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número da camisa: ");
		int numero = scan.nextInt();
		
		/* switch (numero) {
		case 1:
			System.out.println("1 -> Tiago Volpi");
			break;
		case 2:
			System.out.println("2 -> Daniel Alves");
			break;
		case 3:
			System.out.println("3 -> Arboleda");
			break;
		case 4:
			System.out.println("4 -> Miranda");
			break;
		case 5:
			System.out.println("5 -> Luan");
			break;
		case 6:
			System.out.println("6 -> Reinaldo");
			break;
		case 7:
			System.out.println("7 -> Rigoni");
			break;
		case 8:
			System.out.println("8 -> Liziero");
			break;
		case 9:
			System.out.println("9 -> Calleri");
			break;
		case 10:
			System.out.println("10 -> Benítez");
			break;
		case 11:
			System.out.println("11 -> Luciano");
			break;
		default:
			System.out.println("Não é titular");
			break;
		} */
		
		switch (numero) {
		case 1:
			System.out.println("1 -> Goleiro");
			break;
		case 2:
		case 6:
			System.out.println("2, 6 -> Laterais");
			break;
		case 5:
		case 8:
			System.out.println("5, 8 -> Volantes");
			break;
		case 10:
		case 11:
			System.out.println("10, 11 -> Meias");
			break;
		case 7:
		case 9:
			System.out.println("7, 9 -> Atacantes");
			break;
		default:
			System.out.println("Não é titular");
			break;
		}
	}

}
