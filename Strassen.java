//Klasse "Strasse" erstellen
import java.util.LinkedList;
import java.util.Collections;

public class Strassen extends Spielfeld {

//Attribute

public int Kaufpreis;
public int Miete;
public boolean istGekauft;
public String Besitzer;

//Initailisieren der LinkedList "Strassen"

public Strassen (int ID, String Name, int preis, int Miete, boolean gekauft, String Besitz) {
	super(ID, Name);
	this.Kaufpreis = preis;
	this.Miete = Miete;
	this.istGekauft = gekauft;
	this.Besitzer = Besitz;	
}

public static LinkedList<Strassen> Strasse = new LinkedList<>();

//Hinzufuegen der Strassen
	static {
	Strasse.add(new Strassen(1 ,"Badstrasse" ,60 ,2 ,false ,"Bank"));
	Strasse.add(new Strassen(3,"Turmstrasse",60,4 ,false ,"Bank"));
	Strasse.add(new Strassen(6,"Chausseestrasse",100,6 ,false ,"Bank"));
	Strasse.add(new Strassen(8,"Elisenstrasse",100,6 ,false ,"Bank"));
	Strasse.add(new Strassen(9,"Poststrasse",120,8 ,false ,"Bank"));
	Strasse.add(new Strassen(11,"Seestrasse",140,10 ,false ,"Bank"));
	Strasse.add(new Strassen(13,"Hafenstrasse", 140,10 ,false ,"Bank"));
	Strasse.add(new Strassen(14,"Neue Strasse", 160, 10 ,false ,"Bank"));
	Strasse.add(new Strassen(16,"Muenchnerstrasse", 180,14 ,false ,"Bank"));
	Strasse.add(new Strassen(18,"Wienerstrasse", 180, 14 ,false ,"Bank"));
	Strasse.add(new Strassen(19,"Berlinerstrasse",200, 16 ,false ,"Bank"));
	Strasse.add(new Strassen(21,"Theaterstrasse", 220, 18 ,false ,"Bank"));
    Strasse.add(new Strassen(23,"Museumstrasse", 220, 18,false ,"Bank"));
    Strasse.add(new Strassen(24,"Opernplatz", 240, 20 ,false ,"Bank"));
    Strasse.add(new Strassen(26,"Lessingstrasse", 260, 22 ,false ,"Bank"));
    Strasse.add(new Strassen(27,"Schillerstrasse", 260, 22,false ,"Bank"));
    Strasse.add(new Strassen(29,"Goethestrasse", 280, 24, false ,"Bank"));
    Strasse.add(new Strassen(31,"Rathausplatz", 300, 26, false ,"Bank"));
    Strasse.add(new Strassen(32,"Hauptstrasse", 300, 26, false ,"Bank"));
    Strasse.add(new Strassen(34,"Bahnhofstrasse", 320, 28, false ,"Bank"));
    Strasse.add(new Strassen(37,"Parkstrasse", 350, 35, false ,"Bank"));
    Strasse.add(new Strassen(39,"Schlossallee", 400, 50, false ,"Bank"));
}



public Strassen getStrassen(int i) {
    return Strasse.get(i);
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


public int getID () {
    return ID;
}

public String getName () {
    return Name;
}

public int getKaufpreis () {
    return Kaufpreis;
}

public int getMiete () {
    return Miete;
}

public boolean getistGekauft () {
    return istGekauft;
}


public String getBesitzer () {
    return Besitzer;
}

//Methoden



@Override
public void BahnhofKaufen() {
	// TODO Auto-generated method stub
	
}

@Override
public void WerkKaufen() {
	// TODO Auto-generated method stub
	
}

}
