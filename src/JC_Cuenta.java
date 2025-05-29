public class JC_Cuenta {
    private float saldo;
    private int nDepositos;
    private int nRetiros;
    private float tasaAnual;

    public JC_Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.nDepositos = 0;
        this.nRetiros = 0;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public int getnDepositos() {
        return nDepositos;
    }

    public int getnRetiros() {
        return nRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            nDepositos++;
            System.out.println("Depósito de " + cantidad + " realizado.");
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            nRetiros++;
            System.out.println("Retiro de " + cantidad + " realizado.");
        } else {
            System.out.println("Saldo insuficiente o cantidad inválida.");
        }
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de depósitos: " + nDepositos);
        System.out.println("Número de retiros: " + nRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
    }
}
