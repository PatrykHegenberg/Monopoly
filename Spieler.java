
import java.awt.Color;
import java.util.Random;

public class Spieler {
    
	private String name;
    private Color farbe;
    private int geld;
    private int position;
    private boolean imGefaengnis;
    private int gesamtWurf;

    public Spieler(String name, Color farbe) {
        this.name = name;
        this.farbe = farbe;
        this.geld = 1500; // Startkapital in Monopoly
        this.position = 0; // Spieler beginnt auf dem Los-Feld
        this.imGefaengnis = false; // Spieler startet nicht im Gefängnis
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
    	position += this.gesamtWurf;
    	
    	final int MAX_POSITION = 39;
    	if (position >= MAX_POSITION) {
           position -= MAX_POSITION;
           System.out.println(name + " ist einmal um das Spielfeld gegangen!");
        }
    	System.out.println(name + " auf dem Position: " + this.getPosition());

    }

    // Methoden für Aktionen des Spielers

    public void würfeln() {
        // Würfeln mit zwei Würfeln (1 bis 6)
    	
    	Würfel würfel = new Würfel();
    	

    	würfel.wuerfeln1();
    	würfel.wuerfeln2();
        int gesamtwurf = würfel.getSumme();

        System.out.println(name + " würfelt eine " + würfel.getErgebnis1() + " und eine " + würfel.getErgebnis2() + " (Gesamtwurf: " + gesamtwurf + ")");
        
        this.gesamtWurf = würfel.getSumme();
 

      
		// Optional: Überprüfen, ob der Spieler das Spielfeld einmal durchlaufen hat (zum Beispiel bei Monopoly)
      
    }
    
   

        // Hier kannst du die Logik für das Bewegen des Spielers basierend auf dem Wurf implementieren.
        // Zum Beispiel die Position aktualisieren oder spezifische Regeln des Spiels anwenden.
        // Du kannst die Logik entsprechend deinen Spielanforderungen anpassen.
   

    public void straßenKaufen(String straße) {
        int kaufpreis = 200; // Beispielkaufpreis für eine Straße
        if (geld >= kaufpreis) {
            geld -= kaufpreis;
            System.out.println(name + " hat die Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um die Straße zu kaufen.");
        }
    }

    public void hausKaufen(String straße) {
        int hauspreis = 100; // Beispielkaufpreis für ein Haus
        if (geld >= hauspreis) {
            geld -= hauspreis;
            System.out.println(name + " hat ein Haus auf der Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um ein Haus zu kaufen.");
        }
    }

    public void hotelKaufen(String straße) {
        int hotelpreis = 500; // Beispielkaufpreis für ein Hotel
        if (geld >= hotelpreis) {
            geld -= hotelpreis;
            System.out.println(name + " hat ein Hotel auf der Straße " + straße + " gekauft.");
        } else {
            System.out.println(name + " hat nicht genug Geld, um ein Hotel zu kaufen.");
        }
    }

    public void mieteZahlen(int betrag) {
        geld -= betrag;
        System.out.println(name + " zahlt Miete in Höhe von " + betrag + " Euro.");
    }

    public void kartenZiehen() {
        // Hier könntest du die Logik für das Ziehen einer Spielkarte implementieren
        System.out.println(name + " zieht eine Spielkarte.");
    }

    public void doAct(String aktion) {
        // Hier könntest du weitere Aktionen implementieren, die der Spieler ausführen kann
        System.out.println(name + " führt die Aktion aus: " + aktion);
    }

    @Override
    public String toString() {
        return "Spieler " + name + " - Farbe: " + farbe + ", Geld: " + geld + ", Position: " + position + ", Im Gefängnis: " + imGefaengnis;
    }
}

