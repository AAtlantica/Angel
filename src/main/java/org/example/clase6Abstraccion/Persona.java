package org.example.clase6Abstraccion;

public class Persona implements Humano {
    @Override
    public void correr() {
        System.out.println("Puedo correr");
    }

    @Override
    public void hablar() {
        System.out.println("Puedo hablar");
    }
}
