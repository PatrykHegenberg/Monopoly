import java.util.Random;

public class Wuerfel {
        
    // Methode zum Würfeln eines 6-seitigen Würfels

    public static int wuerfeln1 () {
        Random zufällig1 = new Random();

        // Die nextInt-Methode gibt einen zufälligen Wert zwischen 0 (inklusive) und 6 (exklusive) zurück,
        // daher wird 1 addiert, um einen Wert zwischen 1 und 6 zu erhalten.

        int wurf1 = zufällig1.nextInt(6) + 1;
        return wurf1;
    }

    // Methode zum Würfeln eines 6-seitigen Würfels

    public static int wuerfeln2 () {
        Random zufällig2 = new Random();

        // Die nextInt-Methode gibt einen zufälligen Wert zwischen 0 (inklusive) und 6 (exklusive) zurück,
        // daher wird 1 addiert, um einen Wert zwischen 1 und 6 zu erhalten.

        int wurf2 = zufällig2.nextInt(6) + 1;
        return wurf2;
    }
    // Addieren der Würfe und Ausgabe
    
    public static int WürfeAddieren (int wurf1, int wurf2){
    int summe = wurf1 + wurf2;
    return summe;
    System.out.println("Du hast eine " + summe + " gewürfelt!" + "Gehe " + summe + "Schritte nach vorne");

    }
}
