package org.example.clase5SobrecargaMetodos.mundo;

//palabra reservada final en la clase.. indica que no se puede extender
public class BaseDeDatos {

    // palabra reservada final en atributo lo vuelve una constante
    private final String modelo1 = "MySQL";

    private String modelo;
    private String serie;

    private int codigo;


    //Sobrecarga de constructores
    public BaseDeDatos(){}
    public BaseDeDatos(String modelo, String serie){
        this.modelo = modelo;
        this.serie = serie;
    }

    public BaseDeDatos(String modelo, int codigo){
        this.modelo = modelo;
        this.codigo = codigo;
    }

    public BaseDeDatos(String modelo){
        this.modelo = modelo;
    }

    //Sobrecarga de Metodos

    //palabra reservada final en el metodo o funcion--indica que no se puede sobreescribir.
    public final void guardarEnBD(){
        System.out.println("Estoy guardando en la base de datos");
    }

    public void guardarEnBD(String modelo){
        System.out.println("Estoy guardando en la base de datos: " + modelo);
    }

    public void guardarEnBD(String modelo, String serie){
        System.out.println("Estoy guardando en la base de datos: " + modelo + " serie: " + serie);
    }

    public void guardarEnBD(String modelo, int serie){
        System.out.println("Estoy guardando en la base de datos: " + modelo + " codigo: " + serie);
    }

    //Sobrecarga de funciones

    public final int suma(){
        return 1+2;
    }

    public int suma(int valor1, int valor2){
        return valor1 + valor2;
    }
}
