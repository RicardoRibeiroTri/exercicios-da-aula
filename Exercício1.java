package Exercícios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite a largura do cômodo: ");
    Double larg = sc.nextDouble();
    
    System.out.print("Digite o comprimento do cômodo: ");
    Double comp = sc.nextDouble();
    
    System.out.print("Digite o valor do metro quadrado do: ");
    Double vmq = sc.nextDouble();
    
    double area = larg * comp;
    
    double ct = area * vmq;
    
    System.out.printf("O valor total do metro quadrado é: %.2f\n", ct);
    
    sc.close();
		

	}

}
