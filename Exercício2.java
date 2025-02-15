package Exercícios;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
				
     System.out.print("Digite a largura do quadro: ");
     double larg = sc.nextDouble();
     
     System.out.print("Digite a altura do quadro: ");
     double alt = sc.nextDouble();
     
     double area = larg * alt;
     double peri = (2 * larg) + (2 * alt);
     double diag = Math.sqrt(alt * alt + larg * larg);
     
     System.out.println("A área do quadro é de: " + area);
     System.out.println("O perímetro do quadro mede: " + peri);
     System.out.printf("A diagonal do quadro mede: " + "%.4f",diag);
     
     sc.close();
     
	}


}
