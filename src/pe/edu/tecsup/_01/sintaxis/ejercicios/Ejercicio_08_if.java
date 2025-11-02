package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_08_if {

    /**
     *
     *  Se define una variable para el dia de semana
     *  Si se ingresa 1 , se debe mostrar "Lunes"
     *  Si se ingresa 2 , se debe mostrar "Martes"
     *  Si se ingresa otro n-umero, se debe mostrar "Dia no registrado"
     * @param args
     */
    public static void main(String[] args) {
        final int DIA = 2;

        if (DIA == 1) {
            System.out.println("Lunes");
        } else {
            if (DIA == 2) {
                System.out.println("Martes");
            } else {
                System.out.println("No registrado");
            }
        }

        int diaSemana = 2;

        if(diaSemana == 1) {
            System.out.println("Lunes");
        } else if (diaSemana == 2) {
            System.out.println("Martes");
        } else {
            System.out.println("No registrado");

        }



    }

}
