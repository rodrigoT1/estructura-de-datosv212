package PRACTICA_HITO_2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        n = scanner.nextInt();

        int[][] mat = new int[n][n];

        // Llenar la matriz con valores ingresados por el usuario
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor para MAT[" + i + "][" + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        int sumDiagonal = sumDiagonalElements(mat);

        System.out.println("La suma de los elementos de la diagonal principal es: " + sumDiagonal);

        scanner.close();
    }

    public static int sumDiagonalElements(int[][] mat) {
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        return sum;
    }
}
