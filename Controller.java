import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class Controller implements ActionListener {
	public View myView;
	public Model myModel;
    
	public void setMyView(View myView) {
		this.myView = myView;
	}

	public void setMyModel(Model myModel) {
		this.myModel = myModel;
	}
	
	
	public void buttonGedrueckt() {
		String spielerName = myView.getSpielerName();
		Spieler hilfe = new Spieler(spielerName);
	    myModel.spielerHinzufuegen(hilfe);
	    System.out.print(myModel.getRundenablauf());
	    myView.setColor(hilfe.getFarbe());
	    myView.repaint();
	}
	
	public void würfelGeworfen() { 
		Spieler Hilfe = myModel.getAktuellerSpieler();
		int wurfergebnis= myModel.wuerfelnAktuellerSpieler();
		Hilfe.setPosition();
		int id = Hilfe.getPosition();
		myView.setWurf(wurfergebnis);
		myView.setPosition(id);
		myView.repaint();
		if (id == 1 || id == 3 || id == 6 || id == 8 || id == 9 || id == 11 || id == 13 || id == 14 || id == 16 || id == 18 || id == 19 || id == 21 || id == 23 || id == 24 || id == 26 || id == 27 || id == 29 || id == 31 || id == 32 || id == 34) {
			Strassen gewählteStrasse = myModel.getStreetById(id);
			System.out.println(gewählteStrasse);
	        if (gewählteStrasse != null && ("Bank".equals(gewählteStrasse.getBesitzer()) || gewählteStrasse.getBesitzer() == null)) {
	            myView.displayStraßeKaufenButton();
	            myView.repaint();
	            myView.revalidate();
	        } else {
	        	int Miete = gewählteStrasse.getMiete();
	        	String hilft = gewählteStrasse.getBesitzer();
	        		if (Hilfe.getName().equals(hilft)) {
	        			System.out.println(" Straße gehört dir selbst ");
	        		} else {
	        			Spieler Empfänger = myModel.findSpielerByName(hilft);
	        			Hilfe.mieteZahlen(Miete, Empfänger);
	        		}
	        	
	        }
		}
	}
	
	
	public void StraßeKaufen() {
		Spieler Hilfe = myModel.getAktuellerSpieler();
		int id = Hilfe.getPosition();
		Strassen gewählteStrasse = myModel.getStreetById(id);
		int preis = gewählteStrasse.getKaufpreis();
		Hilfe.setGeld(Hilfe.getGeld() - preis);
		Bank Hilfsbank = myModel.getBank();
		Hilfsbank.geldBekommen(preis);
		gewählteStrasse.setBesitzer(Hilfe.getName());
		System.out.println(gewählteStrasse.getBesitzer());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
	
	
}
