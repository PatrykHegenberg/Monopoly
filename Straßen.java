//Klasse "Strasse" erstellen

public class Strassen extends Spielfeld {

//Attribute

public int ID;
public String Name;
public int Kaufpreis;
public int Miete;
public boolean istGekauft;
public String Besitzer;

//Initailisieren der LinkedList "Strassen"


private LinkedList<Strassen> Strassen = new LinkedList<String>(ID,Name,Kaufpreis,Miete,istGekauft,Besitzer);

//Hinzufuegen der Strassen
{
    Strassen.add(2,"Badstrasse",1200,2,istGekauft,Besitzer);
    Strassen.add(4,"Turmstrasse",1200,4,istGekauft,Besitzer);
    Strassen.add(7,"Chausseestrasse",2000,6,istGekauft,Besitzer);
    Strassen.add(9,"Elisenstrasse",2000,6,istGekauft,Besitzer);
    Strassen.add(10,"Poststrasse",2400,8,istGekauft,Besitzer);
    Strassen.add(12,"Seestrasse",2800,10,istGekauft,Besitzer);
    Strassen.add(14,"Hafenstrasse",10,istGekauft,Besitzer);
    Strassen.add(15,"Neue Strasse",10,istGekauft,Besitzer);
    Strassen.add(17,"Muenchnerstrasse",14,istGekauft,Besitzer);
    Strassen.add(19,"Wienerstrasse",14,istGekauft,Besitzer);
    Strassen.add(20,"Berlinerstrasse",16,istGekauft,Besitzer);
    Strassen.add(22,"Theaterstrasse",18,istGekauft,Besitzer);
    Strassen.add(24,"Museumstrasse",18,istGekauft,Besitzer);
    Strassen.add(25,"Opernplatz",20,istGekauft,Besitzer);
    Strasse.add(27,"Lessingstrasse",22,istGekauft,Besitzer);
    Strassen.add(28,"Schillerstrasse",22,istGekauft,Besitzer);
    Strassen.add(30,"Goethestrasse",24,istGekauft,Besitzer);
    Strassen.add(32,"Rathausplatz",26,istGekauft,Besitzer);
    Strassen.add(33,"Hauptstrasse",26,istGekauft,Besitzer);
    Strassen.add(35,"Bahnhofstrasse",28,istGekauft,Besitzer);
    Strassen.add(38,"Parkstrasse",35,istGekauft,Besitzer);
    Strassen.add(40,"Schlossallee",50,istGekauft,Besitzer);
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

public StrasseKaufen () {
    if (istGekauft = false){
    System.out.println ("Moechtest du diese Strasse kaufen?");
        boolean moechteKaufen;
        if (moechteKaufen = true) {
        int Kontostand;
        int neuerKontostand = Kontostand - Miete;
        return neuerKontostand;
        }
        else {
        System.out.println ("Du moechtest die Strasse nicht kaufen.");  
        }
    } else { 
    System.out.println ("Zahle die Miete in Hoehe von " + Miete + " an den Besitzer der Strasse.");    
    }
}
}
