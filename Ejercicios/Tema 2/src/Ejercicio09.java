import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        int primerExamen = scanner.nextInt();

        System.out.print("Introduce la nota del segundo examen: ");
        int segundoExamen = scanner.nextInt();

        System.out.print("Introduce la nota del tercer examen: ");
        int tercerExamen = scanner.nextInt();

        int suma = primerExamen + segundoExamen + tercerExamen;
        float media = (int) (suma / 3F);
        boolean aprobado = media >= 5;
        boolean notable = media >= 7;
        boolean sobresaliente = media >= 9;

        System.out.println("¿Ha aprobado? (>=5): " + aprobado);
        System.out.println("¿Tiene notable? (>=7): " + notable);
        System.out.println("¿Tiene sobresaliente? (>=9): " + sobresaliente);
    }
}
