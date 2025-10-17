import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean estudiante = scanner.nextBoolean();

        boolean menorDe = edad < 26;
        boolean descuentoEspecial = menorDe && estudiante;


        System.out.println("¿Eres menor de 26 años?: " + menorDe);
        System.out.println("¿Eres estudiante?: " + estudiante);
        System.out.println("¿NO eres estudiante?: " + (!estudiante));
        System.out.println("¿Tienes descuento de joven? (menor de 26): " + menorDe);
        System.out.println("¿Tienes descuento de estudiante?: " + estudiante);
        System.out.println("¿Tienes descuento especial? (menor de 26 AND estudiante): " + descuentoEspecial);



    }
}

