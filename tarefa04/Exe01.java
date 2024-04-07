package tarefa04;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		/*
		 * 1) Ler quatro números inteiros e apresentar o resultado da adição e
		 * multiplicação, baseando-se na utilização do conceito da propriedade
		 * distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser
		 * somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e
		 * por fim C com D. Perceba que será necessário efetuar seis operações de adição
		 * e seis operações de multiplicação e apresentar doze resultados de saída.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int a = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int b = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
		int c = sc.nextInt();
		System.out.println("Digite o quarto valor:");
		int d = sc.nextInt();

		int soma1 = a + b;
		int soma2 = a + c;
		int soma3 = a + d;
		int soma4 = b + c;
		int soma5 = b + d;
		int soma6 = d + c;

		int multi1 = a * b;
		int multi2 = a * c;
		int multi3 = a * d;
		int multi4 = b * c;
		int multi5 = b * d;
		int multi6 = d * c;

		System.out.println("Resultado a adição:");
		System.out.println("A soma dos valores " + a + " e " + b + " o resultado é: " + soma1);
		System.out.println("A soma dos valores " + a + " e " + c + " o resultado é: " + soma2);
		System.out.println("A soma dos valores " + a + " e " + d + " o resultado é: " + soma3);
		System.out.println("A soma dos valores " + b + " e " + c + " o resultado é: " + soma4);
		System.out.println("A soma dos valores " + b + " e " + d + " o resultado é: " + soma5);
		System.out.println("A soma dos valores " + d + " e " + c + " o resultado é: " + soma6);

		System.out.println("Resultado a multiplicação:");
		System.out.println("A multiplicação dos valores " + a + " e " + b + " o resultado é: " + multi1);
		System.out.println("A multiplicação dos valores " + a + " e " + c + " o resultado é: " + multi2);
		System.out.println("A multiplicação dos valores " + a + " e " + d + " o resultado é: " + multi3);
		System.out.println("A multiplicação dos valores " + b + " e " + c + " o resultado é: " + multi4);
		System.out.println("A multiplicação dos valores " + b + " e " + d + " o resultado é: " + multi5);
		System.out.println("A multiplicação dos valores " + d + " e " + c + " o resultado é: " + multi6);

		sc.close();
	}

}
