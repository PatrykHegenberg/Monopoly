abstract class Spielfeld {

//Attribute

public int ID;
public String Name;

public Spielfeld (int id, String name) {
	this.ID = id;
	this.Name = name;
}
//Methoden
public abstract int getID();

public abstract void BahnhofKaufen();

public abstract void WerkKaufen();

}