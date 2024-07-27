package Test1;

public class Ejemplo3_If_Anidado {

	public static void main(String[] args) {
		int temperatura = 18;
		if (temperatura > 15) {
			if (temperatura > 25) {
				System.out.println("Ir a la Playa!");
			} else {
				System.out.println("A la Montaña!");
			}
		} else {
			System.out.println("A descanzar zzz...");
		}
	}

}
