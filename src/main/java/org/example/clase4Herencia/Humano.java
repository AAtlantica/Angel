package org.example.clase4Herencia;

public class Humano {

    //Atributos
    private String adn;
    private String cabello;

    //Constructor
    public Humano(String adn, String cabello){
        this.adn = adn;
        this.cabello = cabello;
    }

    //Comportamiento
    public void pensar(){
        System.out.println("Estoy estudiando y cantando");
    }

    public void sentir(){
        System.out.println("Siento que soy fachero");
    }

    //Setters  y Getters
    public void setAdn(String adn){
        this.adn = adn;
    }

    public String getAdn(){
        return this.adn;
    }

    public void setCabello(String cabello){
        this.cabello = cabello;
    }

    public String getCabello(){
        return this.cabello;
    }

}
