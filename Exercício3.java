package Exercícios;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o nome da primeira pessoa: ");
        String pessoa1 = sc.nextLine();
        System.out.print("Digite a altura da primeira pessoa: ");
        double alt1 = sc.nextDouble();
        
        sc.nextLine(); 
        
        System.out.print("Digite o nome da segunda pessoa: ");
        String pessoa2 = sc.nextLine();
        System.out.print("Digite a altura da segunda pessoa: ");
        double alt2 = sc.nextDouble();
        
        double media = (alt1 + alt2) / 2;
        
        System.out.printf("A altura média entre " + pessoa1 + " e " + pessoa2 + " é de " + "%.2f", media);
        
        sc.close();

	}

}
