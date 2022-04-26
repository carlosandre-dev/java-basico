package com.carlosandre.cursojava.aula14.labs;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String perguntaA, perguntaB, perguntaC, perguntaD, perguntaE;
		int contador = 0;
		
		System.out.println("Telefonou para a vítima?: ");
		perguntaA = scan.next();
		
		System.out.println("Esteve no local do crime?: ");
		perguntaB = scan.next();
		
		System.out.println("Mora perto da vitima?: ");
		perguntaC = scan.next();
		
		System.out.println("Devia para a vítima?: ");
		perguntaD = scan.next();
		
		System.out.println("Já trabalhou com a vítima?: ");
		perguntaE = scan.next();
		
		if(perguntaA.equalsIgnoreCase("S") || (perguntaA.equalsIgnoreCase("s"))){
			contador++;
		}
		
		if(perguntaB.equalsIgnoreCase("S") || (perguntaB.equalsIgnoreCase("s"))){
			contador++;
		}
		
		if(perguntaC.equalsIgnoreCase("S") || (perguntaC.equalsIgnoreCase("s"))){
			contador++;
		}
		
		if(perguntaD.equalsIgnoreCase("S") || (perguntaD.equalsIgnoreCase("s"))){
			contador++;
		}
		
		if(perguntaE.equalsIgnoreCase("S") || (perguntaE.equalsIgnoreCase("s"))){
			contador++;
		}
		
		if(contador == 2) {
			System.out.println("Pessoa suspeita");
		} else if(contador == 3 || contador == 4) {
			System.out.println("Cúmplice");
		} else if(contador == 5){
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}
		
		scan.close();

	}

}
