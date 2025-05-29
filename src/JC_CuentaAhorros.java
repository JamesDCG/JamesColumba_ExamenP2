public class JC_CuentaAhorros extends JC_Cuenta {

    private boolean activa;

    public JC_CuentaAhorros(float psaldo, int depositos, int retiros, float tasaanual) {
        super(psaldo, depositos, retiros, tasaanual);
    }


    public void CuentaAhorros (float saldo, float tasa){
        System.out.println("Saldo en la Cuenta:" + saldo);
        System.out.println("Tasa anual" + tasa);
    }

    public boolean isActiva(){
        return activa;
    }

    public void Depositar(float cantidad) {

        super.Depositar(cantidad);
    }

    public void Retirar(float cantidad) {

        super.Retirar(cantidad);
    }

    public void Imprimir(){
        System.out.println("Saldo en la cuenta de ahorros: " + getSaldo());
        System.out.println("Numero de Depositos: " + getnDepositos());
        System.out.println("Numero de Retiros: " + getnRetiros());
        System.out.println("Tasa : " + getTasaAnual());
    }
}
