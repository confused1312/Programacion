public class Ejercicio03 {
    public static void main(String[] args) {
        String miNombre = "David";
        int miEdad = 19;
        boolean esEstudiante = true;
        float miAltura = 1.90F;
        char miInicial = 'D';

        System.out.println("Nombre: " + miNombre + " - Tipo: " + ((Object)miNombre).getClass().getSimpleName());
        System.out.println("Edad: " + miEdad + " - Tipo: " + ((Object)miEdad).getClass().getSimpleName());
        System.out.println("¿Es estudiante?: " + esEstudiante + " - Tipo: " + ((Object)esEstudiante).getClass().getSimpleName());
        System.out.println("Altura: " + miAltura + " - Tipo: " + ((Object)miAltura).getClass().getSimpleName());
        System.out.println("Inicial: " + miInicial + " - Tipo: " + ((Object)miInicial).getClass().getSimpleName());
    }
}
