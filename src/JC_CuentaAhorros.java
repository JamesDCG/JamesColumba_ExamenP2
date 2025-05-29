public class JC_CuentaAhorros extends JC_Cuenta {
    private boolean activa;

    public JC_CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = saldoInicial >= 1000;
    }

    public boolean isActiva() {
        return activa;
    }

    public void depositar(float cantidad) {
        super.depositar(cantidad);
        if (getSaldo() >= 1000) {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (getSaldo() - cantidad >= 500) {
            super.retirar(cantidad);
        } else {
            System.out.println("Saldo mínimo de $500 requerido.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuenta activa: " + (isActiva() ? "Sí" : "No"));
    }
}
