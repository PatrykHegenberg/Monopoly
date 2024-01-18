import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	public View myView;
	public Model myModel;

	public void setMyView(View MyView) {
		this.myView = myView;
	}

	public void setMyModel(Model myModel) {
		this.myModel = myModel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
