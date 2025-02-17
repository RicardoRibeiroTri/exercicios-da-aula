package Exercícios;

import java.util.Scanner;

public class ExercícioB {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus fahrenheit: ");
		double graus = sc.nextDouble();
		
		double frnt = ((graus - 32) * 5) / 9;
		
		System.out.printf("A temperatura em graus celsius é: %.2f graus fahrenheit.",frnt);
		
		sc.close();
		
	}

}
