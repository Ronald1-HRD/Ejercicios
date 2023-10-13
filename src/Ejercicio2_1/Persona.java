package Ejercicio2_1;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private String numeroCI;
    private int añoNacimiento;
    private String PaisNacimiento;
    private char sexo;


    //Constructores

    public Persona(String nombre, String apellido, String numeroCI, int añoNacimiento, String paisNacimiento,char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCI = numeroCI;
        this.añoNacimiento = añoNacimiento;
        this.PaisNacimiento= paisNacimiento;
        this.sexo= sexo;
    }
    //Metodos y comportamientos
    public void Imprimirdatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido:" +apellido);
        System.out.println("Numero de documento de identidad:"+numeroCI);
        System.out.println("Año de nacimento:"+añoNacimiento);
        System.out.println("Pais de nacimiento:"+PaisNacimiento);
        System.out.println("Sexo: "+sexo);
    }
}
