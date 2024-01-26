import java.util.Random;

public class Würfel {
	int ergebnis;
    int summe;    
    // Methode zum Würfeln eines 6-seitigen Würfels

    public void wuerfeln () {
        Random zufällig = new Random();

        // Die nextInt-Methode gibt einen zufälligen Wert zwischen 0 (inklusive) und 6 (exklusive) zurück,
        // daher wird 1 addiert, um einen Wert zwischen 1 und 6 zu erhalten.

        ergebnis = zufällig.nextInt(6) + 1;
    }

    // Methode zum Würfeln eines 6-seitigen Würfels

    public int getErgebnis () {
    	return ergebnis;
    }
	
}
