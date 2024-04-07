package tarefa04;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		/*
		 * 10) Em uma eleição sindical concorreram ao cargo de presidente três
		 * candidatos (A, B e C). Durante a apuração dos votos foram computados votos
		 * nulos e votos em branco, além dos votos válidos para cada candidato. Deve ser
		 * criado um programa de computador que efetue a leitura da quantidade de votos
		 * válidos para cada candidato, além de efetuar também a leitura da quantidade
		 * de votos nulos e votos em branco. Ao final o programa deve apresentar o
		 * número total de eleitores, considerando votos válidos, nulos e em branco; o
		 * percentual correspondente de votos válidos em relação à quantidade de
		 * eleitores; o percentual correspondente de votos válidos do candidato A em
		 * relação à quantidade de eleitores; o percentual correspondente de votos
		 * válidos do candidato B em relação à quantidade de eleitores; o percentual
		 * correspondente de votos válidos do candidato C em relação à quantidade de
		 * eleitores; o percentual correspondente de votos nulos em relação à quantidade
		 * de eleitores; e por último o percentual correspondente de votos em branco em
		 * relação à quantidade de eleitores.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de votos ao candidato A: ");
		int a = sc.nextInt();
		System.out.println("Digite a quantidade de votos ao candidato B: ");
		int b = sc.nextInt();
		System.out.println("Digite a quantidade de votos ao candidato C: ");
		int c = sc.nextInt();

		System.out.println("Digite a quantidade de votos em branco: ");
		int branco = sc.nextInt();
		System.out.println("Digite a quantidade de votos nulos: ");
		int nulo = sc.nextInt();
		sc.close();

		int totalEle = a + b + c + branco + nulo;

		double vtValido = (double) (a + b + c) / totalEle * 100;
		double vtValidoA = (double) a / totalEle * 100;
		double vtValidoB = (double) b / totalEle * 100;
		double vtValidoC = (double) c / totalEle * 100;
		double vtBanco = (double) branco / totalEle * 100;
		double vtNulo = (double) nulo / totalEle * 100;

		System.out.println("Numero total de eleitore é: " + totalEle);
		System.out.println("O numero de votos ao total de eleitore: " + vtValido +"%");
		System.out.println("O numero de votos ao candidato A: "+ vtValidoA + "%");
		System.out.println("O numero de votos ao candidato B: "+ vtValidoB + "%");
		System.out.println("O numero de votos ao candidato C: "+ vtValidoC +"%");
		System.out.println("O numero de votos em brancos: " + vtBanco + "%");
		System.out.println("O numero de votos em nulos: " + vtNulo + "%");

	}

}
