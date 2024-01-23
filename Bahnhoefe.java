//Klasse "Bahnhoefe" erstellen

public class Bahnhoefe extends Spielfeld {

    //Attribute
    
    public int ID;
    public String Name;
    public int Kaufpreis;
    public int Miete;
    public boolean istGekauft;
    public String Besitzer;
    
    //Initailisieren der LinkedList "Bahnhoefe"
    
    
    private LinkedList<Bahnhoefe> Bahnhoefe = new LinkedList<String>(ID,Name,Kaufpreis,Miete,istGekauft,Besitzer);
    
    //Hinzufuegen der Bahnhoefe
    {
        Bahnhoefe.add(6,"Suedbahnhof",4000,25,istGekauft,Besitzer);
        Bahnhoefe.add(16,"Westbahnhof",4000,25,istGekauft,Besitzer);
        Bahnhoefe.add(26,"Nordbahnhof",4000,25,istGekauft,Besitzer);
        Bahnhoefe.add(36,"Hauptbahnhof",4000,6,istGekauft,Besitzer);
    }  
    
    // Setter-Methoden
    
    public int setID (int ID) {
        this.ID = ID;
        return ID;
    }
    
    public String setName (String Name) {
        this.Name = Name;
        return Name;
    }
    
    public int setKaufpreis (int Kaufpreis) {
        this.Kaufpreis = Kaufpreis;
        return Kaufpreis;
    }
    
    public int setMiete (int Miete) {
        this.Miete = Miete;
        return Miete;
    }
    
    public boolean setistGekauft (boolean istGekauft) {
        this.istGekauft = istGekauft;
        return istGekauft;
    }
    
    
    public String setBesitzer (String Besitzer) {
        this.Besitzer = Besitzer;
        return Besitzer;
    }
    
    // Getter-Methoden
    
    public int getID (int ID) {
        return ID;
    }
    
    public String getName (String Name) {
        return Name;
    }
    
    public int getKaufpreis (int Kaufpreis) {
        return Kaufpreis;
    }
    
    public int getMiete (int Miete) {
        return Miete;
    }
    
    public int getistGekauft (boolean istGekauft) {
        return istGekauft;
    }
    
    
    public String getBesitzer (String Besitzer) {
        return Besitzer;
    }
    
   //Methoden

public SpielerHinzufuegen () {
    System.out.println ("Du befindest Dich auf dem Feld: " + ID);
}

public BahnhofKaufen () {
    if (istGekauft = false){
    System.out.println ("Moechtest du diesen Bahnhof kaufen?");
        boolean moechteKaufen;
        if (moechteKaufen = true) {
        int Kontostand;
        int neuerKontostand = Kontostand - Miete;
        return neuerKontostand;
        }
        else {
        System.out.println ("Du moechtest die Bahnhof nicht kaufen.");  
        }
    } else { 
    System.out.println ("Zahle die Miete in Hoehe von " + Miete + " an den Besitzer des Bahnhofs.");    
    }
}
}
