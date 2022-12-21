package entornos;

public class ProyectoEntornos {

	public static void main(String[] args) {
		
		
		public static void main(String[] args) {
			
			//Numero de ocurrencias
			
			System.out.println("Introduce una frase: ");
			
			String respuesta = sc.nextLine();
			respuesta.toLowerCase();
			
			System.out.print("La letra que quieres buscar:");
			
			String letra = sc.next();
			letra.toLowerCase();
			
			System.out.println("La letra se repite "+ codigo(respuesta, letra) + " veces");
			
			
		}

		public static int codigo (String respuesta, String letra) {
			
			int contador =0;
				
			for (int i = 0; i < respuesta.length(); i++) {
				char caracter = respuesta.charAt(i);
			
				if (letra.equalsIgnoreCase(String.valueOf(caracter))) {
					contador++;
				}
			
			}
			
			return contador;

	}

}
