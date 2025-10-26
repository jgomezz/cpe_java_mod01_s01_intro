package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_03 {

    /**
     *
     * Ejercicio 4: Hallar el area de un circulo , si se conoce el radio
     *
     *     AREA = PI * radio * radio
     *
     * @param args
     */
    public static void main(String[] args) {

        final float PI = 3.1415f;
        int radio = 5 ;
        double area = PI * radio * radio;

        System.out.printf("Area del circulo: %.4f ", area);

    }


}
