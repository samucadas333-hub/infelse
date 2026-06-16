

public class DiasDaSemana {

    public static void main(String[] args) {

        String[] dias = {
            "Segunda",
            "Terça",
            "Quarta",
            "Quinta",
            "Sexta"
        };

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + dias[i]);
        }
    }
}