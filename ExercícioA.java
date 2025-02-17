package Exercícios;

import java.util.Scanner;

public class ExercícioA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus celsius: ");
		double graus = sc.nextDouble();
		
		double frnt = graus * 9 / 5 + 32;
		
		System.out.printf("A temperatura em graus fahrenheit é: " + "%.2f",frnt);
		
		sc.close();
		
		
	}

}
