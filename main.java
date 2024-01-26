import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller myController = new Controller();
		View myView = new View();
		Model myModel = new Model();

		myController.setMyView(myView);
		myController.setMyModel(myModel);
		myView.setMyController(myController);
		
		myView.init();
		
	}

}
