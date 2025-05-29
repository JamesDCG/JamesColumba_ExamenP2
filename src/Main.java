import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("--- Cuenta de Ahorros ---");
            System.out.println("1. Numero de Retiros");
            System.out.println("2. Numero de Depositos");
            System.out.println("3. Saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->System.out.println("Ingrese ");
                case 2 ->System.out.println("Numero de retiros: " );
                case 3 ->System.out.println("Numero de depositos: " );

            }
        } while (opcion != 4);
    }
}