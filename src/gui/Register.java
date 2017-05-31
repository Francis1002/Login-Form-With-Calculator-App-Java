package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import other.Person;
import other.PersonList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Register extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblGender;
	private JLabel lblRegister;
	private JLabel lblEmail;
	private JTextField username;
	private JPasswordField password;
	private JTextField email;
	private JTextField firstName;
	private JTextField lastName;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JButton btnNewButton;
	private ButtonGroup group;
	private JFrame frames;
	private PersonList list;
	private JFrame frameN;
	private JButton btnLogin;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmLogin;

	public Register(PersonList list, JFrame framed) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getLblFirstName());
		contentPane.add(getLblLastName());
		contentPane.add(getLblGender());
		contentPane.add(getLblRegister());
		contentPane.add(getLblEmail());
		contentPane.add(getUsername());
		contentPane.add(getPassword());
		contentPane.add(getEmail());
		contentPane.add(getFirstName());
		contentPane.add(getLastName());
		contentPane.add(getRdbtnMale());
		contentPane.add(getRdbtnFemale());
		contentPane.add(getBtnNewButton());
		group = new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		contentPane.add(getBtnLogin());
		contentPane.add(getMenuBar_1());
		frames = this;
		this.list = list;
		frameN = framed;
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblUsername.setBounds(31, 64, 80, 14);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPassword.setBounds(31, 101, 80, 14);
		}
		return lblPassword;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First name");
			lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblFirstName.setBounds(31, 198, 80, 14);
		}
		return lblFirstName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last name");
			lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblLastName.setBounds(31, 242, 80, 14);
		}
		return lblLastName;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblGender.setBounds(31, 284, 80, 14);
		}
		return lblGender;
	}
	private JLabel getLblRegister() {
		if (lblRegister == null) {
			lblRegister = new JLabel("Register");
			lblRegister.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblRegister.setBounds(201, 28, 80, 21);
		}
		return lblRegister;
	}
	private JLabel getLblEmail() {
		if (lblEmail == null) {
			lblEmail = new JLabel("Email");
			lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblEmail.setBounds(31, 151, 80, 14);
		}
		return lblEmail;
	}
	private JTextField getUsername() {
		if (username == null) {
			username = new JTextField();
			username.setBounds(141, 60, 226, 27);
			username.setColumns(10);
		}
		return username;
	}
	private JPasswordField getPassword() {
		if (password == null) {
			password = new JPasswordField();
			password.setBounds(141, 94, 226, 27);
		}
		return password;
	}
	private JTextField getEmail() {
		if (email == null) {
			email = new JTextField();
			email.setBounds(141, 147, 226, 27);
			email.setColumns(10);
		}
		return email;
	}
	private JTextField getFirstName() {
		if (firstName == null) {
			firstName = new JTextField();
			firstName.setColumns(10);
			firstName.setBounds(139, 194, 228, 27);
		}
		return firstName;
	}
	private JTextField getLastName() {
		if (lastName == null) {
			lastName = new JTextField();
			lastName.setColumns(10);
			lastName.setBounds(141, 238, 226, 27);
		}
		return lastName;
	}
	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			rdbtnMale.setBounds(146, 282, 109, 23);
		}
		return rdbtnMale;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			rdbtnFemale.setBounds(258, 282, 109, 23);
		}
		return rdbtnFemale;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Submit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String message = validateInput();
					if(message == null){
						String gender = "muski";
						if(rdbtnFemale.isSelected()){
							gender = "zenski";
						}
						Person persona = new Person(username.getText(), password.getText(), firstName.getText(), lastName.getText(), email.getText(), gender);
						if(list.add(persona)){
							JOptionPane.showMessageDialog(frames, "Succesful submit.");
							frames.setVisible(false);
							frameN.setVisible(true);
						}
						else{
							JOptionPane.showMessageDialog(frames, "Already user with that username", "RegisterUser Bug", JOptionPane.ERROR_MESSAGE);
						}
						
					}
					else{
						JOptionPane.showMessageDialog(frames, message, "Register Bug", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setBackground(Color.GRAY);
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBounds(141, 312, 226, 30);
		}
		return btnNewButton;
	}
	private String validateInput(){
		String emails = email.getText();
				Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
				Matcher m = p.matcher(emails);
				
		if(username.getText().equalsIgnoreCase("")){
			return "Username is not valid";
		}
		if(password.getText().equalsIgnoreCase("")){
			return "Password is not valid";
		}
		if(!m.matches()){
			return "Emails is not valid";
		}
		if(!rdbtnMale.isSelected() && !rdbtnFemale.isSelected()){
			return "Gender is not selected";
		}
		if(firstName.getText().equalsIgnoreCase("")){
			return "First is not valid";
		}
		if(lastName.getText().equalsIgnoreCase("")){
			return "Last is not valid";
		}
		return null;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frames.setVisible(false);
					frameN.setVisible(true);
				}
			});
			btnLogin.setForeground(Color.WHITE);
			btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnLogin.setBackground(Color.GRAY);
			btnLogin.setBounds(31, 312, 80, 30);
		}
		return btnLogin;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(Color.DARK_GRAY);
			menuBar.setBounds(0, 0, 434, 21);
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Main Menu");
			mnNewMenu.setForeground(Color.WHITE);
			mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
			mnNewMenu.add(getMntmLogin());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmLogin() {
		if (mntmLogin == null) {
			mntmLogin = new JMenuItem("Login");
			mntmLogin.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frames.setVisible(false);
					frameN.setVisible(true);
				}
				
			});
		}
		return mntmLogin;
	}
}
