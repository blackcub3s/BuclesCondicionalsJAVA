/*
10. Escriu un programa que permeta determinar si utilitzar els números aleatoris 
de la classe Math són apropiats. Per a això el programa ha de simular que es llança 
una moneda un nombre elevat de vegades, per exemple, 1.000.000. A continuació ha 
d'imprimir per pantalla el percentatge de cares i el percentatge de creus que 
han eixit.
 */
//@author santi
public class ExerciciB10 {

	public static void main(String[] args) {
		int nreTirades = 1000000;
		double nAleatori;

		int sumatoriCares = 0;
		int sumatoriCreus = 0;
		for (int i = 0; i < nreTirades; ++i) {
			nAleatori = Math.random();
			if (nAleatori < 0.5)
				sumatoriCares += 1; 
			else if (nAleatori > 0.5)
				sumatoriCreus += 1;
			
			//NO INCLOEM UN ELSE PERQUÈ EL 0.5 exacte, de retornar-se com a valor aleatori, 
			//hauria de ser comptabilitzat com si fos un canto i la moneda no hagués caigut ni cara ni creu.
		}

		double percentatgeCares = (double) 100 * sumatoriCares / (sumatoriCares + sumatoriCreus);
		double percentatgeCreus = (double) 100 * sumatoriCreus / (sumatoriCares + sumatoriCreus);

		System.out.println("Total Cares: " + sumatoriCares + "(" + percentatgeCares + " %)");
		System.out.println("Total Creus: " + sumatoriCreus + "(" + percentatgeCreus + " %)");
		System.out.println("\nTotalCantos: " + (nreTirades - (sumatoriCares + sumatoriCreus)));

	}
}
