package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_11_while {

    /**
     *
     *  Imprimir los número enteros entre 20 y 40
     *  inclusive el 20 y el 40
     *
     *  CASO 1 :
     *   Si hubiese un numero primo, el número no se imprime
     *   23,29,31,37
     *
     *
     *  CASO 2 :
     *   Si hubiese un numero primo, la impresión se detiene
     *   23,29,31,37
     *
     *  NOTA : Para salir de un bucle se usa la sentencia break;     *
     * @param args
     */
    public static void main(String[] args) {

        int numero = 20; // empezamos justo después de 20

        while (numero <= 40) { // hasta justo antes de 40
            System.out.println(numero);
            numero++; // aumentar en 1
        }
    }

}
