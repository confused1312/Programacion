import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Tienes carnet de conducir? (true/false): ");
        boolean carnet = scanner.nextBoolean();

        boolean mayorDeEdad = edad > 21;
        boolean puedeAlquilar = mayorDeEdad && carnet;

        System.out.println("¿Eres mayor de 21 años?: " + mayorDeEdad);
        System.out.println("¿Tienes carnet?: " + carnet);
        System.out.println("¿Puedes alquilar un coche? (AND): " + puedeAlquilar);


    }
}
