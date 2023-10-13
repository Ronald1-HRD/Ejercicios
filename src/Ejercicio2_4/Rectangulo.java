package Ejercicio2_4;

public class Rectangulo {
    //Atributos
    int base;
    int altura;
    //Constructores

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularAltura(){
        return base*altura;
    }
    double calcularArea() {
        return base * altura;
    }
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}
