package app;

import controller.LogoController;
import view.LogoView;
import view.MenuView;

public class App {

	public static void main(String[] args) {
		LogoView logoView = new LogoView();
		MenuView menuView = new MenuView();
		LogoController logoController = new LogoController(logoView, menuView);
	}

}
