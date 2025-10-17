import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int tercerNumero = scanner.nextInt();

        int suma = primerNumero + segundoNumero + tercerNumero;
        float promedio = (int) (suma / 3F);
        float operacion = (float) (primerNumero * segundoNumero) / tercerNumero;

        System.out.println("Suma de los tres números: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Resultado de (número1 * número2) / número3: " + operacion);
    }
}
