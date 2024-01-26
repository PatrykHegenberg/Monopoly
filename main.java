import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
                
		Controller myController = new Controller();
		View myView = new View();
		Model myModel = new Model();

		myController.setMyView(myView);
		myController.setMyModel(myModel);
		myView.setMyController(myController);
		
		myView.init();
		
	}
{
        // JDBC-Verbindungsparameter
        String jdbcUrl = "jdbc:mysql://localhost:3306/spielstand";
        String benutzername = "admin_test";
        String passwort = "passwort_test";

        // SQL-Abfrage
        String sqlAbfrage = "SELECT * FROM deineTabelle";

        try {
            // Verbindung zur Datenbank herstellen
            Connection verbindung = DriverManager.getConnection(jdbcUrl, benutzername, passwort);

            // SQL-Statement erstellen
            Statement statement = verbindung.createStatement();

            // SQL-Abfrage ausführen
            ResultSet ergebnis = statement.executeQuery(sqlAbfrage);

            // Ergebnisse verarbeiten
            while (ergebnis.next()) {
                // Beispiel: Ausgabe von Spaltenwerten
                int id = ergebnis.getInt("id");
                String name = ergebnis.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Verbindung schließen
            verbindung.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
