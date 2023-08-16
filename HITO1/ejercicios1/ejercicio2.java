package PRACTICA_HITO_2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese un número impar (n): ");
            n = scanner.nextInt();
        } while (n % 2 == 0);

        int[] vn = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para Vn[" + i + "]: ");
            vn[i] = scanner.nextInt();
        }

        scanner.close();

        int firstElement = vn[0];
        int middleElement = vn[n / 2];
        int lastElement = vn[n - 1];

        double average = (firstElement + middleElement + lastElement) / 3.0;

        System.out.println("El promedio del primer elemento, el elemento central y el último es: " + average);
    }
}
