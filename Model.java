import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Model {

	private LinkedList<Spieler> Rundenablauf = new LinkedList<Spieler>();
	private LinkedList<Strassen> strassenListe = Strassen.Strasse;
	public Bank bank = new Bank();
	private int aktuellerSpielerIndex = 0;
	private int aktuellerWurf = 0;

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

	public LinkedList<Strassen> getStrassen() {
		return strassenListe;
	}

	public Spieler getAktuellerSpieler(boolean kaufen) {
		Spieler aktuellerSpieler = Rundenablauf.get(aktuellerWurf % Rundenablauf.size());
		if (kaufen) {
				aktuellerSpieler = Rundenablauf.get((aktuellerWurf -1 ) % Rundenablauf.size());
		} else {
			aktuellerSpieler = Rundenablauf.get(aktuellerWurf % Rundenablauf.size());
		}
		return aktuellerSpieler;
	}

	public int wuerfelnAktuellerSpieler() {
		if (aktuellerSpielerIndex < Rundenablauf.size()) {
			Spieler aktuellerSpieler = Rundenablauf.get(aktuellerSpielerIndex);
			int gesamtwurf = aktuellerSpieler.würfeln();

			// Optional: Überprüfen, ob der Spieler das Spielfeld einmal durchlaufen hat
			// (zum Beispiel bei Monopoly)

			// Aktuellen Spielerindex für den nächsten Durchgang erhöhen
			aktuellerSpielerIndex++;
			if (aktuellerSpielerIndex == Rundenablauf.size()) {
				aktuellerSpielerIndex = 0;
			}

			this.aktuellerWurf++;
			return gesamtwurf;
		} else {
			System.out.println("Eine Runde durch.");
			aktuellerSpielerIndex = 0;
			return aktuellerSpielerIndex;
		}
	}

	public Strassen getStreetById(int id) {
			System.out.println("Runde get Street: " + aktuellerWurf);
		for (Strassen street : strassenListe) {
			if (street.getID() == id) {
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

	// würfel
	// setzen
	// if position = strasse
	// if position = Aktionsfeld
	// end
}
