package Ejercicio2_4;

public class Rombo {
    //Atributos
    double diagonalMenor;
    double diagonalMayor;
    double lado;
    //Constructores

    public Rombo(double diagonalMenor, double diagonalMayor, double lado) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
        this.lado = lado;
    }
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
