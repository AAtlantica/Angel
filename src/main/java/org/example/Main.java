package org.example;


import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {

        //--------------------------------Tipos de datos Primitivos-------------------------------------------------------

        //tipo de dato     nombre de la variable     operador de asignación   valor del dato
            byte                valor_byte                  =                       3;          // -128 hasta 127
            short               valor_short                 =                       3;          // -32768 hasta 32767
            int                 valor_int                   =                       3;          // -2147483648 a 2747483647
            long                valor_long                  =                       3;          // -9223372036854775808 a 9223372036854775807
            float               valor_float                 =                       3.0f;       // ± 3.4x10-38 a ± 3.4x1038
            double              valor_double                =                       3.0;        //± 1.8x10-308 a ± 1.8x10308
            char                valor_char                  =                       'x';        //\u0000 a \uFFFF
            boolean             verdaderOfalso              =                       false;      // true - false
            //void;

        //-------------------------------------Desbordamiento en Java----------------------------------------------------
            byte valor = 127;
            valor++;
            System.out.println(valor);

        //-------------------------------------------Wrapper----------------------------------------------
            Byte valorByte = 3;
            Short valorShort = 3;
            Integer valorInteger = 3;
            Long valorLong = 4L;
            Float valorFloat = 3.0F; // <-- se debe indicar con la f o F al final para que jvm sepa que es un float
            Double valorDouble = 3.4;
            Character valorCharacter = 'd'; //<-- un dato de tipo char se declara entre comillas simples'';
            Boolean valorBooleano = false; //Boolean.FALSE;
        //-----------------------------------------Operaciones---------------------------------------------
            Integer valorInteger1 = 6;
            Integer valorInteger2 = 10;

        //Compara dos valores
        //1-Si los valore son iguales: 0
        //2-Si el primer valor es menor: -1
        //3-Si el primer valor es mayor: 1
        System.out.println(compare(valorInteger1, valorInteger2));
        //Compara los valores de dos objetos cumple las misma condiciones que el anterior
        System.out.println(valorInteger1.compareTo(valorInteger2));

        //Compara los valores de dos objetos y devuelve un valore booleano
        //1-True: si son iguales
        //2-False: si son diferentes
        System.out.println(valorInteger1.equals(valorInteger2));

        //Compara dos valores enteros e indica el valor de cual es el mayor
        System.out.println(max(valorInteger1, valorInteger2));

        //Suma dos valores del tipo int
        System.out.println(sum(valorInteger1, valorInteger2));

        //----------------------------------------inmutabilidad----------------------------------------------
        /*Un String es un tipo de dato inmutable, esto indica que si deseamos cambiar el valor de nombre
        lo que realmente ocurre es que se crea una nueva instancia del tipo String y se asigna un nuevo espacio
        en otra parte de la memoria, dejando de apuntar al primer valor asignado, al quedar libre el primer valor el
        garbage collector de java limpia esa secciones de la memoria eliminando el valor libre.
         */
        String nombre = "hola"; //primer valor asignado

        System.out.println(nombre.hashCode());//imprimimos el hashcode

        nombre = nombre + "Angel";//agregamos un valor al primer valor

        System.out.println(nombre.hashCode());//verificamos el cambio de hashCode, para este momento el garbage collector, elimino el primer valor


        /*Los Wrapper son tipos de datos inmutables*/
        Integer numero = new Integer(3);
        System.out.println(numero.hashCode());

        numero = 6;
        System.out.println(numero.hashCode());

        //--------------------------------------------Constantes en Java ----------------------------------------------
        /*En java para indicar que un tipo de dato es una constante se utiliza la palabra reservada
        *               "final"
        * esto quiere decir que este dato no puede cambiar durante el tiempo de compilación
        * */
        final String saludo = "hola Angel como estas";



    }


}