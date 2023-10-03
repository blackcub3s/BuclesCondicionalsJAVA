/*
3. Mostrar els imparells d'1 a 99 indicant al final quants són. Repetir per als parells i per als múltiples de cinc.
 */

/**
 *
 * @author santi
 */
public class ExerciciB3 {

	public static void main(String[] args) {

		int n = 99;

		int contadorImparells = 0;
		for (int i = 1; i <= n; ++i) {
			if (i % 2 != 0) {
				System.out.print(" " + i);
				contadorImparells += 1;
			}
		}
		System.out.println("\n S'han imprès " + contadorImparells + " nombres imparells\n");

		int contadorParells = 0;
		for (int i = 1; i < n; ++i) {
			if (i % 2 == 0) {
				System.out.print(" " + i);
				contadorParells += 1;
			}
		}
		System.out.println("\n S'han imprès " + contadorParells + " nombres parells\n");

		int contadorMultCinc = 0;
		int i = 5;
		while (i < n) {
			System.out.print(" " + i);
			contadorMultCinc += 1;
			i = i + 5;
		}
		System.out.println("\n S'han imprès " + contadorMultCinc + " múltiples de cinc\n");
	}
}
