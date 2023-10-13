package Ejercicio2_3;

public class Main3 {
    public static void main(String[] args) {
        Automovil Auto1 = new Automovil("FORD", 2018, 3, Automovil.tipocom.DIESEL, Automovil.tipoA.EJECUTIVO, 5, 6, 250, Automovil.tipocolor.NEGRO, true);
        System.out.println("Auto1");
        Auto1.imprimir();
        Auto1.setVelocidadactual(100);
        System.out.println("\nVelocidad actual del automóvil automatico: " +Auto1.velocidadactual + " km/h");
        System.out.println("Velocidad actual:" + Auto1.velocidadactual);
        Auto1.acelerar(20);
        System.out.println("Velocidad actual:" + Auto1.velocidadactual);
        Auto1.desacelerar(50);
        System.out.println("Velocidad actual:" + Auto1.velocidadactual);
        Auto1.frenar();
        System.out.println("velocidad actual:" + Auto1.velocidadactual);
        Auto1.desacelerar(20);
        if (Auto1.tienemultas()) {
            System.out.println("El automóvil automático tiene multas.");
            System.out.println("Valor total de multas: $" + Auto1.getValormulta());
        } else {
            System.out.println("El automóvil automático no tiene multas.");

        }
        System.out.println("-----------------------------------");
        Automovil Auto2 = new Automovil("FORD", 2022, 4, Automovil.tipocom.GASOLINA, Automovil.tipoA.COMPACTO, 4, 5, 300, Automovil.tipocolor.AZUL, false);
        System.out.println("Auto 2");
        Auto2.imprimir();
        Auto2.setVelocidadactual(90);
        System.out.println("\nVelocidad actual del automóvil manual: " +Auto2.velocidadactual + " km/h");
        System.out.println("Velocidad actual:"+Auto2.velocidadactual);
        Auto2.acelerar(20);
        System.out.println("Velocidad actual:"+Auto2.velocidadactual);
        Auto2.desacelerar(50);
        System.out.println("Velocidad actual:"+Auto2.velocidadactual);
        Auto2.desacelerar(20);
        if (Auto2.tienemultas()) {
            System.out.println("El automóvil manual tiene multas.");
            System.out.println("Valor total de multas: $" + Auto2.getValormulta());
        } else {
            System.out.println("El automóvil manual no tiene multas.");
        }
        System.out.println("----------------------------");

    }
}
