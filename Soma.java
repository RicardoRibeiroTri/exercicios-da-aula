package IMC;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número? ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número? ");
		int n2 = sc.nextInt();
	
		int soma = n1 + n2;
		
		System.out.print("A soma desses dois números é de: " + soma);
		
		sc.close();
	}

}
