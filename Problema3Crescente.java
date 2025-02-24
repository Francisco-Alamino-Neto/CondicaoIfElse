package condicaoIfElse;

import java.util.Scanner;

public class Problema3Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		n3 = sc.nextInt();
		
		if (n1 < n2 && n2 < n3) {
			
			System.out.println("Em ordem crescente: " + n1 + ", " + n2 + ", " + n3);

		} else if (n1 < n3 && n3 < n2) {
			
			System.out.println("Em ordem crescente: " + n1 + ", " + n3 + ", " + n2);

		} else if (n2 < n1 && n1 < n3) {
			
			System.out.println("Em ordem crescente: " + n2 + ", " + n1 + ", " + n3);
			
		} else if (n3 < n1 && n1 < n2) {
			
			System.out.println("Em ordem crescente: " + n3 + ", " + n1 + ", " + n2);

		} else if (n2 < n3 && n3 < n1) {
			
			System.out.println("Em ordem crescente: " + n2 + ", " + n3 + ", " + n1);

		} else if (n3 < n2 && n2 < n1) {
		
			System.out.println("Em ordem crescente: " + n3 + ", " + n2 + ", " + n1);
		}
	}

}
