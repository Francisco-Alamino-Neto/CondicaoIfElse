package condicaoIfElse;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double alt, peso, imc;
		
		System.out.print("Peso: ");	
		peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		alt = sc.nextDouble();

		imc = peso / (alt * alt);
		
		System.out.print("O IMC é: ");
		System.out.println(String.format("%.2f", imc));
		
		if (imc < 18.5) {
			
			System.out.println("Baixo peso");

		} else if (imc >= 18.5 && imc < 25) {
			
			System.out.println("Normal");

		} else if (imc >= 25 && imc < 30) {
			
			System.out.println("Sobrepeso");
			
		} else if (imc >= 30) {
			
			System.out.println("Obesidade");

		}
		
		sc.close();

	}

}
