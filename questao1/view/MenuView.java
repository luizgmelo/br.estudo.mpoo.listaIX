package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame {
	JLabel helloLabel;
	
	public MenuView() {
		setTitle("Hello View");
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		
		helloLabel = new JLabel("Hello");
		
		add(helloLabel);
		
		
		setVisible(false);
	}
}
