package tarefa04;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		/*
		 * 6) Elaborar um programa que efetue a leitura de três valores (A, B e C) e
		 * apresente como resultado final à soma dos quadrados dos três valores lidos.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		double quadradoA = a * a; 

		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		double quadradoB = b * b;

		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		double quadradoC = c * c;
		
		double result = quadradoA + quadradoB + quadradoC;
		
		System.out.println("A soma dos quadrados A, B e C é: " + result);
		
		sc.close();
	}

}
