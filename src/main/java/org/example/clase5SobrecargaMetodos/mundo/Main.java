package org.example.clase5SobrecargaMetodos.mundo;

public class Main {

    public static void main(String[] args) {
        BaseDeDatos baseDeDatos =
                new BaseDeDatos("MySQL", "12345");

        BaseDeDatos baseDeDatosMongoDB =
                new BaseDeDatos("MongDB");

        BaseDeDatos baseDeDatosMariaDB =
                new BaseDeDatos("MariaDB");

        BaseDeDatos baseDeDato =
                new BaseDeDatos("MySQL", 12345);

        BaseDeDatos baseDeDatosVacia = new BaseDeDatos();

        baseDeDato.guardarEnBD();
        baseDeDatosMongoDB.guardarEnBD("MySql", "12345");
        baseDeDatosMongoDB.guardarEnBD("MySql", 12345);
        baseDeDatosMariaDB.guardarEnBD("MongoDB");
        baseDeDato.guardarEnBD("MariaDB");

        baseDeDatosVacia.guardarEnBD();



    }
}
