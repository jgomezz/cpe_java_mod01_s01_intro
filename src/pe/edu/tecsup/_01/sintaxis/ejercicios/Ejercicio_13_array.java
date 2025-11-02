package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_13_array {

    /**
     *  Calcular el promedio de nota de cada curso
     *
     * @param args
     */
    public static void main(String[] args) {

        //            index      0        1        2           3        4        5        6
        String diasSemana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

/*
        System.out.println("Dia 1: " + diasSemana[0]);

        System.out.println("Dia 7: " + diasSemana[6]);

        diasSemana[0] = "Monday";
        System.out.println("Dia 1: " + diasSemana[0]);
*/

        //diasSemana[7] = "Holliday";

        for (int index = 0; index < diasSemana.length; index++) {
            System.out.println("Dia " + (index + 1) + ": " + diasSemana[index]);
        }

        for(String dia : diasSemana) {
            System.out.println("Dia: " + dia);
        }

        int  notasCursos[][] = {
                {14, 17, 18, 16},     // 4 notas del 1er curso
                {10, 19, 12, 15},     // 4 notas del 2do curso
                {20, 15, 13, 14},     // 4 notas del 3er curso
                {11, 13,  9, 20}      // 4 notas del 4to curso
        };

        // Recorrido por filas
        for(int i=0; i<notasCursos.length; i++) {

            //System.out.println(notasCursos[i][0]);
            System.out.println("Notas del curso " + (i+1) + ": ");
            // Recorrido por columnas
            for(int j=0; j<notasCursos[i].length; j++) {
                System.out.print(notasCursos[i][j] + " ");
            }
            System.out.println();

        }


    }
}
