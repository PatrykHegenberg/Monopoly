//Klasse "Werke" erstellen
import java.util.LinkedList;
import java.util.Collections;

public class Werke extends Spielfeld {
	//Attribute
	public int Kaufpreis;
    public int Miete;
    public boolean istGekauft;
    public String Besitzer;
	
	public Werke (int ID, String Name, int preis, int Miete, boolean gekauft, String Besitz) {
		super(ID, Name);
		this.Kaufpreis = preis;
		this.Miete = Miete;
		this.istGekauft = gekauft;
		this.Besitzer = Besitz;	
	}
	
    //Hinzufuegen der Werke
    Werke eWerk = new Werke(12 ,"Elektrizitaetswerk" ,150 ,25 ,false ,"Bank");
    Werke wWerk = new Werke(28 ,"Wasserwerk" ,150 ,25 ,false ,"Bank");
    
    private LinkedList<Werke> Werk = new LinkedList<>();
    {
    Werk.add (eWerk);
    Werk.add(wWerk);
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
public void WerkKaufen () {
    if (istGekauft = false){
    System.out.println ("Moechtest du dieses Werk kaufen?");
        boolean moechteKaufen;
        if (moechteKaufen = true) {
        int Kontostand = 0;
        int neuerKontostand = Kontostand - Miete;
        }
        else {
        System.out.println ("Du moechtest das Werk nicht kaufen.");  
        }
    } else { 
    System.out.println ("Zahle die Miete in Hoehe von " + Miete + " an den Besitzer des Werks.");    
    }
}

@Override
public void BahnhofKaufen() {
	// TODO Auto-generated method stub
	
}

@Override
public int getID() {
	return ID;
	// TODO Auto-generated method stub
	
}

}
