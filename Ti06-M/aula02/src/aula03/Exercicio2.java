package aula03;

import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numro de celsius");
		double celsius = sc.nextDouble();
		
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.printf("Temperatura em celsius: %.3f" + "%n", celsius);
	
		System.out.printf
		("Equivalente em fahrenheit: %.2f %n", fahrenheit);
		
		
		//F= C*1.8 + 32
		
		
		

	}

}
