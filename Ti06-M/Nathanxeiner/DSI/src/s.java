
public class s {

	package exercicio;
	import java.util.Locale; import java.util.Scanner; public class LiberacaoEmprestimo {
	    public static void main(String[] args) {
	        Locale.setDefault(Locale.US);
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Renda mensal: ");         double renda = sc.nextDouble();
	        System.out.print("Idade: ");         int idade = sc.nextInt();
	        System.out.print("Tem restricao (1=sim / 0=nao): ");         boolean restricao = sc.nextInt() == 1;
	        boolean aprovado = renda >= 1500 && !restricao;
	        boolean faixaDeRisco = idade < 21 || renda < 1000;
	        System.out.printf("Aprovado: %b%n", aprovado);         System.out.printf("Faixa de risco: %b%n", faixaDeRisco);
	        sc.close();     }
	}
