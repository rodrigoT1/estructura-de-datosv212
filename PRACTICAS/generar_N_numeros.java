import java.util.Scanner;

public class generar_N_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
        }
    }
}
