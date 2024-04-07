package tarefa04;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		/*
		 * 7) Elaborar um programa que efetue a leitura de três valores (A, B e C) e
		 * apresente como resultado final o quadrado da soma dos três valores lidos.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
	
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double soma = a + b + c;
		double mult = soma * soma;
		
		System.out.println("O resultado final de A, B e C é: " + mult);
		sc.close();
	}

}
