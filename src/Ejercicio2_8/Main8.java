package Ejercicio2_8;

public class Main8 {
    public static void main(String[] args) {

        Avion avion1 = new Avion("Airbus", 4);
        Avion avion2 = avion1;

        System.out.println("Valores del primer avion:");
        System.out.println("Fabricante: " + avion1.getFabricante());
        System.out.println("Número de motores: " + avion1.getNumeroMotores());
        System.out.println("--------------------------------");
        System.out.println("Valores del segundo avion:");
        System.out.println("Fabricante: " + avion2.getFabricante());
        System.out.println("Número de motores: " + avion2.getNumeroMotores());
        avion2.setFabricante("Stealth");
        System.out.println("Fabricante del primer avion: " + avion1.getFabricante());
    }
}
