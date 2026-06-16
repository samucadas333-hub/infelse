

public class DobroDeCadaElemento {

    public static void main(String[] args) {

        int[] valores = {5, 12, 3, 8};

        for (int i = 0; i < valores.length; i++) {

            int dobro = valores[i] * 2;

            System.out.println(
                "Valor: " + valores[i] +
                " → Dobro: " + dobro
            );
        }
    }
}