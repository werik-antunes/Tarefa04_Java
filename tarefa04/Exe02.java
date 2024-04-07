package tarefa04;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		/*
		 * 2) Elaborar um programa que calcule e apresente o volume de uma caixa
		 * retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o comprimeto da caixa:");
		double comp = sc.nextDouble();
		
		System.out.println("Digite a largura da caixa:");
		double largura = sc.nextDouble();
		
		System.out.println("Digite a altura da caixa:");
		double altura = sc.nextDouble();
		
		double volume = comp * largura * altura;
		System.out.println("O resultado é: " + volume);
		sc.close();
	}

}
