import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int resto = numero % 2;
        System.out.println("El número " + numero + " es impar (resto al dividir entre 2): " + resto);
    }
}
