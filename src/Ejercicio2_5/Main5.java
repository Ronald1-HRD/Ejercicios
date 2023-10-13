package Ejercicio2_5;

public class Main5 {
    public static void main(String[] args) {
        CuentaBancaria cuenta=new CuentaBancaria("Pedro","Perez",684512369, CuentaBancaria.tipo.AHORROS,2);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.aplicarInteresMensual();
    }
}
