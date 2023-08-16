package PRACTICA_HITO_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> series = generateSeries(n);
        System.out.println(series);
    }

    public static List<Integer> generateSeries(int n) {
        List<Integer> series = new ArrayList<>();

        int currentValue = 1;
        int repetitionCount = 1;

        for (int i = 1; i <= n; i++) {
            series.add(currentValue);
            repetitionCount--;

            if (repetitionCount == 0) {
                currentValue++;
                repetitionCount = currentValue;
            }
        }

        return series;
    }
}
