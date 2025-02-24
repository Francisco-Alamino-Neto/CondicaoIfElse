package condicaoIfElse;

import java.util.Scanner;

public class DesafioNumeroMisterioso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o número: ");
		numero = sc.nextInt();
		
		   if (numero > 0) {
			   
			   System.out.println(numero + " é positivo.");
			   
		   } else if (numero < 0) {
			   
			   System.out.println(numero + " é negativo.");
			   
		   } else {
			   
			   System.out.println(numero + " é igual a zero.");
			   
		   }
		sc.close();
	}

}
