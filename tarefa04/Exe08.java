package tarefa04;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		/*
		 * 8) Elaborar um programa de computador que efetue a leitura de quatro valores
		 * inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o
		 * resultado do produto (variável P) do primeiro com o terceiro valor e o
		 * resultado da soma (variável S) do segundo com o quarto valor.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int d = sc.nextInt();
		int p = a + c;
		int s = b + d;
		System.out.println("O resultado do produto é: " + p);
		System.out.println("O resultado do produto é: " + s);
		
		sc.close();
	}

}
