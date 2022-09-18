package org.example.clase3Encapsulamiento;

public class Main3 {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Angel",
                "Verdes",
                1.80,
                78);

        System.out.println(persona1.hashCode());

        String nombre= "label";
        System.out.println(nombre.hashCode());
        nombre = nombre + "hola";
        System.out.println(nombre.hashCode());

        persona1.hablar();
        persona1.correr();
        persona1.comer();

        System.out.println();
        persona1.setNombre("Lucas");
        System.out.println(persona1.hashCode());



        persona1.hablar();
    }
}
