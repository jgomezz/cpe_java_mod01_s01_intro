package pe.edu.tecsup._01.sintaxis;

/**
 *  Conversiones de tipo (casting)
 */
public class E_Conversion {

    /**
     *
     *
     *
     * @param args
     */
	public static void main(String[] args) {
		
//		byte vaso = 10;   // 1 byte
//
//		long balde = vaso; // 4 byte
//
//		System.out.println(balde);


		long balde = 20000;
		
		byte vaso = (byte)balde;	// verificar primero con un if
		
		System.out.println(vaso);

	}
	
}
