import java.util.Scanner;

public class suma_pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números (n): ");
        int n = scanner.nextInt();

        int sumaPares = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (esPar(numero)) {
                sumaPares += numero;
            }
        }

        scanner.close();

        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
