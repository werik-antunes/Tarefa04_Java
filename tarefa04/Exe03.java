package tarefa04;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		/*
		 * 3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da
		 * diferença do primeiro valor pelo segundo.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int a = sc.nextInt();
		
		System.out.println("Digite outro numero interio");
		int b = sc.nextInt();
		
		int diferente = a - b;
		
		int quadrado = diferente * diferente;
		
		System.out.println("O resultado é: " + quadrado);
		sc.close();
	}

}
