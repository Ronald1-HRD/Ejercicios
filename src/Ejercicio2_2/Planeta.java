package Ejercicio2_2;

public class Planeta {
    String nombre=null;
    int canidadSatelites=0;
    double masa=0;
    double volumen=0;
    int diametro=0;
    int distanciaSol=0;
    enum TipoPlaneta {GASEOSO,TERRESTRE,ENANO}
    TipoPlaneta tipo;
    boolean Esobservable=false;
    double periodoorvital;
    double periodorotacion;
    // Constructores


    public Planeta(String nombre, int canidadSatelites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipo, boolean esobservable,double periodoorvital,double periodorotacion) {
        this.nombre = nombre;
        this.canidadSatelites = canidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        Esobservable = esobservable;
        this.periodoorvital=periodoorvital;
        this.periodorotacion=periodorotacion;
    }
    //Comportamientos y metodos
    public void Imprimirdatos(){
        System.out.println("Nombre del planeta:"+nombre);
        System.out.println("Cantidad de satelites del planeta:"+canidadSatelites);
        System.out.println("Masa del planeta:"+masa);
        System.out.println("Volumen del planeta:"+volumen);
        System.out.println("Diametro del planeta:"+diametro);
        System.out.println("Distancia al sol del planeta:"+distanciaSol);
        System.out.println("¿Que tipo de planeta es?:"+tipo);
        System.out.println("Es observable el planeta:"+Esobservable);
        System.out.println("El periodo orbital en años  del planeta es:"+periodoorvital);
        System.out.println("El periodo de rotacion en dias del planeta es:"+periodorotacion);
    }
    double calcularDensidad(){
        return  masa/volumen;
    }
    boolean esPlanetaexterior(){
        float limite= (float)(149597870*3.4);
        if (distanciaSol>limite){
            return true;
        }else {
            return false;
        }

    }

}
