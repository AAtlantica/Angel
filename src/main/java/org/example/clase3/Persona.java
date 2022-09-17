package org.example.clase3;



public class Persona {

    // Atributos
    private String nombre;
    private String colorDeOjos;
    private double estatura;
    private double peso;

    //Constructor: este le da el nacimiento a la persona;
    public Persona(String nombreAngel,String colorDeOjosDeAngel,
                   double estaturaDeAngel, double pesoDeAngel){
        this.nombre = nombreAngel;
        this.colorDeOjos = colorDeOjosDeAngel;
        this.estatura = estaturaDeAngel;
        this.peso = pesoDeAngel;
    }


    // Comportamientos
    public void hablar(){
        System.out.println("Hola, mi nombre es: " + nombre);
        System.out.println("Mi color de ojos es: " + colorDeOjos);
        System.out.println("Mi estatura es: " + estatura);
        System.out.println("Mi peso es: " + peso);
    }

    public void correr(){
        System.out.println("Estoy corriendo");
    }

    public void comer(){

        System.out.println("Estoy comiendo y mi peso es: " + peso);
    }

    //Setters y Getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public double getEstatura(){
        return this.estatura;
    }

}
