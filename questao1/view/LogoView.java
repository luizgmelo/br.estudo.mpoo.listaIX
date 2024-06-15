package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LogoView extends JFrame{
	JLabel logoLabel;
	ImageIcon logoIcon;
	
	
	public LogoView() {
		setSize(300, 300);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		logoIcon = new ImageIcon("image/icon.png");
		logoLabel = new JLabel(logoIcon);
		
		add(logoLabel);
		
		setVisible(true);
	}

}
