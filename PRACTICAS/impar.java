import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 1) {
                System.out.println("CORRECTO");
                break;
            }
        } while (true);

        scanner.close();
    }
}
