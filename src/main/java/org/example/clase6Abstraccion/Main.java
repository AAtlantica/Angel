package org.example.clase6Abstraccion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imprimiento sin la interfaz");

        Persona persona = new Persona();
        Bebe bebe = new Bebe();

        persona.correr();
        bebe.correr();

        System.out.println("Imprimiento con la interfaz");

        Humano personaInterfaz = new Persona();
        Humano bebeInterfaz = new Bebe();
        personaInterfaz.correr();
        bebeInterfaz.correr();

        Persona personaBebe = new Persona();
        personaBebe.hablar();
    }
}
