package IMC;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o seu nome? ");
		String name = sc.nextLine();
		
		System.out.print("Bom dia " + name +"! " + "Tudo bem com você? ");
		System.out.print("Qual é a sua altura (em metros)? ");
		double alt = sc.nextDouble();
		
		System.out.print("Qual é o seu peso (em kg)? ");
		double peso = sc.nextDouble();
	
	    double imc = peso / (alt * alt);
	    
	    System.out.printf("O seu IMC é " + "%.2f",imc);
	    
	    if (imc < 18.5) {
            System.out.println(", ou seja, você está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Você está no peso ideal.");
        } else {
            System.out.println("Você está acima do peso.");
        }
	    
	    sc.close();
	
	}

}
