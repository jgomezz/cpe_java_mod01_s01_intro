package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_06 {

    /**
     *
     * Ejercicio 6: Crear un lógica booleana
     *
     *     - Evaluar que una persona sea mayor edad en Perú
     *     - Tiene documento de identidad
     *     - Esta caminando por la calle tarde
     *
     * @param args
     */
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneDNI = true;
        boolean esDeNoche = true;


        boolean esMayorEdad = edad >= 18;


        boolean puedeSerIntervenido = esMayorEdad && tieneDNI && esDeNoche;

    }


}
