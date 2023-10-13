package Ejercicio2_6;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("Cuenta Bancaria 1");
        CuentaBancaria cuenta=new CuentaBancaria("Pedro","Perez",684512369, CuentaBancaria.Tipo.AHORROS,2);
        cuenta.imprimir();
        System.out.println("------------------------------------------------------");
        System.out.println("Cuenta Bancaria 2");
        CuentaBancaria cuenta2=new CuentaBancaria("Pablo","Pinzon",1254789675, CuentaBancaria.Tipo.AHORROS,2);
        cuenta2.imprimir();
        System.out.println("-----------------------------------");
        cuenta.consignar(200000);
        cuenta2.consignar(100000);
        cuenta.compararCuentas(cuenta2);
        cuenta.transferencia(cuenta2,50000);
        cuenta.consultarSaldo();
        cuenta2.consultarSaldo();
        cuenta.retirar(150000);
        cuenta.consultarSaldo();
        cuenta.consignar(50000);
        cuenta.consultarSaldo();
        cuenta2.consultarSaldo();
        if (cuenta.estaActiva) {
            System.out.println("La cuenta está activa.");
        } else {
            System.out.println("La cuenta está inactiva.");
        }
    }
}
