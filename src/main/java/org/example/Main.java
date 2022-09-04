package org.example;


import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {

        //tipo de dato     nombre de la variable     operador de asignación   valor del dato
             byte             by                        =                         3;          // -128 hasta 127
             short           shor                       =                         3;          // -32768 hasta 32767
             int                in                      =                           3;        // -2147483648 a 2747483647
            long                lon                     =                           3;        // -9223372036854775808 a 9223372036854775807
            float           floa                        =                           3.0f;      // ± 3.4x10-38 a ± 3.4x1038
            double          doub                        =                           3.0;        //± 1.8x10-308 a ± 1.8x10308
            char            cha                         =                           'x';        //\u0000 a \uFFFF
            boolean         verdaderOfalso              =                       false;           // true - false
            //void;

        byte valor = 127;
        valor++;
        valor++;
        //System.out.println(valor);

        //Wrapper
        Byte bty = 3;
        Short sh = 3;
        Integer integ = 3;
        Long longi = 4L;
        Float floati = 3.0F;
        Double doubles = 3.4;
        Character character = 'd';
        Boolean booleano = false; //Boolean.FALSE;

        Integer valorInteger1 = 6;
        Integer valorInteger2 = 10;

        //System.out.println(compare(valorInteger1, valorInteger2));
        //System.out.println(valorInteger1.compareTo(valorInteger2));
        //System.out.println(valorInteger1.equals(valorInteger2));
        //System.out.println(max(valorInteger1, valorInteger2));
        //System.out.println(sum(valorInteger1, valorInteger2));
        //compare(valor1, valor2)
        //1-Si los valore son iguales : 0
        //2-Si el primer valor es menor: -1
        //3-Si el primer valor es mayor: 1

        String nombre = "hola";

        System.out.println(nombre.hashCode());

        nombre = nombre + "Angel";
        System.out.println(nombre.hashCode());

        Integer numero = new Integer(3);
        System.out.println(numero.hashCode());

        numero = 6;
        System.out.println(numero.hashCode());

        final String saludo = "hola Angel como estas";



    }


}