package Ejercicio2_6;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    enum Tipo {AHORROS, CORRIENTE}
    Tipo tipoCuenta;
    float saldo = 0;
    double tasaInteresMensual;
    boolean estaActiva; // Nuevo atributo para determinar si la cuenta está activa

    // Constructores

    public CuentaBancaria(String nombresTitular, String apellidosTitular, int númeroCuenta, Tipo tipoCuenta, double tasaInteresMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = númeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
        this.tasaInteresMensual = tasaInteresMensual;
        this.estaActiva = false;
    }

    public void imprimir() {
        System.out.println("Nombres del titular: " + nombresTitular);
        System.out.println("Apellidos del titular: " + apellidosTitular);
        System.out.println("Número de cuenta: " + númeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("La cuenta está activa: " + estaActiva);
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            if (saldo > 0) {
                estaActiva = true;
            }
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            if (saldo == 0) {
                estaActiva = false; // Marcar la cuenta como inactiva si el saldo es cero
            }
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor o igual que el saldo actual.");
            return false;
        }
    }

    public void aplicarInteresMensual() {
        saldo += saldo * (tasaInteresMensual / 100.0);
        System.out.println("Se ha aplicado el interés mensual. El nuevo saldo es: $" + saldo);
        if (saldo > 0) {
            estaActiva = true;
        } else {
            estaActiva = false;
        }
    }

    void compararCuentas(CuentaBancaria cuenta) {
        if (saldo >= cuenta.saldo) {
            System.out.println("El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parámetro.");
        } else {
            System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parámetro.");
        }
    }

    void transferencia(CuentaBancaria cuenta, int valor) {
        if (retirar(valor)) {
            cuenta.consignar(valor);
        }
    }
}
