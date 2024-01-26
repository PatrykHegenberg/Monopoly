import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;


import javax.swing.table.DefaultTableModel;

public class Model {
	
	private LinkedList<Spieler> Rundenablauf = new LinkedList<Spieler>();
	private LinkedList<Strassen> strassenListe = new LinkedList<>(Strassen.Strasse);
	public Bank bank = new Bank();

	public void spielerHinzufuegen(Spieler spieler) {
	        Rundenablauf.add(spieler);
	        bank.setGuthaben(bank.getGuthaben() - 1500);
	   }
	
	public Bank getBank() {
		return bank;
	}

	public LinkedList<Spieler> getRundenablauf() {
	        return Rundenablauf;
	    }
	 
	 int aktuellerSpielerIndex = 0;
	 
	 public Spieler getAktuellerSpieler () {
		 Spieler aktuellerSpieler = Rundenablauf.get(aktuellerSpielerIndex);
		 return aktuellerSpieler;
	 }
	 public int wuerfelnAktuellerSpieler() {
	        if (aktuellerSpielerIndex < Rundenablauf.size()) {
	            Spieler aktuellerSpieler = Rundenablauf.get(aktuellerSpielerIndex);
	            int gesamtwurf = aktuellerSpieler.würfeln();
	            
	            // Optional: Überprüfen, ob der Spieler das Spielfeld einmal durchlaufen hat (zum Beispiel bei Monopoly)
	            
	            
	            // Aktuellen Spielerindex für den nächsten Durchgang erhöhen
	            aktuellerSpielerIndex++;
	            	if (aktuellerSpielerIndex == Rundenablauf.size()) {
	            		aktuellerSpielerIndex = 0;
	            	}
	            
	            return gesamtwurf;
	        } else {
	            System.out.println("Eine Runde durch.");
	            aktuellerSpielerIndex = 0;
	            return aktuellerSpielerIndex; 
	        }
	    }
	   public Strassen getStreetById(int id) {
	        for (int i = 0; i < strassenListe.size(); i++) {
	            Strassen street = strassenListe.get(i);
	            if (street.getID() == id) {
	            	System.out.println(street.getName());
	                return street;
	            }
	        }
	        System.out.println("Straße mit der angegebenen ID nicht gefunden " + id);
	        System.out.println(strassenListe);
	        return null;
	   }
	 
	   public Spieler findSpielerByName(String name) {
		    for (Spieler spieler : Rundenablauf) {
		        if (spieler.getName().equals(name)) {
		            return spieler;
		        }
		    }
		    // Spieler mit dem angegebenen Namen wurde nicht gefunden
		    return null;
		}
	
	 //würfel 
	 //setzen
	 //if position = strasse
	 //if position = Aktionsfeld
	 //end
}
