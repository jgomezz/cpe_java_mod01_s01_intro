package pe.edu.tecsup._01.sintaxis;

public class J_Switch {

	public static void main(String[] args) {

		int dia = 4;

//		if(dia == 1) {
//			System.out.println("es Lunes");
//		}else if(dia == 2) {
//			System.out.println("es Martes");
//		}else if(dia == 3) {
//			System.out.println("es Miercoles");
//		}else if(dia == 4) {
//			System.out.println("es Jueves");
//		}

		
		
		
		dia = 1;
		
		switch (dia) {
            case 1:
            case 3:
            case 5:
                System.out.println("Estoy estudiando");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Estoy trabajando");
                break;
            default:
                System.out.println("es Domingo");
                break;
		}
		
		/*
		String msg = "hi";
		
		switch (msg) {
		case "hola":
			System.out.println("Es castellano");
			break;
		case "hi":
		case "hello":
			System.out.println("Es ingles");
			break;
		default:
			break;
		}
		*/


        /*
        int diaSemana = 1; // 1 - 7 , 8 es absurdo
        String resultado = " SIN INFO";
        switch(diaSemana){
            case 1 : {
                System.out.println("Lunes");
                resultado = "Lunes";
                break;
            }
            case 2 : System.out.println("Martes"); break;
            case 3 :
            case 4 :
            case 5, 6, 7: System.out.println("Dia no registrado"); break;
            default: System.out.println("Dia de semana no soportado");
        }
        System.out.println(resultado);
        */

        int diaSemana = 15; // 1 - 7 , 8 es absurdo

        String resultado = switch (diaSemana) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3,4,5,6,7 -> "Dia no registrado";
            default -> "Dia de semana no soportado";
        };

    }

}
