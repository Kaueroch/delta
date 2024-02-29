package lições;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a");
		double a = sc.nextDouble();
		System.out.println("Digite o valor b");
		double b = sc.nextDouble();
		System.out.println("Digite o valor c");
		double c = sc.nextDouble();
		double delta = (b = Math.pow(b,2) - 4) * a * c;
		if (delta < 0) {
			System.out.println("Não existem Raízes negativas");
		} else {
			double X1 = (-b + delta) / 2 * a;
			double X2 = (-b - delta) / 2 * a;
			System.out.println("Delta: " + delta);
			System.out.println("X1: " + X1);
			System.out.println("X2: " + X2);
		}
	}

}
