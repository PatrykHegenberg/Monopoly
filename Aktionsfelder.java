public class Aktionsfelder extends Spielfeld {

//Attribute

public int ID;
public String Name;

private LinkedList<Aktionsfelder> Aktionsfelder = new LinkedList<String>(ID,Name);
    
    //Hinzufuegen der Aktionsfelder 
    {
        Aktionsfelder.add(0,"LOS");
        Aktionsfelder.add(2,"Gemeinschaftsfeld");
        Aktionsfelder.add(10,"Gefaengnis");
        Aktionsfelder.add(17,"Gemeinschaftsfeld");
        Aktionsfelder.add(20,"Frei Parken");
        Aktionsfelder.add(22,"Ereignisfeld");
        Aktionsfelder.add(30,"Gehen Sie in das Gefaengnis");
        Aktionsfelder.add(33,"Gemeinschaftsfeld");
        Aktionsfelder.add(35,"Ereignisfeld");
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

//Methoden






}