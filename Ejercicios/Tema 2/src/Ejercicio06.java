import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        int precioProducto = scanner.nextInt();

        System.out.print("Introduce el porcentaje de descuento: ");
        int porcentajeDescuento = scanner.nextInt();

        int cantidadDescuento = (precioProducto * porcentajeDescuento) / 100;
        int precioFinal = precioProducto - cantidadDescuento;

        System.out.println("Precio original: " + precioProducto);
        System.out.println("Descuento (" + porcentajeDescuento + "%): " + cantidadDescuento);
        System.out.println("Precio final: " + precioFinal);
    }
}
