package org.example.clase5SobrecargaMetodos.mundo;

public class BaseDeDatoHija extends BaseDeDatos{


    //cuando estamos en la clase hija hablamos de sobreescritura
    @Override
    public void guardarEnBD(String modelo){
        // funcionalidad nueva
    }

    @Override
    public int suma(int valor1, int valor2){
        // funcionalidad nueva
        return 0;
    }


}
