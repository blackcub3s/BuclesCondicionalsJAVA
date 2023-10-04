/*
12.Escriu un programa que permeta determinar la probabilitat amb què apareix cadascun dels valors en llançar un dau.
Per a això es llançarà el dau 1.000.000 de vegades i es visualitzarà quantes vegades a aparegut cada número i el 
percentatge que representa respecte al total.
 */
//@author santi
public class ExerciciB12 {

	public static void main(String[] args) {
		int nreTirades = 1000000;
		double nAleatori;

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int totalTirades;
		
		for (int i = 0; i < nreTirades; ++i) {
			nAleatori = Math.random();
			
			if (nAleatori <= 1.0/6)
				sum1 += 1; 
			else if (nAleatori <= 2.0/6)
				sum2 += 1;
			else if (nAleatori <= 3.0/6)
				sum3 += 1;
			else if (nAleatori <= 4.0/6)
				sum4 += 1;
			else if (nAleatori <= 5.0/6)
				sum5 += 1;
			else  // és el cas en que --> 5/6 < nAleatori <= 1
				sum6 += 1;
		}
		totalTirades = sum1 + sum2 + sum3 + sum4 + sum5 + sum6;
		
		double percentatgeCara1 = (double) 100*sum1/totalTirades;
		double percentatgeCara2 = (double) 100*sum2/totalTirades;	
		double percentatgeCara3 = (double) 100*sum3/totalTirades;
		double percentatgeCara4 = (double) 100*sum4/totalTirades;
		double percentatgeCara5 = (double) 100*sum5/totalTirades;
		double percentatgeCara6 = (double) 100*sum6/totalTirades;
		
		
		System.out.println("Total de valors 1: " + sum1 + "(" + percentatgeCara1 + " %)");
		System.out.println("Total de valors 2: " + sum2 + "(" + percentatgeCara2 + " %)");
		System.out.println("Total de valors 3: " + sum3 + "(" + percentatgeCara3 + " %)");	
		System.out.println("Total de valors 4: " + sum4 + "(" + percentatgeCara4 + " %)");
		System.out.println("Total de valors 5: " + sum5 + "(" + percentatgeCara5 + " %)");		
		System.out.println("Total de valors 6: " + sum6 + "(" + percentatgeCara6 + " %)");		
		
		System.out.println("_____________________________________\nTOTAL TIRADES:     "+totalTirades);
		
	
	}
}
