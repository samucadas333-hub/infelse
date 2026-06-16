
import java.util.Scanner;

public class VendasPorLoja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][2];

        double totalGeral = 0;
        double maiorVenda = 0;

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {

                System.out.print("Loja " + (i + 1) + ", mes " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();

                totalGeral += vendas[i][j];

                if (i == 0 && j == 0) {
                    maiorVenda = vendas[i][j];
                } else if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }
        }

        System.out.printf("Total geral: R$ %.2f%n", totalGeral);
        System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);

        sc.close();
    }
}