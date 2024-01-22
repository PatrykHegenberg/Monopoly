import java.util.Random;

public class Würfel {
	int ergebnis1;
	int ergebnis2;
    int summe;    
    // Methode zum Würfeln eines 6-seitigen Würfels

    public void wuerfeln1 () {
        Random zufällig1 = new Random();

        // Die nextInt-Methode gibt einen zufälligen Wert zwischen 0 (inklusive) und 6 (exklusive) zurück,
        // daher wird 1 addiert, um einen Wert zwischen 1 und 6 zu erhalten.

        ergebnis1 = zufällig1.nextInt(6) + 1;
    }

    // Methode zum Würfeln eines 6-seitigen Würfels

    public void wuerfeln2 () {
        Random zufällig2 = new Random();

        // Die nextInt-Methode gibt einen zufälligen Wert zwischen 0 (inklusive) und 6 (exklusive) zurück,
        // daher wird 1 addiert, um einen Wert zwischen 1 und 6 zu erhalten.

        ergebnis2 = zufällig2.nextInt(6) + 1;
    }
    // Addieren der Würfe und Ausgabe
    
    public int getSumme(){
    summe = ergebnis1 + ergebnis2;
    return summe;
    }
    
    public int getErgebnis1 () {
    	return ergebnis1;
    }
    
    public int getErgebnis2 () {
    	return ergebnis2;
    }

	
}
