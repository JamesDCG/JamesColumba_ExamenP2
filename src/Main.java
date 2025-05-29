import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JC_CuentaAhorros cuenta = new JC_CuentaAhorros(1000, 5);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.imprimir();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    float deposito = scanner.nextFloat();
                    cuenta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    float retiro = scanner.nextFloat();
                    cuenta.retirar(retiro);
                    break;
                case 4:
                    System.out.println("Cerrar");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
