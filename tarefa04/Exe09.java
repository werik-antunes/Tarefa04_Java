package tarefa04;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		/*
		 * 9) Ler o valor correspondente ao salário mensal (variável SM) de um
		 * trabalhador e também o valor do percentual de reajuste (variável PR) a ser
		 * atribuído. Apresentar o valor do novo salário (variável NS).
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("|Digite seu salario atual: ");
		double sm = sc.nextDouble();
		System.out.println("|Digite o valor percentual de reajuste: ");
		double pr = sc.nextDouble();
		double nvSal = sm + (sm * pr / 100);
		System.out.println("O novo salario é R$ " + nvSal + " Reais");
		
		sc.close();
	}

}
