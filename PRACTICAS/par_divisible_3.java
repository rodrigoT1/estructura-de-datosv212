import java.util.Scanner;

public class par_divisible_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();

        scanner.close();

        if (esPar(x) && esDivisibleEntreTres(x)) {
            System.out.println("Correcto y es divisible con 3.");
        } else {
            System.out.println("Error y no es divisible con 3");
        }
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static boolean esDivisibleEntreTres(int num) {
        return num % 3 == 0;
    }
}

