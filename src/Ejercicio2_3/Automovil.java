package Ejercicio2_3;

public class Automovil {
    //Atributos
    String marca;
    int modelo;
    int motor;
    enum tipocom{GASOLINA,BIOETANOL,DIESEL,BIODIESEL,GAS_NATURAL}
    tipocom tipoCombustible;
    enum tipoA{CIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,EJECUTIVO,SUV}
    tipoA tipoAutomovil;
    int numeropuertas;
    int cantidadasientos;
    int velocidadmaxima;
    enum tipocolor{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    tipocolor color;
    int velocidadactual=0;
    boolean esAutomatico;
    int multas;
    int valormulta;

    //Constructor


    public Automovil(String marca, int modelo, int motor, tipocom tipoCombustible, tipoA tipoAutomovil, int numeropuertas, int cantidadasientos, int velocidadmaxima, tipocolor color,boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeropuertas = numeropuertas;
        this.cantidadasientos = cantidadasientos;
        this.velocidadmaxima = velocidadmaxima;
        this.color = color;
        this.esAutomatico=esAutomatico;
        this.multas=0;
        this.valormulta=100;
    }
    // getter and setters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipocom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipocom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeropuertas() {
        return numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        this.numeropuertas = numeropuertas;
    }

    public int getCantidadasientos() {
        return cantidadasientos;
    }

    public void setCantidadasientos(int cantidadasientos) {
        this.cantidadasientos = cantidadasientos;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }

    public tipocolor getColor() {
        return color;
    }

    public void setColor(tipocolor color) {
        this.color = color;
    }

    public int getVelocidadactual() {
        return velocidadactual;
    }

    public void setVelocidadactual(int velocidadactual) {
        this.velocidadactual = velocidadactual;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    //motodos y comportamientos
    public void acelerar(int incrementovelocidad){
        if (velocidadactual+incrementovelocidad<velocidadmaxima){
            velocidadactual=velocidadactual+incrementovelocidad;
        }else{
            System.out.println("No se puede incrementar a una velocidad superior a la maxima del automovil "+valormulta);
            multas++;
            valormulta=50;
        }
    }
    public void desacelerar(int decrementovelocidad){
        if ((velocidadactual-decrementovelocidad)>0){
            velocidadactual=velocidadactual-decrementovelocidad;
        }else {
            System.out.println("No se puede dcrementar a una velocidad negativa");
        }

    }

    public boolean tienemultas() {
        return multas>0;
    }
    public int getValormulta(){
        return multas*valormulta;
    }

    public void frenar() {
        velocidadactual = 0;
    }
    double calculartiempollegada(int distancia){
        return distancia/velocidadactual;
    }
    public void imprimir(){
        System.out.println("Marca del automovil:"+marca);
        System.out.println("Modelo del automovil:"+modelo);
        System.out.println("Motor del automovil:"+motor);
        System.out.println("Tipo de combustible:"+tipoCombustible);
        System.out.println("Tipo de automovil:"+tipoAutomovil);
        System.out.println("Numero de puertas del automivil:"+numeropuertas);
        System.out.println("Cantidasd de asientos del automovil:"+cantidadasientos);
        System.out.println("Velocidad maxima del automovil:"+velocidadmaxima);
        System.out.println("Color del automovil:"+color);


    }

}
