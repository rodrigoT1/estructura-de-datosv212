import java.util.Scanner;

public class Nomayor_Nomernor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int centralNumber = findCentralNumber(num1, num2, num3);
        System.out.println("El número central es: " + centralNumber);
    }

    public static int findCentralNumber(int num1, int num2, int num3) {
        // Ordenamos los números de menor a mayor utilizando un arreglo
        int[] nums = {num1, num2, num3};
        java.util.Arrays.sort(nums);

        // El número central es el segundo número en el arreglo ordenado
        return nums[1];
    }
}

