package condicaoIfElse;

import java.util.Scanner;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = sc.nextInt();
		
		if (idade > 59) {
			
			System.out.println("Ele é idoso");

		} else if (idade >= 18 && idade < 60) {
			
			System.out.println("É adulto");
			
		} else {
			
			System.out.println("É criança");
		}
	}

}
