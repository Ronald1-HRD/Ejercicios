package Ejercicio2_5;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    double TasaInteresMensual;
    //Constructtores

    public CuentaBancaria(String nombresTitular, String apellidosTitular, int númeroCuenta, tipo tipoCuenta,double tasaInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = númeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo=0;
        this.TasaInteresMensual=tasaInteresMensual;
    }
    public void imprimir() {
        System.out.println("Nombres del titular: " + nombresTitular);
        System.out.println("Apellidos del titular: " + apellidosTitular);
        System.out.println("Número de cuenta: " + númeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }
    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }
    boolean consignar(int valor) {

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + "en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + "en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }
    public void aplicarInteresMensual(){
        saldo += saldo * (TasaInteresMensual / 100.0);
        System.out.println("Se ha aplicado el interés mensual el Nuevo saldo es: $" + saldo);
    }
}
