package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

import other.Person;
import other.PersonList;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmRegister;
	private JLabel lblNewLabel;
	private JTextField username;
	private JLabel lblPssword;
	private JPasswordField password;
	private JLabel lblLoginForm;
	private JButton btnRegister;
	private JButton btnLogin;
	private PersonList list;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getUsername());
		contentPane.add(getLblPssword());
		contentPane.add(getPassword());
		contentPane.add(getLblLoginForm());
		contentPane.add(getBtnRegister());
		contentPane.add(getBtnLogin());
		list = new PersonList();
		frame = this;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setForeground(Color.WHITE);
			menuBar.setBackground(Color.DARK_GRAY);
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Main Menu");
			mnNewMenu.setBackground(Color.GRAY);
			mnNewMenu.setForeground(Color.WHITE);
			mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
			mnNewMenu.add(getMntmRegister());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmRegister() {
		if (mntmRegister == null) {
			mntmRegister = new JMenuItem("Register");
			mntmRegister.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					Register rego = new Register(list, frame);
					frame.setVisible(false);
					rego.setVisible(true);
				}
				
			});
		}
		return mntmRegister;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel.setBounds(27, 50, 83, 14);
		}
		return lblNewLabel;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(132, 45, 234, 29);
			username.setColumns(10);
		}
		return username;
	}
	private JLabel getLblPssword() {
		if (lblPssword == null) {
			lblPssword = new JLabel("Password");
			lblPssword.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPssword.setBounds(27, 102, 83, 14);
		}
		return lblPssword;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(132, 97, 234, 29);
		}
		return password;
	}
	private JLabel getLblLoginForm() {
		if (lblLoginForm == null) {
			lblLoginForm = new JLabel("Login Form");
			lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblLoginForm.setBounds(181, 11, 116, 23);
		}
		return lblLoginForm;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Register regi = new Register(list, frame);
					regi.setVisible(true);
					frame.setVisible(false);
				}
			});
			btnRegister.setBackground(Color.GRAY);
			btnRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnRegister.setForeground(Color.WHITE);
			btnRegister.setBounds(132, 145, 106, 23);
		}
		return btnRegister;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String message = validateInput();
					
					if(message == null){
						Person p = list.getObject(username.getText(), password.getText());
						if(p!=null){
							JOptionPane.showMessageDialog(frame, "Succesful input. Welcome, "+username.getText()+".");
							Calculator so = new Calculator(frame);
							frame.setVisible(false);
							so.setVisible(true);
							username.setText("");
							password.setText("");
							
						}
						else{
							JOptionPane.showMessageDialog(frame, "Wrong username or password", "Uknown user", JOptionPane.ERROR_MESSAGE);
							username.setText("");
							password.setText("");
						}
					}
					else{
						JOptionPane.showMessageDialog(frame, message, "Input bug", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnLogin.setBackground(Color.GRAY);
			btnLogin.setForeground(Color.WHITE);
			btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnLogin.setBounds(260, 145, 106, 23);
		}
		return btnLogin;
	}
	private String validateInput(){
		if(username.getText().equalsIgnoreCase("")){
			return "Unesite username";
		}
		if(password.getText().equalsIgnoreCase("")){
			return "Unesite password";
		}
		return null;
	}
	
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
