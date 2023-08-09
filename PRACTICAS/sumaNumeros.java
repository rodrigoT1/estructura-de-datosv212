import java.util.Scanner;
public class sumaNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los números
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma
        int suma = numero1 + numero2;

        // Cerrar el objeto Scanner
        scanner.close();

        // Imprimir el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }
}
