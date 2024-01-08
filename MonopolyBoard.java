import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MonopolyBoard extends JFrame {
    public MonopolyBoard() {
        setTitle("Monopoly Brett");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(11, 11)); // 11x11 Spielfeld 
        
        MonopolyField goField = new MonopolyField("Go");
        MonopolyField gefängnis = new MonopolyField("Gefängnis");

        Player player = new Player(Color.RED);
        goField.setPlayer(player);
        
        // Fügen Sie hier Ihre Spielfelder hinzu
        add(gefängnis);
        add(new MonopolyField("pink 1"));
        add(new MonopolyField("werk 1"));
        add(new MonopolyField("pink 2 "));
        add(new MonopolyField("pink 3"));
        add(new MonopolyField("bahnhof 2"));
        add(new MonopolyField("orange 1"));
        add(new MonopolyField("comunity"));
        add(new MonopolyField("orange 2"));
        add(new MonopolyField("ornage 3"));
        add(new MonopolyField("frei parken"));
        add(new MonopolyField("hellblau 3"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("rot 1"));
        add(new MonopolyField("hellblau 2"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("chance"));
        add(new MonopolyField("Chance"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("rot 2"));
        add(new MonopolyField("hellblau 1"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("rot 3"));
        add(new MonopolyField("Bahnhof 1"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("bahnhof 3"));
        add(new MonopolyField("tax1"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("gelb 1"));
        add(new MonopolyField("braun 2"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("gelb 2"));
        add(new MonopolyField("Community"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("werk 2"));
        add(new MonopolyField("braun 1"));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField(" "));
        add(new MonopolyField("gelb 3"));
        add (goField);
        add(new MonopolyField("dunkelblau 2"));
        add(new MonopolyField("tax2"));
        add(new MonopolyField("dunkelblau 1"));
        add(new MonopolyField("chance"));
        add(new MonopolyField("bahnhof 4"));
        add(new MonopolyField("grün 3"));
        add(new MonopolyField("community"));
        add(new MonopolyField("grün 2"));
        add(new MonopolyField("grün 1"));
        add(new MonopolyField("go to jail"));

        
        add(new MonopolyField("go to jail"));
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private MonopolyField GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MonopolyBoard());
    }
}
