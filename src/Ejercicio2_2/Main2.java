package Ejercicio2_2;

public class Main2 {
    public static void main(String[] args) {
        Planeta DatoPlaneta1= new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000, Planeta.TipoPlaneta.TERRESTRE, true,1,0.997);
        System.out.println("Planeta 1");
        DatoPlaneta1.Imprimirdatos();
        System.out.println("Densidad del Planeta:"+DatoPlaneta1.calcularDensidad());
        System.out.println("Es planeta exterior:"+DatoPlaneta1.esPlanetaexterior());
        System.out.println("-----------------------------------");
        Planeta Datoplaneta2=new Planeta("Jupiter",1,1.899E27,1.4313E15,139820,750000000, Planeta.TipoPlaneta.GASEOSO,true,11.862,0.410);
        System.out.println("Planeta 2");
        Datoplaneta2.Imprimirdatos();
        System.out.println("Densidad del planeta:"+Datoplaneta2.calcularDensidad());
        System.out.println("Es planeta exterior:"+Datoplaneta2.esPlanetaexterior());



    }
}
