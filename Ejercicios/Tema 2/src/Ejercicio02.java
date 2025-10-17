import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        boolean mayorQue = primerNumero > segundoNumero;
        boolean menorQue = primerNumero < segundoNumero;
        boolean igualQue = primerNumero == segundoNumero;
        boolean diferenteDe = primerNumero != segundoNumero;
        boolean mayorIgualQue = primerNumero >= segundoNumero;
        boolean menorIgualQue = primerNumero <= segundoNumero;

        System.out.println("¿10 es mayor que 10?: " + mayorQue);
        System.out.println("¿10 es menor que 10?: " + menorQue);
        System.out.println("¿10 es igual a 10?: " + igualQue);
        System.out.println("¿10 es diferente de 10?: " + diferenteDe);
        System.out.println("¿10 es mayor o igual que 10?: " + mayorIgualQue);
        System.out.println("¿10 es menor o igual que 10?: " + menorIgualQue);
    }
}
