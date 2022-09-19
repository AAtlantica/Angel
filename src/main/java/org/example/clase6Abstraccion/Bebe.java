package org.example.clase6Abstraccion;

public class Bebe implements Humano{
    @Override
    public void correr() {
        System.out.println("No puedo correr, puedo gatear");
    }

    @Override
    public void hablar() {
        System.out.println("Nose hablar, puedo llorar");
    }
}
