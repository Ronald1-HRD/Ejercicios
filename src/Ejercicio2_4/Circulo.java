package Ejercicio2_4;

public class Circulo {
    //Atributos
    int radio;
    //Constructores


    public Circulo(int radio) {
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
