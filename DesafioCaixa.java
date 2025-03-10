package condicaoIfElse;

import java.util.Scanner;

public class DesafioCaixa {

	public static void main(String[] args) {
		    
	 Scanner scanner = new Scanner(System.in);
		    
	 double saldo = 0.0;
	 int opcao;

		do {
	            System.out.println("\n--- Caixa Eletrônico ---");
	            System.out.println("1. Consultar Saldo");
	            System.out.println("2. Depositar");
	            System.out.println("3. Sacar");
	            System.out.println("4. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            if (opcao == 1) {
	                System.out.println("Saldo atual: R$ " + saldo);
	            } else if (opcao == 2) {
	                System.out.print("Digite o valor a depositar: R$ ");
	                double valorDeposito = scanner.nextDouble();
	                if (valorDeposito > 0) {
	                    saldo += valorDeposito;
	                    System.out.println("Depósito realizado com sucesso.");
	                } else {
	                    System.out.println("Valor inválido para depósito.");
	                }
	            } else if (opcao == 3) {
	                System.out.print("Digite o valor a sacar: R$ ");
	                double valorSaque = scanner.nextDouble();
	                if (valorSaque > 0 && valorSaque <= saldo) {
	                    saldo -= valorSaque;
	                    System.out.println("Saque realizado com sucesso.");
	                } else if (valorSaque > saldo) {
	                    System.out.println("Saldo insuficiente para o saque.");
	                } else {
	                    System.out.println("Valor inválido para saque.");
	                }
	            } else if (opcao == 4) {
	                System.out.println("Obrigado por utilizar o caixa eletrônico.");
	            } else {
	                System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 4);

	        scanner.close();
	    }
	}
