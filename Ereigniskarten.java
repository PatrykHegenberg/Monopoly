import java.util.Collections;
import java.util.LinkedList;

//Klasse Ereigniskarte erstellen und initailisieren der LinkedList "Ereigniskarten"

public class EreigniskartenKlasse implements Karten {
    private LinkedList<String> Ereigniskarten = new LinkedList<String>();

//Hinzufuegen der Ereigniskarten
{
    Ereigniskarten.add("Rücken Sie vor bis zur Schlossallee.");
    Ereigniskarten.add("Machen Sie einen Ausflug zum Südbahnhof. Wenn Sie über Los kommen, ziehen Sie 200 Euro ein");
    Ereigniskarten.add("Ihr Bausparvertrag wird fällig. Sie erhalten 200 Euro.");
    Ereigniskarten.add("Rücken Sie vor bis zum Opernplatz. Wenn Sie über Los kommen, ziehen Sie 200 Euro ein.");
    Ereigniskarten.add("Rücken Sie vor bis zum nächsten Versorgungswerk." + 
    "Werfen Sie die Würfel und zahlen dem Eigentümer den zehnfachen Betrag Ihres Wurfergebnisses." + 
    "Wenn das Werk noch niemandem gehört, können Sie es von der Bank kaufen.");
    Ereigniskarten.add("Gehen Sie in das Gefängnis. Begeben Sie sich direkt dorthin. Gehen Sie nicht über Los. Ziehen Sie nicht 200 Euro ein.");
    Ereigniskarten.add("Rücken Sie vor bis auf Los. (Ziehe 200 Euro ein).");
    Ereigniskarten.add("Die Bank zahlt Ihnen eine Dividende von 50 Euro.");
    Ereigniskarten.add("Sie lassen Ihre Häuser renovieren. Zahlen Sie: 25 Euro pro Haus, 100 Euro pro Hotel.");
    Ereigniskarten.add("Sie kommen aus dem Gefängnis frei! Behalten Sie diese Karte, bis Sie sie benötigen oder verkaufen");
    Ereigniskarten.add("Rücken Sie vor bis zur Seestraße. Wenn Sie über Los kommen, ziehen Sie 200 Euro ein.");
    Ereigniskarten.add("Sie sind zum Vorstand gewählt worden. Zahlen Sie jedem Spieler 50 Euro.");
    Ereigniskarten.add("Gehen Sie 3 Felder zurück.");
    Ereigniskarten.add("Strafzettel! Zahlen Sie 15 Euro.");
    Ereigniskarten.add("Rücken Sie vor bis zum nächsten Verkehrsfeld." + 
    "Der Eigentümer erhält das Doppelte der normalen Miete." +
    "Wenn das Verkehrsfeld noch niemandem gehört, können Sie es von der Bank kaufen.");
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
Collections.shuffle (Ereigniskarten);
System.out.println("Der Stapel wurde gemischt:" + Ereigniskarten);
}
}