


	import java.util.Scanner;

	public class BoletimDaTurma {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        double[] notas = new double[5];
	        double soma = 0;

	        // Leitura das notas e soma
	        for (int i = 0; i < notas.length; i++) {
	            System.out.print("Nota " + (i + 1) + ": ");
	            notas[i] = sc.nextDouble();
	            soma += notas[i];
	        }

	        // Cálculo da média
	        double media = soma / notas.length;

	        // Contagem de notas acima da média
	        int acimaMedia = 0;
	        for (int i = 0; i < notas.length; i++) {
	            if (notas[i] > media) {
	                acimaMedia++;
	            }
	        }

	        // Exibição dos resultados
	        System.out.printf("Media da turma: %.2f%n", media);
	        System.out.println("Acima da media: " + acimaMedia);

	        sc.close();
	    }
	}