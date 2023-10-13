package Ejercicio2_1;

public class Main1 {
    public static void main(String[] args) {
        Persona DatoPersona1= new Persona ("Ronald","Huaylla","14583062",2002,"Bolivia",'M');
        Persona DatoPersona2= new Persona("Ruben","Chocamani","74352162",2001,"Bolivia",'M');

        System.out.println("Persona 1");

        DatoPersona1.Imprimirdatos();
        System.out.println("-------------------------");
        System.out.println("Persona 2");
        DatoPersona2.Imprimirdatos();


    }
}
