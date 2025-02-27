package condicaoIfElse;

import java.util.Scanner;

import java.util.Random;

public class NumeroAleatorio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random gerador = new Random();
		
		int numeroAleatorio = gerador.nextInt(10) + 1;
		
		int numeroAdivinhado;
		
		System.out.println("Olá! Este é um programa para adivinhação de um número misterioso.");
		System.out.println("De 1 a 10, qual número você acha que o número misterioso é?");	
		numeroAdivinhado = sc.nextInt();
		
		if (numeroAleatorio == numeroAdivinhado) {
			
			System.out.println("Parabéns, você adivinhou o número misterioso!");
			
		} else if (numeroAleatorio != numeroAdivinhado) {
			
			System.out.println("Infelizmente você errou, o número misterioso era " + numeroAleatorio + ".");
			
		}
		
		sc.close();
	}

}
