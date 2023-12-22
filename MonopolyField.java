import javax.swing.*;
import java.awt.*;

class MonopolyField extends JPanel {
    private String name;
    private Player player;

    public MonopolyField(String name) {
        this.name = name;
        setPreferredSize(new Dimension(80, 80)); // Setzen Sie die Größe des Spielfelds
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Hier können Sie den Code zum Zeichnen des Spielfelds einfügen
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g.drawString(name, 10, getHeight() / 2);

        // Zeichnen Sie die Spielfigur, wenn vorhanden
        if (player != null) {
            g.setColor(player.getColor());
            g.fillOval(getWidth() / 2 - 10, getHeight() / 2 - 10, 20, 20);
        }
    }
}
class Player {
    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}