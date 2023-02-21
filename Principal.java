
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static final int OPCION_ALTA_ALUMNO = 1;
    public static final int OPCION_MUESTRA_ALUMNOS = 2;
    public static final int OPCION_ORDENA_ALUMNOS = 3;
	public static final int OPCION_MOSTRAR_ALUMNOS_CURSO = 4;
    public static final int OPCION_ALTA_PARTE = 5;
    public static final int OPCION_MOSTRAR_PARTES = 6;
	public static final int OPCION_MOSTRAR_PARTES_ALUMNO = 7;
    public static final int OPCION_MOSTRAR_GRAVES = 8;
    public static final int OPCION_MOSTRAR_ALUMNOS_PARTES = 9;

    public static final int OPCION_SALIR = 10;

    /**
     *
     */
    public static void mostrarMenu() {
        System.out.println("==================================================");
        System.out.println(" PARTES ");
        System.out.println("==================================================");
        System.out.println(" 1.- ALTA ALUMNO ");
        System.out.println(" 2.- MUESTRA ALUMNOS ");
        System.out.println(" 3.- ORDENA ALUMNOS ");
        System.out.println(" 4.- MOSTRAR ALUMNOS CURSO ");
        System.out.println(" 5.- ALTA PARTE ");
        System.out.println(" 6.- MOSTRAR PARTES ");
        System.out.println(" 7.- MOSTRAR PARTES ALUMNO ");
        System.out.println(" 8.- MOSTRAR PARTES GRAVES");
        System.out.println(" 9.- MOSTRAR ALUMNOS CON PARTES ");
        System.out.println("10.- SALIR ");
        System.out.println("==================================================");
        System.out.print("Introduce una opción: ");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc;
        int opcion;
        do {
            mostrarMenu();
            sc = new Scanner(System.in);
            opcion = sc.nextInt();
            switch (opcion) {
                case OPCION_ALTA_ALUMNO -> {
                }
                case OPCION_MUESTRA_ALUMNOS -> {
                }
                case OPCION_ORDENA_ALUMNOS  -> {
                }
                case OPCION_MOSTRAR_ALUMNOS_CURSO -> {
                }
                case OPCION_ALTA_PARTE -> {
                }
                case OPCION_MOSTRAR_PARTES -> {
                }
                case OPCION_MOSTRAR_PARTES_ALUMNO -> {
                }
                case OPCION_MOSTRAR_GRAVES -> {
                }
                case OPCION_MOSTRAR_ALUMNOS_PARTES -> {
                }
                case OPCION_SALIR -> {
                }
                default -> {
                    System.out.println("Introduce una opción válida");
                }
            }
        } while (opcion != OPCION_SALIR);

    }
}
