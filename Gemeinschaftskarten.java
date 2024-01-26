import java.util.Collections;
import java.util.LinkedList;

//Klasse Ereigniskarte erstellen und initailisieren der LinkedList "Gemeinschaftskarten"

public class Gemeinschaftskarten implements KarteInterface {
    private LinkedList<String> Gemeinschaftskarten = new LinkedList<String>();

//Hinzufuegen der Gemeinschaftskarten
{
    Gemeinschaftskarten.add("Sie kommen aus dem Gefaengnis frei! Behalten Sie diese Karte, bis Sie sie benoetigen oder verkaufen.");
    Gemeinschaftskarten.add("Schulgeld. Zahlen Sie 50 Euro");
    Gemeinschaftskarten.add("Urlaubsgeld! Sie erhalten 100 Euro.");
    Gemeinschaftskarten.add("Ihre Lebensversicherung wird faellig. Sie erhalten 100 Euro.");
    Gemeinschaftskarten.add("Arzt-Kosten. Zahlen Sie 50 Euro.");
    Gemeinschaftskarten.add("Einkommenssteuerrueckerstattung. Sie erhalten 20 Euro");
    Gemeinschaftskarten.add("Krankenhausgebuehren. Zahlen Sie 100 Euro.");
    Gemeinschaftskarten.add("Gehen Sie in das Gefaengnis. Begeben Sie sich direkt dorthin. Gehen Sie nicht ueber Los. Ziehen Sie nicht 200 Euro ein.");
    Gemeinschaftskarten.add("Sie erhalten auf Vorzugs-Aktien 7% Dividende: 25 Euro.");
    Gemeinschaftskarten.add("Sie haben Geburtstag. Jeder Spieler schenkt Ihnen 10 Euro.");
    Gemeinschaftskarten.add("Sie erben 100 Euro.");
    Gemeinschaftskarten.add("Aus Lagerverkaeufen erhalten Sie 50 Euro.");
    Gemeinschaftskarten.add("Zweiter Preis im Schoenheitswettbewerb. Sie erhalten 10 Euro.");
    Gemeinschaftskarten.add("Sie werden zu Strassenausbesserungsarbeiten herangezogen. Zahlen Sie 40 Euro je Haus und 115 Euro je Hotel an die Bank.");
    Gemeinschaftskarten.add("Ruecken Sie vor bis auf Los. (Ziehe 200 Euro ein).");
    Gemeinschaftskarten.add("Bank-Irrtum zu Ihren Gunsten. Ziehen Sie 200 Euro ein");
}

//Methoden

public String obersteKarteZiehen () {
    String obersteKarte = Gemeinschaftskarten.get(0);
    return obersteKarte;
    System.out.println("Sie haben folgende Karte gezogen:" + obersteKarte);
}

public void KartenVerschieben () {
    String obersteKarte = Gemeinschaftskarten.removeFirst();
    Gemeinschaftskarten.addLast (obersteKarte);
}
{
Collections.shuffle (Gemeinschaftskarten);
System.out.println("Der Stapel wurde neu gemischt.");
}
}
