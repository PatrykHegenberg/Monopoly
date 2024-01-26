import java.util.Random;

public class ComputerSpieler extends Spieler {

    public String Name;
    public String Farbe;
    public int Geld;
    public int ID;
    public boolean imGefaengnis;


    public ComputerSpieler(String Name,String Farbe,int Startgeld) {
        super();
        this.Name = Name;
        this.Farbe = Farbe;
        this.Geld = Startgeld;
        this.position = 0; // Startposition auf dem Spielfeld
    }
    
    //Setter-Methoden
    
    //Getter-Methoden

    public String getName() {
        return Name;
    }

    public int getGeld() {
        return Geld;
    }

    public int getID() {
        return ID;
    }

    public boolean getimGefaengnis() {
        return imGefaengnis;
    }

    //Methoden 
    
    

    public void bewege(int schritte) {
        // Hier kannst du die Logik für das Bewegen des Spielers implementieren
        position += schritte;
        // Beispiel: Wenn der Spieler über das Spielfeld hinausgeht, von vorne beginnen
        if (ID > MonopolySpielfeld.MAX_POSITION) {
            position = position % MonopolySpielfeld.MAX_POSITION;
            geld += MonopolySpielfeld.PASSIEREN_GO_BONUS;
        }
    }

    public void zahleMiete(int betrag) {
        // Hier kannst du die Logik für das Zahlen von Miete implementieren
        Geld -= betrag;
    }

    public void erhalteGeld(int betrag) {
        // Hier kannst du die Logik für das Erhalten von Geld implementieren
        Geld += betrag;
    }
        public int getRent() {
            int rent;
    
            switch(owner.getNumRailroads()){
                case 1:
                    rent = 25;
                    break;
                case 2:
                    rent = 50;
                    break;
                case 3:
                    rent = 100;
                    break;
                case 4:
                    rent = 200;
                    break;
                default:
                    rent = -1;
                    break;
            }
    
            return rent;
        }

    public void zieheEreigniskarte() {
        // Hier kannst du die Logik für das Ziehen einer Ereigniskarte implementieren
        // Beispiel: Zufälliges Ereignis
        Random random = new Random();
        int zufallsBetrag = random.nextInt(100) + 1;
        if (zufallsBetrag > 50) {
            erhalteGeld(50);
        } else {
            zahleMiete(30);
        }
    }

    // Weitere Methoden können nach Bedarf hinzugefügt werden
}
