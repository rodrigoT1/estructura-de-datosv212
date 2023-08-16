package PRACTICA_HITO_2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un número impar (n): ");
            n = scanner.nextInt();
        } while (n % 2 == 0);

        int[][] mat = generateRMatrix(n);
        printMatrix(mat);

        scanner.close();
    }

    public static int[][] generateRMatrix(int n) {
        int[][] mat = new int[n][n];

        // Llenar la matriz con 1s y 0s para formar la letra "R"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || (i == j && i >= n / 2) || j == 0) {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        return mat;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
