package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_10_switch {

    /**
     *
     *  Se define una variable para el dia de semana
     *  Si se ingresa 1 , se debe mostrar "Lunes"
     *  Si se ingresa 2 , se debe mostrar "Martes"
     *  Si se ingresa otro n-umero, se debe mostrar "Dia no registrado"
     * @param args
     */
    public static void main(String[] args) {

        int diaSemana = 6; // 1 - 7 , 8 es absurdo

        switch(diaSemana){
            case 1 : System.out.println("Lunes"); break;
            case 2 : System.out.println("Martes"); break;
            case 3 :
            case 4 :
            case 5, 6, 7: System.out.println("Dia no registrado"); break;
            default: System.out.println("Dia de semana no soportado");
        }


    }

}
