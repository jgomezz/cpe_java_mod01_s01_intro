package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_07 {

    public static void main(String[] args) {

        String nombre = "Jaime";

        {
            String apellido = "Gomez";
            System.out.printf("%s %s \n", nombre, apellido);
        }

        String apellido = "Garcia";
        System.out.printf("%s %s", nombre, apellido);

    }

}
