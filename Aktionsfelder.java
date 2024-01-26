import java.util.LinkedList;
import java.util.Collections;

public class Aktionsfelder extends Spielfeld {

public Aktionsfelder(int id, String name) {
		super(id, name);	
	}
Aktionsfelder los = new Aktionsfelder( 0, "LOS");
Aktionsfelder gfeld = new Aktionsfelder(2,"Gemeinschaftsfeld");
Aktionsfelder einkommen = new Aktionsfelder(38,"Einkommensteuer");
Aktionsfelder efeld = new Aktionsfelder(7,"Ereignisfeld");
Aktionsfelder gef = new Aktionsfelder(10,"Gefaengnis");
Aktionsfelder gfeld2 = new Aktionsfelder(17,"Gemeinschaftsfeld");
Aktionsfelder Frei = new Aktionsfelder(20,"Frei Parken");
Aktionsfelder efeld2 = new Aktionsfelder(22,"Ereignisfeld");
Aktionsfelder gehe = new Aktionsfelder(30,"Gehen Sie in das Gefaengnis");
Aktionsfelder gfeld3 = new Aktionsfelder(33,"Gemeinschaftsfeld");
Aktionsfelder efeld3 = new Aktionsfelder(36,"Ereignisfeld");
Aktionsfelder zusatz = new Aktionsfelder(38,"Zusatzsteuer");

LinkedList<Aktionsfelder> Aktionsfelder = new LinkedList<>();
    
    //Hinzufuegen der Aktionsfelder 
    {
        Aktionsfelder.add(los);
        Aktionsfelder.add(gfeld);
        Aktionsfelder.add(einkommen);
        Aktionsfelder.add(efeld);
        Aktionsfelder.add(gef);
        Aktionsfelder.add(gfeld2);
        Aktionsfelder.add(Frei);
        Aktionsfelder.add(efeld2);
        Aktionsfelder.add(gehe);
        Aktionsfelder.add(gfeld3);
        Aktionsfelder.add(efeld3);
        Aktionsfelder.add(zusatz);
    }  
//Setter-Methoden

public int setID (int ID) {
    this.ID = ID;
    return ID;
}

public String setName (String Name) {
    this.Name = Name;
    return Name;
}

//Getter-Methoden

public int getID (int ID) {
    return ID;
}

public String getName (String Name) {
    return Name;
}



@Override
public void BahnhofKaufen() {
	// TODO Auto-generated method stub
	
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

//Methoden






}