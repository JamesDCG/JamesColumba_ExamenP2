public class JC_Cuenta {

    public float saldo;
    public int nDepositos;
    public int nRetiros;
    public float tasaAnual;

    public JC_Cuenta (float psaldo, int depositos, int retiros, float tasaanual){

        this.saldo = psaldo;
        this.nDepositos = depositos;
        this.nRetiros = retiros;
        this.tasaAnual = tasaanual;

    }

    public float getSaldo(){
        return saldo;
    }

    public int getnDepositos(){
        return  nDepositos;
    }

    public int getnRetiros(){
        return nRetiros;
    }

    public float getTasaAnual(){
        return tasaAnual;
    }

    public void Cuenta(float saldo, float tasa){
        System.out.println("Saldo en la Cuenta:" + saldo);
        System.out.println("Tasa anual" + tasa);

    }

    public void Depositar(float cantidad){

        saldo += cantidad;

    }

    public void Retirar(float cantidad){

        saldo -= cantidad;

    }
}

