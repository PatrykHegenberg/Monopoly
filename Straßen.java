public class Straßen extends Spielfeld {

//Attribute

public int ID;
public String Name;
public int Kaufpreis;
public int Miete;
public boolean istGekauft;
public boolean möchteKaufen;
public String Besitzer;

//Klasse Ereigniskarte erstellen und initailisieren der LinkedList "Straßen"


private LinkedList<Straßen> Straßen = new LinkedList<String>(ID,Name,Kaufpreis,Miete,Besitzer);

//Hinzufuegen der Ereigniskarten
{
    Straßen.add(2,"Badstraße",1200,10,"");
    Straßen.add(4,"Turmstraße",1200,10,"");
    Straßen.add(7,"Chausseestraße",2000,10,"");
    Straßen.add(9,"Elisenstraße",2000,10,"");
    Straßen.add(10,"Poststraße",2400,10,"");
    Straßen.add(12,"Seestraße",2800,10,"");
    Straßen.add(14,"Hafenstraße",10,"");
    Straßen.add(15,"Neue Straße",10,"");
    Straßen.add(17,"Münchnerstraße",10,"");
    Straßen.add(19,"Wienerstraße",10,"");
    Straßen.add(20,"Berlinerstraße",10,"");
    Straßen.add(22,"Theaterstraße",10,"");
    Straßen.add(24,"Museumstraße",10,"");
    Straßen.add(25,"Opernplatz",10,"");
    Straße.add(27,"Lessingstraße",10,"");
    Straßen.add(28,"Schillerstraße",10,"");
    Straßen.add(30,"Goethestraße",10,"");
    Straßen.add(32,"Rathausplatz",10,"");
    Straßen.add(33,"Hauptstraße",10,"");
    Straßen.add(35,"Bahnhofstraße",10,"");
    Straßen.add(38,"Parkstraße",10,"");
    Straßen.add(40,"Schlossallee",10,"");
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

public boolean setmöchteKaufen (boolean möchteKaufen) {
    this.möchteKaufen = möchteKaufen;
    return möchteKaufen;
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

public int getmöchteKaufen (boolean möchteKaufen) {
    return möchteKaufen;
}

public String getBesitzer (String Besitzer) {
    return Besitzer;
}

//Methoden

public SpielerHinzufügen () {
    System.out.println ("Du befindest Dich auf dem Feld " + ID);
}

public StraßeHinzufügen () {
    if (istGekauft = false){
    System.out.println ("Möchtest du diese Straße kaufen?");
       
        if (möchteKaufen = true) {
        int Kontostand;
        int neuerKontostand = Kontostand - Miete;
        return neuerKontostand;
        }
        else {
        System.out.println ("Du möchtest die Straße nicht kaufen");  
        }
    } else { 
    System.out.println ("Zahle die Miete in Höhe von" + Miete + "an den Besitzer der Straße.");    
    }
}
}
