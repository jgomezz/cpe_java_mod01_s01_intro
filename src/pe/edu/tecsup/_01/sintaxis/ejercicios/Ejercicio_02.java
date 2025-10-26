package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_02 {

    /**
     *
     * **Ejercicio 3:** Crea un programa que demuestre la pérdida de precisión al convertir de double a int.
     *
     * @param args
     */
    public static void main(String[] args) {

        double precio = 15.49;

        int precioInt = (int) precio;

        System.out.println(precio);
        System.out.println(precioInt);

    }


}
