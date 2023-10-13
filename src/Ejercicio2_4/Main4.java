package Ejercicio2_4;

public class Main4 {
    public static void main(String[] args) {
        Circulo Figura1=new Circulo(2);
        Rectangulo Figura2=new Rectangulo(1,2);
        Cuadrado Figura3=new Cuadrado(3);
        TrianguloRectangulo Figura4=new TrianguloRectangulo(3,5);
        Rombo Figura5=new Rombo(5,9,2);
        Trapecio Figura6=new Trapecio(8,4,5,7,7);

        System.out.println("Círculo:");
        System.out.println("El Área del circulo es: " +Figura1.calcularArea());
        System.out.println("El Perímetro del circulo es: " + Figura1.calcularPerimetro());
        System.out.println("El Area del recangulo es:"+Figura2.calcularArea());
        System.out.println("El Perimetro del recangulo es:"+Figura2.calcularPerimetro());
        System.out.println("El Area del cuadrado:"+Figura3.calcularArea());
        System.out.println("El Perimetro del cuadrado es:"+Figura3.calcularPerimetro());
        System.out.println("El Area del Triangulo rectangulo es:"+Figura4.calcularArea());
        System.out.println("El Perimetro del Triangulo rectangulo es:"+Figura4.calcularPerímetro());
        Figura4.determinarTipoTriángulo();
        System.out.println("El Area del Rombo es:"+Figura5.calcularArea());
        System.out.println("El Perimetro del Rombo es:"+Figura5.calcularPerimetro());
        System.out.println("El Area del Trapecio es:"+Figura6.calcularArea());
        System.out.println("El Perimetro del Trapecio es:"+Figura6.calcularPerimetro());

    }

}
