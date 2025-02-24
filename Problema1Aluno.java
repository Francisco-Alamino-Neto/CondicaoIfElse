package condicaoIfElse;

import java.util.Scanner;

public class Problema1Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int anos;
		
		System.out.print("Digite a sua nota: ");
		anos = sc.nextInt();
		
		if (anos > 7) {
			
			System.out.println("Aprovado");

		} else if (anos < 7) {
			
			System.out.println("Reprovado");

		}
	}

}
