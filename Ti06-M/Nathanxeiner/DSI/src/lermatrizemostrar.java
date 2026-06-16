import java.util.Scanner;

public class lermatrizemostrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [][] mat = new int [2][3];
		
		// Leitura da matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Elemento [" + i + "][" + j + "]: ");
				mat[i][j] = sc.nextInt();
			
			}
				
		}
		
	 //Exibição da matriz
		System.out.println("Matriz:");
		
		for (int i = 0; i < mat.length; i++) { 
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");

			}
			
			System.out.println();
		}
		sc.close();

	}

}
