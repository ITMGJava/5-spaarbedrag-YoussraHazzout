import java.util.Scanner;

public class SpaarRente {
    public static void main(String[] args) {
        /* Schrijf een programma dat een spaarbedrag vraagt en vervolgens de groei van dat bedrag per jaar met een rente
        Voer een bedrag in en beteken rente na 10 jaar.
         */

        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Voer een start bedrag in om de rente per jaar te berekenen");
        int startBedrag = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Met een rente van 5,5% per jaar is het bedrag:");
            var spaarRente = (double)(startBedrag*i*5.5)/100+startBedrag;
            System.out.println("Jaar " + i + ":" + spaarRente);
        }
        //var spaarRente= (startbedrag/100)*105,5; Afgerond op 2 decimalen.
        // var spaarRente= startbedrag*1.055

    }
        }

