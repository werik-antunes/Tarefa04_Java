package tarefa04;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		/*
		 * 5) Elaborar um programa que efetue a apresentação do valor da conversão em
		 * dólar de um valor lido em real. O programa deve solicitar o valor da cotação
		 * do dólar e também a quantidade de reais disponível com o usuário, para que
		 * seja apresentado o valor em moeda americana.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto é a cotação do dolar que voçê tem: ");
		double cotaDolar = sc.nextDouble();
		System.out.println("Quantos reais estão disponiveis: ");
		double quantDisponivel = sc.nextDouble();

		double cotas = quantDisponivel / cotaDolar;

		System.out.println("A cotação de Dolar em Reais é R$: " + cotas);
		sc.close();
	}

}
