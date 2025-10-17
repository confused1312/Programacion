import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el salario por hora: ");
        int salarioPorHora = scanner.nextInt();

        System.out.print("Introduce las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("¿Has hecho horas extra? (true/false): ");
        boolean horasExtra = scanner.nextBoolean();

        int horasExtraCantidad = horasTrabajadas - 40;
        int horasNormales = horasTrabajadas - horasExtraCantidad;
        boolean masDe40Horas = horasTrabajadas > 40;
        boolean aplicarHorasExtra = masDe40Horas && horasExtra;
        float salarioHorasNormales = horasNormales * salarioPorHora;
        float salarioHorasExtra = horasExtraCantidad * (salarioPorHora * 2);
        float salarioTotal = salarioHorasNormales + salarioHorasExtra;

        System.out.println("Horas normales (máximo 40): " + horasNormales);
        System.out.println("Horas extra: " + horasExtraCantidad);
        System.out.println("¿Trabajaste más de 40 horas?: " + masDe40Horas);
        System.out.println("¿Tienes derecho a horas extra?: " + horasExtra);
        System.out.println("¿Se aplican horas extra? (>40 AND permitido): " + aplicarHorasExtra);
        System.out.println("Salario por horas normales: " + salarioHorasNormales + "€");
        System.out.println("Salario por horas extra (al doble): " + salarioHorasExtra + "€");
        System.out.println("Salario total: " + salarioTotal + "€");
    }
}
