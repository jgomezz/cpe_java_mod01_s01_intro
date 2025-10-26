package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_05 {

    /**
     *
     * Ejercicio 5: Dado un numero, X = 21 , Realizar las siguiente operaciones con operadores unitarios
     *
     *     - Incrementar en 10 el número
     *     - Obtener el resto de dividir el numero entre 7
     *     - Decrementar en 4 al resultado anterior
     *     - Dividir entre 3 al resultado anterior
     *     - Imprimir el resultado anterior con 2 decimales
     *
     * @param args
     */
    public static void main(String[] args) {

        double x = 21;

        x+=10;

        x = x % 7;

        x-=4;

        double dividir = x/3;

        System.out.println(x);
        System.out.println(dividir);


    }


}
