package org.example.clase2;

public class Main1 {

    public static void main(String[] args) {

        /*-----------------------------------------------------------Operador ternario-----------------------*/

        int valor1 = 23;
        int resultado = 2;

        /*El operador ternario consta de dos parte
        * 1-El signo de interrogación: ?
        * 2-El signo de dos puntos: :
        * Cuando utilizamos este operador debemos tener presente que nos devuelve un resultado por lo tanto ese resultado debemos
        * tomarlo/recibirlo para poder continuar con nuestras operaciones.
        * Se define de la siguiente forma
        * --> condicion ? si condicion es verdadera devolvera el resultado que se encuentra en esta posición : si es falsa la que se encuentre en esta posicion.
        * */
        String mensaje = (valor1 < resultado) ? "Es menor " : "Es mayor";
        System.out.println(mensaje);


        //Arreglos estáticos
        /*
        * Se denominan de esta forma a los arreglos cuyo espacio en memoria se determinan desde el inicio y no pueden ser modificados
        * durante el tiempo de compilación
        * "IMPORTANTE": tanto los arreglos de tipos primitivos como sus wrappers son estáticos.
        * */
        /*----------------------------------------------arreglo estático int[] -------------------------------------------------*/
        int[] primeraForma = new int[3];
        primeraForma[0] = 1;
        primeraForma[1] = 2;
        primeraForma[2] = 3;

        int[] segundaForma = new int[]{1,2,3};

        int[] terceraForma = {1,2,3};

        /*Tanto la segunda o la tercera forma parecen ser dinamicos, pero si, intentasemos agregar un dato mas, por ej:
        * en la posicion 3 de la siguiente forma terceraForma[3] = 4 no daria un error ya que no se pueden modificar los espacios
        * ya reservados.*/

        // Memoria estática
        /*----------------------- arreglo estático char---------------------------------*/

        char[] primeraFormaChar = new char[3];
        primeraFormaChar[0] = 'a';
        primeraFormaChar[1] = 'b';
        primeraFormaChar[2] = 'c';

        System.out.println(primeraFormaChar.length);

        char[] segundaFormaChar =new char[]{'a','b','c'};

        char[] terceraFormaChar = {'a', 'b', 'c','d'};

        Character[] valor10  = new Character[]{'a', 'b'};

        //Ciclos iterativos y formas de recorrer un arreglo estático.

        /* Ciclo For
        * Estructura: for(valorinicial; condición;incremento){ instrucciones }
        * Pasos:
        * 1-inicia el valor
        * 2-verifica la condición: si es verdadera ejecuta la instrucción
        * 3-luego de ejecutar la instrucción incrementa en uno su valor
        * Para que esta estructura pueda funcionar la condición debe ser verdadera si es falsa no ingresara al bucle y si está dentro saldría
        * del mismo.*/
         for(int valorInicialFor = 0; valorInicialFor < primeraFormaChar.length; valorInicialFor++){

            System.out.println(terceraFormaChar[valorInicialFor]);

        }

        /* Ciclo While
         * Estructura: contador; for(condición){ instrucciones; incremento }
         * Pasos:
         * 1-Posee una bandera/contador para saber cuantas veces está iterando
         * 2-verifica la condición valiéndose de la bandera/contador: si es verdadera ejecuta la instrucción
         * 3-luego de ejecutar la instrucción incrementa en uno el valor de la bandera/contador
         * Para que esta estructura pueda funcionar la condición debe ser verdadera si es falsa no ingresara al bucle y si está dentro saldría
         * del mismo.*/
        int valorInicialWhile = 0;

        while(valorInicialWhile < primeraFormaChar.length){

            System.out.println("con while: " + primeraFormaChar[valorInicialWhile]);

            valorInicialWhile++;
        }

        /* Ciclo do-While
         * Estructura: contador; do{ instrucciones; incremento }while(condición)
         * Pasos:
         * 1-Posee una bandera/contador para saber cuantas veces está iterando
         * 2-ingresa por lo menos una vez al bucle
         * 3-verifica la condición valiéndose de la bandera/contador: si es verdadera continúa ejecutando el bucle
         * 3-luego de ejecutar la instrucción incrementa en uno el valor de la bandera/contador
         * Para que esta estructura pueda funcionar la condición debe ser verdadera, si es falsa, luego de haberse ejecutado
         * al menos una vez saldra del bucle.*/

        int valorInicialDoWhile = 0;

        do{
            System.out.println("con do while: " + primeraFormaChar[valorInicialDoWhile]);

            valorInicialDoWhile++;
        }while(valorInicialDoWhile < primeraFormaChar.length);



    }
}
