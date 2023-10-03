/*
9. Escriu un programa que sol·licite a l'usuari un nombre enter positiu. El programa ha de presentar en pantalla la descomposició en factors primers d'aquest número.
Per exemple, si el número és 36 ha d'escriure 36=2 *2 * 3 * 3.

@author santi
 */
import java.util.Scanner;

public class ExerciciB9 {

	//PRECONDICIÓ: i>2 i n>2, ambdós enters
	//POSTCONDICIÓ: Divisors primers del valor n impresos per ordre en la mateixa línia, separats per asteriscs.
	public void descomposaEnDivisorsPrimers(int i, int n) {
		boolean primerFactorImpres = true;
		while (i <= n) {
			if (n % i == 0) {
				if (primerFactorImpres) { //aquest if per evitar un asterisc a l'esquerra del primer factor descomposat imprès.
					System.out.print("" + i);
					primerFactorImpres = !primerFactorImpres;
				} else {
					System.out.print("*" + i);
				}
				n = n / i; //actualitzo el nombre a descomposar, que l'hem de dividir pel divisor i actualitzar-lo (es la columna esquerra d'una descomposició factorial, per entendre'ns)
			} else {
				i = i + 1; //nomes incremento l'index del divisor (i) si he provat un divisor que no funcionava per a n (dividend). És la columna dreta d'una descomposició factorial
			}
		}
	}

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		//cal instanciar la classe per poder cridar al mètode trobaDivisorsPrimers
		ExerciciB9 Ex = new ExerciciB9();

		//farem servir una variable on guardarem el divisor primer més petit que podriem trobar (i = 2), excloent l'1.
		while (true) {
			System.out.println("\nIntrodueix un valor enter positiu:");
			int n = lector.nextInt();

			System.out.print("n = ");

			int i = 2;//comencem pel primer divisor primer possible, el 2
			Ex.descomposaEnDivisorsPrimers(i, n); //passem dos paràmetres: l'estat inicial de la variable del divisor (i) i l'estat inicial de la variable del dividend (n).
		}

	}

}
