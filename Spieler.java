
import java.awt.Color;
import java.util.Random;

public class Spieler {

    private String name;
    private Color farbe;
    private int geld;
    public int position;
    private boolean imGefaengnis;
    private int gesamtwurf;

    public Spieler() {
        this.name = "Spieler";
        this.farbe = zufaelligeFarbe();
        this.setGeld(1500);
        this.position = 0; // Spieler beginnt auf dem Los-Feld
        this.imGefaengnis = false; // Spieler startet nicht im Gefängnis
    }

    public Spieler(String name) {
        this.name = name;
        this.farbe = zufaelligeFarbe();
        this.setGeld(1500);
        this.position = 0; // Spieler beginnt auf dem Los-Feld
        this.imGefaengnis = false; // Spieler startet nicht im Gefängnis
    }

    // Methode zur Generierung einer zufälligen Farbe

    private Color zufaelligeFarbe() {
        Random rand = new Random();
        // Nimm einen zufälligen RGB-Wert
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        // Erzeuge die Farbe
        return new Color(r, g, b);
    }

    // Setter_Methoden

    public void setName(String name) {
        this.name = name;
    }

    public void setGeld(int geld) {
        this.geld = geld;
    }

    // Getter-Methoden

    public String getName() {
        return name;
    }

    public Color getFarbe() {
        return farbe;
    }

    public int getGeld() {
        return geld;
    }

    public int getPosition() {
        return position;
    }

    public boolean isImGefaengnis() {
        return imGefaengnis;
    }

    public void setPosition() {
        position += this.gesamtwurf;

        final int MAX_POSITION = 39;
        if (position >= MAX_POSITION) {
            position -= MAX_POSITION;
            System.out.println(name + " ist einmal um das Spielfeld gegangen!");
        }
        System.out.println(name + " auf dem Position: " + this.getPosition());

    }

    // Methoden für Aktionen des Spielers

    public int würfeln() {
        // Würfeln mit zwei Würfeln (1 bis 6)

        Würfel würfel1 = new Würfel();
        Würfel würfel2 = new Würfel();

        würfel1.wuerfeln();
        würfel2.wuerfeln();
        int gesamtwurf = würfel1.getErgebnis() + würfel2.getErgebnis();

        System.out.println(name + " würfelt eine " + würfel1.getErgebnis() + " und eine " + würfel2.getErgebnis()
                + " (Gesamtwurf: " + gesamtwurf + ")");

        this.gesamtwurf = gesamtwurf;
        return gesamtwurf;

        // Optional: Überprüfen, ob der Spieler das Spielfeld einmal durchlaufen hat
        // (zum Beispiel bei Monopoly)

    }

    // Hier kannst du die Logik für das Bewegen des Spielers basierend auf dem Wurf
    // implementieren.
    // Zum Beispiel die Position aktualisieren oder spezifische Regeln des Spiels
    // anwenden.
    // Du kannst die Logik entsprechend deinen Spielanforderungen anpassen.

    public void straßenKaufen(String straße) {
        int kaufpreis = 200; // Beispielkaufpreis für eine Straße
        if (getGeld() >= kaufpreis) {
            setGeld(getGeld() - kaufpreis);
            System.out.println(name + " hat die Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um die Straße zu kaufen.");
        }
    }

    public void hausKaufen(String straße) {
        int hauspreis = 100; // Beispielkaufpreis für ein Haus
        if (getGeld() >= hauspreis) {
            setGeld(getGeld() - hauspreis);
            System.out.println(name + " hat ein Haus auf der Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um ein Haus zu kaufen.");
        }
    }

    public void hotelKaufen(String straße) {
        int hotelpreis = 500; // Beispielkaufpreis für ein Hotel
        if (getGeld() >= hotelpreis) {
            setGeld(getGeld() - hotelpreis);
            System.out.println(name + " hat ein Hotel auf der Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um ein Hotel zu kaufen.");
        }
    }

    public void mieteZahlen(int betrag, Spieler Empfänger) {
        setGeld(getGeld() - betrag);
        Empfänger.setGeld(Empfänger.getGeld() + betrag);
        System.out.println(name + " zahlt Miete in Höhe von " + betrag + " Euro.");
    }

    public void kartenZiehen() {
        // Hier könntest du die Logik für das Ziehen einer Spielkarte implementieren
        System.out.println(name + " zieht eine Spielkarte.");
    }

    public void doAct(String aktion) {
        // Hier könntest du weitere Aktionen implementieren, die der Spieler ausführen
        // kann
        System.out.println(name + " führt die Aktion aus: " + aktion);
    }

    @Override
    public String toString() {
        return "Spieler " + name + " - Farbe: " + farbe + ", Geld: " + getGeld() + ", Position: " + position
                + ", Im Gefängnis: " + imGefaengnis;
    }

    public void bekommtGeld(int betrag) {
        setGeld(getGeld() + betrag);

    }

}
