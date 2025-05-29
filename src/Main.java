import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta hotel = new Cuenta(6);

        int opcion;
        do {
            System.out.println("\n--- Gestión de Hotel ---");
            System.out.println("1. Crear nueva reserva");
            System.out.println("2. Consultar disponibilidad");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                case 2 ->
                case 3 ->

            }
        } while (opcion != 3);
    }
}