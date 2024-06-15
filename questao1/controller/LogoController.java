package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.LogoView;
import view.MenuView;

public class LogoController {
	LogoView logoView;
	MenuView menuView;
	KeyHandler keyHandler;

	public LogoController(LogoView logoView, MenuView menuView) {
		this.logoView = logoView;
		this.menuView = menuView;
		keyHandler = new KeyHandler();
		control();
	}
	
	private void control() {
		logoView.addKeyListener(keyHandler);
	}
	
	private class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==e.VK_ENTER) {
				logoView.setVisible(false);
				menuView.setVisible(true);
			}
			
		}
	}
	
	
	
	
	

}
