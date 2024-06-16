package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import model.ValidadorCPF;
import view.MenuView;

public class MenuController {
	MenuView menuView;
	ActionHandler actionHandler;
	CaretHandler caretHandler;
	
	public MenuController(MenuView menuView) {
		this.menuView = menuView;
		actionHandler = new ActionHandler();
		caretHandler = new CaretHandler();
		control();
	}
	
	private void control() {
		menuView.getItemCadastrar().addActionListener(this.actionHandler);
		menuView.getItemCadastrar().setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuView.getSair().addActionListener(this.actionHandler);
		menuView.getCpfField().addCaretListener(this.caretHandler);
	}
	
	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==menuView.getItemCadastrar()) {
				menuView.getCadastrarPanel().setVisible(true);
			}
			else if (e.getSource()==menuView.getSair()) {
				UIManager.put("OptionPane.yesButtonText", "Sim");
	            UIManager.put("OptionPane.noButtonText", "Não");
	            int choice = JOptionPane.showConfirmDialog(menuView, "Deseja realmente sair?", "Fechar sistema", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
		}	
	}
	
	private class CaretHandler implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent e) {
			String cpf = menuView.getCpfField().getText();
			if (ValidadorCPF.validarCPF(cpf)) {
				menuView.getAdicionarButton().setEnabled(true);
			} else {
				menuView.getAdicionarButton().setEnabled(false);
			}
			
		}
	}
	
	

}
