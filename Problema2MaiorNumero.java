package condicaoIfElse;

import java.util.Scanner;

public class Problema2MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			
			System.out.println("O maior número é: " + n1);

		} else if (n1 < n2) {
			
			System.out.println("O maior número é: " + n2);

		}
	}

}
