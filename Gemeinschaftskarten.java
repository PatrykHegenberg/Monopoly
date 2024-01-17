import java.util.Collections;
import java.util.LinkedList;

//Klasse Ereigniskarte erstellen und initailisieren der LinkedList "Gemeinschaftskarten"

public class GemeinschaftskartenKlasse implements Karten {
    private LinkedList<String> Gemeinschaftskarten = new LinkedList<String>();

//Hinzufuegen der Gemeinschaftskarten
{
    Gemeinschaftskarten.add("Sie kommen aus dem Gefängnis frei! Behalten Sie diese Karte, bis Sie sie benötigen oder verkaufen.");
    Gemeinschaftskarten.add("Schulgeld. Zahlen Sie 50 Euro");
    Gemeinschaftskarten.add("Urlaubsgeld! Sie erhalten 100 Euro.");
    Gemeinschaftskarten.add("Ihre Lebensversicherung wird fällig. Sie erhalten 100 Euro.");
    Gemeinschaftskarten.add("Arzt-Kosten. Zahlen Sie 50 Euro.");
    Gemeinschaftskarten.add("Einkommenssteuerrückerstattung. Sie erhalten 20 Euro");
    Gemeinschaftskarten.add("Krankenhausgebühren. Zahlen Sie 100 Euro.");
    Gemeinschaftskarten.add("Gehen Sie in das Gefängnis. Begeben Sie sich direkt dorthin. Gehen Sie nicht über Los. Ziehen Sie nicht 200 Euro ein.");
    Gemeinschaftskarten.add("Sie erhalten auf Vorzugs-Aktien 7% Dividende: 25 Euro.");
    Gemeinschaftskarten.add("Sie haben Geburtstag. Jeder Spieler schenkt Ihnen 10 Euro.");
    Gemeinschaftskarten.add("Sie erben 100 Euro.");
    Gemeinschaftskarten.add("Aus Lagerverkäufen erhalten Sie 50 Euro.");
    Gemeinschaftskarten.add("Zweiter Preis im Schönheitswettbewerb. Sie erhalten 10 Euro.");
    Gemeinschaftskarten.add("Sie werden zu Straßenausbesserungsarbeiten herangezogen. Zahlen Sie 40 Euro je Haus und 115 Euro je Hotel an die Bank.");
    Gemeinschaftskarten.add("Rücken Sie vor bis auf Los. (Ziehe 200 Euro ein).");
    Gemeinschaftskarten.add("Bank-Irrtum zu Ihren Gunsten. Ziehen Sie 200 Euro ein");
}

//Methoden

public string obersteKarteZiehen () {
    string obersteKarteZiehen = Ereigniskarten.get(0);

    System.out.println("Sie haben folgende Karte gezogen:" + obersteKarteZiehen);
}

public void KartenVerschieben () {
    string obersteKarte = Ereigniskarten.removeFirst(0);
    Ereigniskarten.addLast (obersteKarte);
}
{
    Collections.shuffle (Gemeinschaftskarten);
    System.out.println("Der Stapel wurde gemischt:" + Gemeinschaftskarten);
    }
}