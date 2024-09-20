package Atividade;

public class MultiplicacaoMatrizes {
	public static int[][] multiplicarMatrizes(int[][] m1, int[][] m2) {
		int linhasM1 = m1.length;
		int colunasM1 = m1[0].length;
		int colunasM2 = m2[0].length;

		int[][] resultado = new int[linhasM1][colunasM2];

		for (int i = 0; i < linhasM1; i++) {
			for (int j = 0; j < colunasM2; j++) {
				//System.out.println("Calculando resultado[" + i + "][" + j + "]:");
				for (int k = 0; k < colunasM1; k++) {
					System.out.println("  m1[" + i + "][" + k + "] * m2[" + k + "][" + j + "]");
					resultado[i][j] += m1[i][k] * m2[k][j];
					System.out.println("  Resultado parcial: " + resultado[i][j]);
				}
				System.out.println("Resultado final: " + resultado[i][j] + "\n");
			}
		}

		return resultado;
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}