package aula03;

import java.util.Locale;
import java.util.Scanner;


public class Explicação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.print("Digite seu nome: ");
String nome = sc.next();

System.out.print("Digite sua idade: ");
int idade = sc.nextInt();

System.out.print("Digite sua altura: ");
double altura = sc.nextDouble();

System.out.printf("%s", nome);

	}

}
