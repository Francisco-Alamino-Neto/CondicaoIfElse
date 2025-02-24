package condicaoIfElse;

import java.util.Scanner;

public class Problema4AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.print("Digite o ano: ");
		ano = sc.nextInt();
		
		   if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { // % = MMC, conhecido como módulo em java. != significa que é diferente de algo
	            System.out.println(ano + " é um ano bissexto.");
	        } else {
	            System.out.println(ano + " não é um ano bissexto.");
	        }
		
	}

}
