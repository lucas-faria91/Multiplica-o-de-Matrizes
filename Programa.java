package Atividade;

public class Programa {

	public static void main(String[] args) {
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] m2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        if (m1[0].length != m2.length) {
            System.out.println("Número de colunas de m1 não é igual ao número de linhas de m2. Não é possível multiplicar as matrizes.");
            return;
        }

        int[][] resultado = MultiplicacaoMatrizes.multiplicarMatrizes(m1, m2);

        System.out.println("Resultado da multiplicação das matrizes:");
        MultiplicacaoMatrizes.imprimirMatriz(resultado);
    }
}