package Practica2_7;

public class Main7 {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula("Thor","Kenneth Branagh", Pelicula.genero.ACCION,120,2005,6.5);
        Pelicula peli2 = new Pelicula("Venom","Andy Serkis", Pelicula.genero.ACCION,130,2015,8.0);
        peli1.Imprimir();
        peli2.Imprimir();
        System.out.println("La pelicula "+peli1.nombre+" es epica: "+peli1.EsEPico());
        System.out.println("La pelicula "+peli2.nombre+" es epica: "+peli2.EsEPico());
        System.out.println("La película "+ peli1.getNombre() + " y la película "+ peli2.getNombre() + " son similares: " +peli1.Similar(peli2));
        System.out.println("");
        peli1.imprimirCartel(peli1);
        peli2.imprimirCartel(peli2);
    }
}


