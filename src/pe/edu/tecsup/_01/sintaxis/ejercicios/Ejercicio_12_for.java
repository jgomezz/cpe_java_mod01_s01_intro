package pe.edu.tecsup._01.sintaxis.ejercicios;

public class Ejercicio_12_for {

    /**
     *
     *  Imprimir los número enteros entre 20 y 40
     *  inclusive el 20 y el 40
     *
     *  No se imprime los numero multiplos de 4
     *
     * @param args
     */
    public static void main(String[] args) {

        // ( INICIALIZACION, EXP. BOOLEANA, SENTENCIA)
        for (int nro = 20 ;  nro <= 40 ; nro ++ ) {
            if (nro % 4 != 0) {
                System.out.println(nro);
            }
        }
    }
}
