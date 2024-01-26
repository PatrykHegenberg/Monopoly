import java.util.Collections;
import java.util.LinkedList;

//Klasse Ereigniskarte erstellen und initailisieren der LinkedList "Ereigniskarten"

public class Ereigniskarten implements KarteInterface {
    private LinkedList<String> Ereigniskarten = new LinkedList<String>();

//Hinzufuegen der Ereigniskarten
{
    Ereigniskarten.add("Ruecken Sie vor bis zur Schlossallee.");
    Ereigniskarten.add("Machen Sie einen Ausflug zum Suedbahnhof. Wenn Sie ueber Los kommen, ziehen Sie 200 Euro ein");
    Ereigniskarten.add("Ihr Bausparvertrag wird faellig. Sie erhalten 200 Euro.");
    Ereigniskarten.add("Ruecken Sie vor bis zum Opernplatz. Wenn Sie ueber Los kommen, ziehen Sie 200 Euro ein.");
    Ereigniskarten.add("Ruecken Sie vor bis zum naechsten Versorgungswerk." + 
    "Werfen Sie die Wuerfel und zahlen dem Eigentuemer den zehnfachen Betrag Ihres Wurfergebnisses." + 
    "Wenn das Werk noch niemandem gehoert, koennen Sie es von der Bank kaufen.");
    Ereigniskarten.add("Gehen Sie in das Gefaengnis. Begeben Sie sich direkt dorthin. Gehen Sie nicht ueber Los. Ziehen Sie nicht 200 Euro ein.");
    Ereigniskarten.add("Ruecken Sie vor bis auf Los. (Ziehe 200 Euro ein).");
    Ereigniskarten.add("Die Bank zahlt Ihnen eine Dividende von 50 Euro.");
    Ereigniskarten.add("Sie lassen Ihre Haeuser renovieren. Zahlen Sie: 25 Euro pro Haus, 100 Euro pro Hotel.");
    Ereigniskarten.add("Sie kommen aus dem Gefaengnis frei! Behalten Sie diese Karte, bis Sie sie benoetigen oder verkaufen");
    Ereigniskarten.add("Ruecken Sie vor bis zur Seestrasse. Wenn Sie ueber Los kommen, ziehen Sie 200 Euro ein.");
    Ereigniskarten.add("Sie sind zum Vorstand gewaehlt worden. Zahlen Sie jedem Spieler 50 Euro.");
    Ereigniskarten.add("Gehen Sie 3 Felder zurueck.");
    Ereigniskarten.add("Strafzettel! Zahlen Sie 15 Euro.");
    Ereigniskarten.add("Ruecken Sie vor bis zum naechsten Verkehrsfeld." + 
    "Der Eigentuemer erhaelt das Doppelte der normalen Miete." +
    "Wenn das Verkehrsfeld noch niemandem gehoert, koennen Sie es von der Bank kaufen.");
}

//Methoden

public String obersteKarteZiehen () {
    String obersteKarte = Ereigniskarten.get(0);
    System.out.println("Sie haben folgende Karte gezogen:" + obersteKarte);
    return obersteKarte;
}

public void KartenVerschieben () {
    String obersteKarte = Ereigniskarten.removeFirst();
    Ereigniskarten.addLast (obersteKarte);
}

{
Collections.shuffle (Ereigniskarten);
System.out.println("Der Stapel wurde neu gemischt.");
}
}
