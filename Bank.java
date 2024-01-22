package Monopoly2;

import java.util.HashMap;
import java.util.Map;

	public class Bank {
		
		
		private static final int MAXGUTHABEN = 15000000;
		private int guthaben;
		private int hauser;
		private int hotels;
	
		// Konstruktor für die Bank
	    public Bank() {
	        this.guthaben = MAXGUTHABEN; 
	        this.hauser = 32;   
	        this.hotels = 12;  
	    }

	    // Methode zur Ausgabe von Geld entsprechend den Monopoly-Gebühren
	    
		/*public Map<Integer, Integer> getMonopolyMoney() {
	        
			Map<Integer, Integer> money = new HashMap<>();
	        
	        money.put(500, 2); // 2 × 500 Euro
	        money.put(100, 4); // 4 × 100 Euro
	        money.put(50, 1);  // 1 × 50 Euro
	        money.put(20, 1);  // 1 × 20 Euro
	        money.put(10, 2);  // 2 × 10 Euro
	        money.put(5, 1);   // 1 × 5 Euro
	        money.put(1, 5);   // 5 × 1 Euro
	        
	        return money;
	        
	        
	    }*/
		
	    // Methode, um Geld von der Bank zu erhalten
	    public void geldBekommen(int betrag) {
	        if (betrag > 0 && betrag <= guthaben) {
	            guthaben -= betrag;
	            
	        } else {
	            System.out.println("Ungültiger Betrag oder nicht genügend Guthaben in der Bank.");
	        }
	    }
	    
	 // Methode, um Geld an die Bank zurückzugeben
	    public void geldGeben(Spieler spieler, int betrag) {
	        if (betrag > 0) {
	        	
	            guthaben -= betrag;
	            spieler.bekommtGeld(betrag);
	        } else {
	            System.out.println("Ungültiger Betrag.");
	        }
	    }
	 // Methode, um die Anzahl der Häuser zu verringern
	    public void HausMinus(int anzahl) {
	        if (anzahl > 0 && anzahl <= hauser) {
	            hauser -= anzahl;
	        } else {
	            System.out.println("Ungültige Anzahl oder nicht genügend Häuser in der Bank.");
	        }
	    }
	 // Methode, um die Anzahl der Häuser zu erhöhen
	    public void HausPlus(int anzahl) {
	        if (anzahl > 0) {
	            hauser += anzahl;
	        } else {
	            System.out.println("Ungültige Anzahl.");
	        }
	    }
	 // Methode, um die Anzahl der Hotels zu verringern
	    public void HotelMinus(int anzahl) {
	        if (anzahl > 0 && anzahl <= hotels) {
	            hotels -= anzahl;
	        } else {
	            System.out.println("Ungültige Anzahl oder nicht genügend Hotels in der Bank.");
	        }
	    }
	 // Methode, um die Anzahl der Hotels zu erhöhen
	    public void HotelPlus(int anzahl) {
	        if (anzahl > 0) {
	            hotels += anzahl;
	        } else {
	            System.out.println("Ungültige Anzahl.");
	        }
	    }
		
	}

