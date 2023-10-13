package Ejercicio2_4;

public class Cuadrado {
    //Atributos
    int lado;
    //Constructores

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    //Metodos o comportamientos
    double calcularArea(){
        return lado*lado;
    }
    double calcularPerimetro(){
        return (4*lado);
    }
}
