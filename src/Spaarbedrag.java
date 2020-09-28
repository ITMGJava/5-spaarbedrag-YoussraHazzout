import java.util.Scanner;

public class Spaarbedrag {
    public void main(String[] args){
        /* Schrijf een programma dat een spaarbedrag vraagt en vervolgens de groei van dat bedrag per jaar met een rente
        Voer een bedrag in en beteken rente na 10 jaar.
         */
        new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("Voer een bedrag in om de rente per jaar te berekenen");
        int startBedrag= s.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println("Jaar "+i+ ":" );
            var spaarRente = (double) (startBedrag/100)*100.5;
            System.out.println("Jaar "+i+ ":" + spaarRente);
        }
System.out.println("Met een rente van 5,5% per jaar is het bedrag na 10 jaar");
        //var spaarRente= (startbedrag/100)*105,5; Afgerond op 2 decimalen.


    }
}
