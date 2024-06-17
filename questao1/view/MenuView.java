package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class MenuView extends JFrame {
	JMenuBar barraMenu;
	JMenu gerenciar;
	JMenuItem sair;
	JMenu subMenuCliente;
	JMenu subMenuExit;
	JMenuItem itemCadastrar;
	ImageIcon cadastarIcon;
	JLabel clienteLabel;
	Font fontConfiguration;
	JPanel formularioPanel;
	JLabel nomeLabel;
	JTextField nomeField;
	JLabel cpfLabel;
	JFormattedTextField cpfField;
	
	JButton adicionarButton;
	JMenuItem itemRemover;
	JMenuItem itemAtualizar;
	JMenuItem itemBuscar;
	
	JPanel cadastrarPanel;
	
	
	public MenuView() {
		setTitle("MPOO Market");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		barraMenu = new JMenuBar();
		gerenciar = new JMenu("Gerenciar");
		sair = new JMenuItem("Sair");
		subMenuCliente = new JMenu("Cliente");
		subMenuExit = new JMenu("Exit");
		cadastarIcon = new ImageIcon("image/cadastrar-icon.png");
		itemCadastrar = new JMenuItem("Cadastrar", cadastarIcon);
		itemRemover = new JMenuItem("Remover");
		itemAtualizar = new JMenuItem("Atualizar");
		itemBuscar = new JMenuItem("Buscar");
		
		cadastrarPanel = new JPanel();
		cadastrarPanel.setLayout(new FlowLayout());
		clienteLabel = new JLabel("Cliente");
		fontConfiguration = new Font("Arial", Font.BOLD, 24);
		clienteLabel.setFont(fontConfiguration);
		formularioPanel = new JPanel();
		formularioPanel.setLayout(new GridLayout(2, 2, 10, 10));
		formularioPanel.setBackground(Color.LIGHT_GRAY);
		nomeLabel = new JLabel("Nome");
		nomeField = new JTextField("Nome Completo", 10);
		nomeField.setForeground(Color.LIGHT_GRAY);
		cpfLabel = new JLabel("Cpf");
		try {
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		adicionarButton = new JButton("Adicionar");
		adicionarButton.setEnabled(false);
		
		cadastrarPanel.add(clienteLabel);
		formularioPanel.add(nomeLabel);
		formularioPanel.add(nomeField);
		formularioPanel.add(cpfLabel);
		formularioPanel.add(cpfField);
		cadastrarPanel.add(formularioPanel);
		cadastrarPanel.add(adicionarButton);
		cadastrarPanel.setBackground(Color.LIGHT_GRAY);
				
		
		subMenuCliente.add(itemCadastrar);
		subMenuCliente.add(itemRemover);
		subMenuCliente.add(itemAtualizar);
		subMenuCliente.add(itemBuscar);
		
		gerenciar.add(subMenuCliente);
		gerenciar.add(new JSeparator());
		gerenciar.add(subMenuExit);
		
		barraMenu.add(gerenciar);
		barraMenu.add(sair);
		
		setJMenuBar(barraMenu);
		add(cadastrarPanel);
		
		cadastrarPanel.setVisible(false);
		setVisible(false);
	}


	public JMenuItem getItemCadastrar() {
		return itemCadastrar;
	}


	public JPanel getCadastrarPanel() {
		return cadastrarPanel;
	}


	public JMenuItem getSair() {
		return sair;
	}


	public JFormattedTextField getCpfField() {
		return cpfField;
	}


	public JButton getAdicionarButton() {
		return adicionarButton;
	}


	public JTextField getNomeField() {
		return nomeField;
	}
	
	
	
}
