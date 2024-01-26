//Klasse "Bahnhoefe" erstellen
import java.util.LinkedList;
public class Bahnhoefe extends Spielfeld {

    //Attribute
	public int Kaufpreis;
    public int Miete;
    public boolean istGekauft;
    public String Besitzer;
    
    public Bahnhoefe (int ID, String Name, int preis, int Miete, boolean gekauft, String Besitz) {
    	super(ID, Name);
    	this.Kaufpreis = preis;
    	this.Miete = Miete;
    	this.istGekauft = gekauft;
    	this.Besitzer = Besitz;	
    }
    
    //Initailisieren der LinkedList "Bahnhoefe"

    Bahnhoefe Suedbahnhof = new Bahnhoefe(5,"Suedbahnhof",200,25,false ,"Bank");
    Bahnhoefe Westbahnhof = new Bahnhoefe(15,"Westbahnhof",200,25,false ,"Bank");
    Bahnhoefe Nordbahnhof = new Bahnhoefe(25,"Nordbahnhof",200,25,false ,"Bank");
    Bahnhoefe Hauptbahnhof = new Bahnhoefe(35,"Hauptbahnhof",200,6,false ,"Bank")
    		;
    private LinkedList<Bahnhoefe> Bahnhof = new LinkedList<>();
    
   
    //Hinzufuegen der Bahnhoefe
    {
        Bahnhof.add(Suedbahnhof);
        Bahnhof.add(Westbahnhof);
        Bahnhof.add(Nordbahnhof);
        Bahnhof.add(Hauptbahnhof);
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
    
    public boolean getistGekauft (boolean istGekauft) {
        return istGekauft;
    }
    
    
    public String getBesitzer (String Besitzer) {
        return Besitzer;
    }
    
   //Methoden


@Override
public void BahnhofKaufen () {
    if (istGekauft = false){
    System.out.println ("Moechtest du diesen Bahnhof kaufen?");
        boolean moechteKaufen;
        if (moechteKaufen = true) {
        int Kontostand = 0;
        int neuerKontostand = Kontostand - Miete;
        }
        else {
        System.out.println ("Du moechtest die Bahnhof nicht kaufen.");  
        }
    } else { 
    System.out.println ("Zahle die Miete in Hoehe von " + Miete + " an den Besitzer des Bahnhofs.");    
    }
}

@Override
public void WerkKaufen() {
	// TODO Auto-generated method stub
	
}

@Override
public int getID() {
	return ID;
	// TODO Auto-generated method stub
	
}
}
