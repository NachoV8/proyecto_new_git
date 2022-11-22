package principal;

public class Prueba {
	public static void main(String[] args) {
		System.out.println("Hola, soy Nacho ");
		
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Argumento " + i + " : " + args[i]);
			}
		} else {
			System.out.println("No hay argumentos");
		}
		
		
		System.out.println(" Fin");
	}
}
