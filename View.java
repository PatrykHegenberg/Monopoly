import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.Window.Type;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;


public class View extends JFrame implements ActionListener {
	public View() {
	}
		public Controller myController;
		
		
		private JScrollPane scrollPane = new JScrollPane();
		
		private JPanel panel = createColoredPanel("Frei Parken", new Color(252, 199, 211));
		private JPanel panel_1 = createColoredPanel("Berliner Str.", new Color(247, 185, 114));
		private JPanel panel_2 = createColoredPanel("Wiener Str.", new Color(247, 185, 114));
		private JPanel panel_3 = createColoredPanel("G-Karte", Color.WHITE);	
		private JPanel panel_4 = createColoredPanel("Münchener Str.", new Color(247, 185, 114));
		private JPanel panel_5 = createColoredPanel("West-Bhf", new Color(143, 143, 143));
		private JPanel panel_6 = createColoredPanel("Neue Str.", new Color(252, 157, 208));
		private JPanel panel_7 = createColoredPanel("Hafenstr.", new Color(252, 157, 208));
		private JPanel panel_8 = createColoredPanel("Elektrowerk", new Color(207, 204, 206));
		private JPanel panel_9 = createColoredPanel("Seestr.", new Color(252, 157, 208));
		private JPanel panel_10 = createColoredPanel("Gefängnis", Color.ORANGE);
		private JPanel panel_11 = createColoredPanel("Ins Gefängnis", Color.WHITE);
		private JPanel panel_1_1 = createColoredPanel("Rathausplatz", new Color(166, 245, 168));
		private JPanel panel_2_1 = createColoredPanel("Hauptstr.", new Color(166, 245, 168));
		private JPanel panel_3_1 = createColoredPanel("G-Karte", Color.WHITE);
		private JPanel panel_4_1 = createColoredPanel("Bahnhofstr.", new Color(166, 245, 168));
		private JPanel panel_5_1 = createColoredPanel("Haupt-Bhf", new Color(143, 143, 143));
		private JPanel panel_6_1 = createColoredPanel("E-Karte", Color.WHITE);
		private JPanel panel_7_1 = createColoredPanel("Parkstr.", new Color(169, 178, 212));
		private JPanel panel_8_1 = createColoredPanel("Zusatzsteuer", Color.WHITE);
		private JPanel panel_9_1 = createColoredPanel("Schlossallee", new Color(169, 178, 212));
		private JPanel panel_10_1 = createColoredPanel("Start", new Color(255, 73, 66));
		private JPanel panel_12 = createColoredPanel("Theaterstr.", new Color(250, 132, 132));
		private JPanel panel_12_1 = createColoredPanel("E-Karte", Color.WHITE);
		private JPanel panel_12_2 = createColoredPanel("Museumsstr.", new Color(250, 132, 132));
		private JPanel panel_12_3 = createColoredPanel("Opernplatz", new Color(250, 132, 132));
		private JPanel panel_12_4 = createColoredPanel("Nord-Bhf", new Color(143, 143, 143));
		private JPanel panel_12_5 = createColoredPanel("Lessingstr.", new Color(250, 241, 140));
		private JPanel panel_12_6 = createColoredPanel("Schillerstr.", new Color(250, 241, 140));
		private JPanel panel_12_7 = createColoredPanel("Wasserwerk", new Color(207, 204, 206));
		private JPanel panel_12_8 = createColoredPanel("Göthestr.", new Color(250, 241, 140));
		private JPanel panel_12_9 = createColoredPanel("Poststr.", new Color(218, 239, 240));
		private JPanel panel_12_1_1 = createColoredPanel("Elisenstr.", new Color(218, 239, 240));
		private JPanel panel_12_2_1 = createColoredPanel("E-Feld", Color.WHITE);	
		private JPanel panel_12_3_1 = createColoredPanel("Chausseestr.", new Color(218, 239, 240));			
		private JPanel panel_12_4_1 = createColoredPanel("Süd-Bhf", new Color(143, 143, 143));
		private JPanel panel_12_5_1 = createColoredPanel("Eink.Steuer", Color.WHITE);	
		private JPanel panel_12_6_1 = createColoredPanel("Turmstr.", new Color(186, 144, 117));	
		private JPanel panel_12_7_1 = createColoredPanel("G-Feld", Color.WHITE);	
		private JPanel panel_12_8_1 = createColoredPanel("Badstr.", new Color(186, 144, 117));


	
		void init() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			
			scrollPane.setBounds(1270, 10, 250, 800);
			
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(20, 10, 90, 90);
			
			panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(20, 100, 90, 70);
			
			panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(20, 170, 90, 70);
			
			panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3.setBounds(20, 240, 90, 70);
		
			panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_4.setBounds(20, 310, 90, 70);
	
			panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_5.setBounds(20, 380, 90, 70);
			
			panel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_6.setBounds(20, 450, 90, 70);
	
			panel_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_7.setBounds(20, 520, 90, 70);
			
			panel_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_8.setBounds(20, 590, 90, 70);
		
			panel_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_9.setBounds(20, 660, 90, 70);
		
			panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_10.setBounds(20, 730, 90, 90);
		
			panel_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_11.setBounds(740, 10, 90, 90);
			
			panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1_1.setBounds(740, 100, 90, 70);
		
			panel_2_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2_1.setBounds(740, 170, 90, 70);
		
			panel_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_3_1.setBounds(740, 240, 90, 70);
		
			panel_4_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_4_1.setBounds(740, 310, 90, 70);
		
			panel_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_5_1.setBounds(740, 380, 90, 70);
		
			panel_6_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_6_1.setBounds(740, 450, 90, 70);
			
			panel_7_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_7_1.setBounds(740, 520, 90, 70);
		
			panel_8_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_8_1.setBounds(740, 590, 90, 70);
		
			panel_9_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_9_1.setBounds(740, 660, 90, 70);
			
			panel_10_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_10_1.setBounds(740, 730, 90, 90);
		
			panel_12.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12.setBounds(110, 10, 70, 90);
			
			panel_12_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_1.setBounds(180, 10, 70, 90);
		
			panel_12_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_2.setBounds(250, 10, 70, 90);
			
			panel_12_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_3.setBounds(320, 10, 70, 90);	
			
			panel_12_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_4.setBounds(390, 10, 70, 90);	
			
			panel_12_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_5.setBounds(460, 10, 70, 90);	
		
			panel_12_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_6.setBounds(530, 10, 70, 90);
			
			panel_12_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_7.setBounds(600, 10, 70, 90);
			
			panel_12_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_8.setBounds(670, 10, 70, 90);
			
			panel_12_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_9.setBounds(110, 730, 70, 90);
			
			panel_12_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_1_1.setBounds(180, 730, 70, 90);
			
			panel_12_2_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_2_1.setBounds(250, 730, 70, 90);
			
			panel_12_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_3_1.setBounds(320, 730, 70, 90);
			
			panel_12_4_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_4_1.setBounds(390, 730, 70, 90);
			
			panel_12_5_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_5_1.setBounds(460, 730, 70, 90);
			
			panel_12_6_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_6_1.setBounds(530, 730, 70, 90);
			
			panel_12_7_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_7_1.setBounds(600, 730, 70, 90);
			
			panel_12_8_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_12_8_1.setBounds(670, 730, 70, 90);
			
			
			getContentPane().add(scrollPane);
			getContentPane().add(panel);
			getContentPane().add(panel_1);
			getContentPane().add(panel_2);
			getContentPane().add(panel_3);
			getContentPane().add(panel_4);
			getContentPane().add(panel_5);
			getContentPane().add(panel_6);
			getContentPane().add(panel_7);
			getContentPane().add(panel_8);
			getContentPane().add(panel_9);
			getContentPane().add(panel_10);
			getContentPane().add(panel_11);
			getContentPane().add(panel_1_1);
			getContentPane().add(panel_2_1);
			getContentPane().add(panel_3_1);
			getContentPane().add(panel_4_1);
			getContentPane().add(panel_5_1);
			getContentPane().add(panel_6_1);
			getContentPane().add(panel_7_1);
			getContentPane().add(panel_8_1);
			getContentPane().add(panel_9_1);
			getContentPane().add(panel_10_1);
			getContentPane().add(panel_12);
			getContentPane().add(panel_12_1);
			getContentPane().add(panel_12_2);
			getContentPane().add(panel_12_3);
			getContentPane().add(panel_12_4);
			getContentPane().add(panel_12_5);
			getContentPane().add(panel_12_6);
			getContentPane().add(panel_12_7);
			getContentPane().add(panel_12_8);
			getContentPane().add(panel_12_9);
			getContentPane().add(panel_12_1_1);
			getContentPane().add(panel_12_2_1);
			getContentPane().add(panel_12_3_1);
			getContentPane().add(panel_12_4_1);
			getContentPane().add(panel_12_5_1);
			getContentPane().add(panel_12_6_1);
			getContentPane().add(panel_12_7_1);
			getContentPane().add(panel_12_8_1);
	
			
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
			this.pack();
			this.setVisible(true);
		}

	public void setMyController(Controller myController) {
		this.myController = myController;
	}
	
    private JPanel createColoredPanel(String text, Color color) {
        JPanel coloredPanel = new JPanel();
        coloredPanel.setBackground(color);
        coloredPanel.setBorder(new TitledBorder(null, text, TitledBorder.LEADING, TitledBorder.TOP, null, null));
     
        JLabel label = new JLabel(text);
        coloredPanel.add(label);

        return coloredPanel;
    }
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
}
