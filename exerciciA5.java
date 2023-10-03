/*
5. Escriu un programa que permeta introduir una qualificació (entre zero i deu) i imprimisca el seu equivalent alfabètic, segons la següent taula.
• De 3 -------> M.D.
• Des de 3 i menor que 5 -------> INS.
• Des de 5 i menor que 6 -------> SUF.
• Des de 6 i menor que 7 -------> BÉ.
• Des de 7 i menor que 9 -------> NOT.
• Des de 9 fins a 10 -------> SOB.
 *
 * @author santi
 */
import java.util.Scanner;

public class exerciciA5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        boolean notaEnRang = true;
        while (notaEnRang) {
            System.out.println("Introdueix una nota entre 0 i 10 i la categoritzarem (en cas contrari, el programa es pararà!)");
            double nota = lector.nextDouble();
            notaEnRang = nota >= 0 && nota <= 10 ? true : false;

            //ESTABLIM LES COMPARACIONS
            if (notaEnRang) {
                if (nota < 3)
                    System.out.println("Molt Deficient!");
                else if (nota < 5) 
                    System.out.println("Insuficient!");
                else if (nota < 6)
                    System.out.println("Suficient!");
                else if (nota < 7) 
                    System.out.println("Bé!");      
                else if (nota < 9) 
                    System.out.println("Notable!");
                else // ----> cas en que 9 <= nota <= 10
                    System.out.println("Excel·lent!");
            }
        }
        System.out.println("Fi del programa!");
    }
}
