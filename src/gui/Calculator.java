package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.EventListenerList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DropMode;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmSignOut;
	private JButton btn_nula;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_multy;
	private JButton btn_minus;
	private JButton btn_plus;
	private JButton btn_divide;
	private JButton btnC;
	private JButton btn_equal;
	private JFrame frame;
	private JFrame frameMain;
	private JTextField put;
	private boolean checkIf;
	private boolean number;
	private JButton btnNewButton;
	private int count;

	public Calculator(JFrame frames) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 367);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtn_nula());
		contentPane.add(getBtn_1());
		contentPane.add(getBtn_2());
		contentPane.add(getBtn_3());
		contentPane.add(getBtn_4());
		contentPane.add(getBtn_5());
		contentPane.add(getBtn_6());
		contentPane.add(getBtn_7());
		contentPane.add(getBtn_8());
		contentPane.add(getBtn_9());
		contentPane.add(getBtn_multy());
		contentPane.add(getBtn_minus());
		contentPane.add(getBtn_plus());
		contentPane.add(getBtn_divide());
		contentPane.add(getBtnC());
		contentPane.add(getBtn_equal());
		contentPane.add(getPut());
		contentPane.add(getBtnNewButton());
		frame = this;
		frameMain = frames;
		checkIf = false;
		number = true;
		count = 0;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBackground(Color.DARK_GRAY);
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}

	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Main Menu");
			mnNewMenu.setForeground(Color.WHITE);
			mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
			mnNewMenu.add(getMntmSignOut());
		}
		return mnNewMenu;
	}

	private JMenuItem getMntmSignOut() {
		if (mntmSignOut == null) {
			mntmSignOut = new JMenuItem("Sign out");
			mntmSignOut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					frameMain.setVisible(true);
				}

			});
		}
		return mntmSignOut;
	}

	private JButton getBtn_nula() {
		if (btn_nula == null) {
			btn_nula = new JButton("0");
			btn_nula.setBackground(Color.LIGHT_GRAY);
			btn_nula.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "0");
						checkIf = false;
					} else {
						put.setText("0");
					}
					number = true;
				}
			});
			btn_nula.setBounds(86, 220, 53, 41);
		}
		return btn_nula;
	}

	private JButton getBtn_1() {
		if (btn_1 == null) {
			btn_1 = new JButton("1");
			btn_1.setBackground(Color.LIGHT_GRAY);
			btn_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "1");
						checkIf = false;
					} else {
						put.setText("1");
					}
				}
			});
			btn_1.setBounds(20, 168, 53, 41);
		}
		return btn_1;
	}

	private JButton getBtn_2() {
		if (btn_2 == null) {
			btn_2 = new JButton("2");
			btn_2.setBackground(Color.LIGHT_GRAY);
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "2");
						checkIf = false;
					} else {
						put.setText("2");
					}
					number = true;
				}
			});
			btn_2.setBounds(86, 168, 53, 41);
		}
		return btn_2;
	}

	private JButton getBtn_3() {
		if (btn_3 == null) {
			btn_3 = new JButton("3");
			btn_3.setBackground(Color.LIGHT_GRAY);
			btn_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || number == true && !put.getText().equalsIgnoreCase("0")) {
						put.setText(put.getText() + "3");
						checkIf = false;
					} else {
						put.setText("3");
					}
					number = true;
				}
			});
			btn_3.setBounds(150, 168, 53, 41);
		}
		return btn_3;
	}

	private JButton getBtn_4() {
		if (btn_4 == null) {
			btn_4 = new JButton("4");
			btn_4.setBackground(Color.LIGHT_GRAY);
			btn_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "4");
						checkIf = false;
					} else {
						put.setText("4");
					}
					number = true;
				}
			});
			btn_4.setBounds(20, 115, 53, 41);
		}
		return btn_4;
	}

	private JButton getBtn_5() {
		if (btn_5 == null) {
			btn_5 = new JButton("5");
			btn_5.setBackground(Color.LIGHT_GRAY);
			btn_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "5");
						checkIf = false;
					} else {
						put.setText("5");
					}
					number = true;
				}
			});
			btn_5.setBounds(86, 115, 53, 41);
		}
		return btn_5;
	}

	private JButton getBtn_6() {
		if (btn_6 == null) {
			btn_6 = new JButton("6");
			btn_6.setBackground(Color.LIGHT_GRAY);
			btn_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "6");
						checkIf = false;
					} else {
						put.setText("6");
					}
					number = true;
				}
			});
			btn_6.setBounds(150, 115, 53, 41);
		}
		return btn_6;
	}

	private JButton getBtn_7() {
		if (btn_7 == null) {
			btn_7 = new JButton("7");
			btn_7.setBackground(Color.LIGHT_GRAY);
			btn_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "7");
						checkIf = false;
					} else {
						put.setText("7");
					}
					number = true;
				}
			});
			btn_7.setBounds(20, 63, 53, 41);
		}
		return btn_7;
	}

	private JButton getBtn_8() {
		if (btn_8 == null) {
			btn_8 = new JButton("8");
			btn_8.setBackground(Color.LIGHT_GRAY);
			btn_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "8");
						checkIf = false;
					} else {
						put.setText("8");
					}
					number = true;
				}
			});
			btn_8.setBounds(86, 63, 53, 41);
		}
		return btn_8;
	}

	private JButton getBtn_9() {
		if (btn_9 == null) {
			btn_9 = new JButton("9");
			btn_9.setBackground(Color.LIGHT_GRAY);
			btn_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkIf || (number == true && !put.getText().equalsIgnoreCase("0"))) {
						put.setText(put.getText() + "9");
						checkIf = false;
					} else {
						put.setText("9");
					}
					number = true;
				}
			});
			btn_9.setBounds(150, 63, 53, 41);
		}
		return btn_9;
	}

	private JButton getBtn_multy() {
		if (btn_multy == null) {
			btn_multy = new JButton("*");
			btn_multy.setForeground(Color.WHITE);
			btn_multy.setBackground(Color.BLACK);
			btn_multy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = put.getText();
					if (count == 1 && !checkIf) {
						if (text.contains("+")) {
							String[] plus = text.split("\\+");
							System.out.println(plus[0]+" "+plus[1]);
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							//System.out.println("prvi: "+prvi+", drugi: "+drugi);
							put.setText((prvi+drugi)+"");
							count=0;
						}
						System.out.println(text.substring(0, 1));
						if (text.contains("-") && !text.substring(0, 1).equalsIgnoreCase("-")) {
							String[] plus = text.split("\\-");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi-drugi)+"");
							count = 0;
						}
						else{
							if(text.indexOf("-", text.indexOf("-") + 1)!=-1){
								long prvi = Long.parseLong(text.substring(0, (text.indexOf("-", text.indexOf("-") + 1))));
								long drugi = Long.parseLong(text.substring(text.indexOf("-", text.indexOf("-") +1)));
								put.setText((prvi+drugi)+"");
								count = 0;
							}
						}
						if (text.contains("*")) {
							String[] plus = text.split("\\*");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi*drugi)+"");
							count = 0;
						}
						if (text.contains("/")) {
							String[] plus = text.split("/");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi/drugi)+"");
							count = 0;
						}
					}
					if (checkIf) {
						put.setText(put.getText().substring(0, put.getText().length() - 1) + "*");
					} else {
						if (!put.getText().equalsIgnoreCase("")) {
							put.setText(put.getText() + "*");
							checkIf = true;
							count++;
						}
					}

				}
			});
			btn_multy.setBounds(216, 168, 53, 41);
		}
		return btn_multy;
	}

	private JButton getBtn_minus() {
		if (btn_minus == null) {
			btn_minus = new JButton("-");
			btn_minus.setForeground(Color.WHITE);
			btn_minus.setBackground(Color.BLACK);
			btn_minus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = put.getText();
					if (count == 1 && !checkIf) {
						if (text.contains("+")) {
							String[] plus = text.split("\\+");
							System.out.println(plus[0]+" "+plus[1]);
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							
							put.setText((prvi+drugi)+"");
							count=0;
						}
						if (text.contains("-") && !text.substring(0, 1).equalsIgnoreCase("-")) {
							int i = text.indexOf('-', 1 + text.indexOf('-'));
							System.out.println("IIII "+i);

							String[] plus = text.split("\\-");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi-drugi)+"");
							count = 0;
						}
						else{
							if(text.indexOf("-", text.indexOf("-") + 1)!=-1){
								long prvi = Long.parseLong(text.substring(0, (text.indexOf("-", text.indexOf("-") + 1))));
								long drugi = Long.parseLong(text.substring(text.indexOf("-", text.indexOf("-") +1)));
								put.setText((prvi+drugi)+"");
								count = 0;
							}
						}
						if (text.contains("*")) {
							String[] plus = text.split("\\*");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi*drugi)+"");
							count = 0;
						}
						if (text.contains("/")) {
							String[] plus = text.split("/");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi/drugi)+"");
							count = 0;
						}
					}
					if (checkIf) {
						put.setText(put.getText().substring(0, put.getText().length() - 1) + "-");
					} else {
						if (!put.getText().equalsIgnoreCase("")) {
							put.setText(put.getText() + "-");
							checkIf = true;
							count++;
						}
					}
				}
			});
			btn_minus.setBounds(216, 115, 53, 41);
		}
		return btn_minus;
	}

	private JButton getBtn_plus() {
		if (btn_plus == null) {
			btn_plus = new JButton("+");
			btn_plus.setForeground(Color.WHITE);
			btn_plus.setBackground(Color.BLACK);
			btn_plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = put.getText();
					if (count == 1 && !checkIf) {
						if (text.contains("+")) {
							String[] plus = text.split("\\+");
							System.out.println(plus[0]+" "+plus[1]);
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							//System.out.println("prvi: "+prvi+", drugi: "+drugi);
							put.setText((prvi+drugi)+"");
							count=0;
						}
						if (text.contains("-") && !text.substring(0, 1).equalsIgnoreCase("-")){
							String[] plus = text.split("\\-");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi-drugi)+"");
							count = 0;
						}
						else{
							if(text.indexOf("-", text.indexOf("-") + 1)!=-1){
								long prvi = Long.parseLong(text.substring(0, (text.indexOf("-", text.indexOf("-") + 1))));
								long drugi = Long.parseLong(text.substring(text.indexOf("-", text.indexOf("-") +1)));
								put.setText((prvi+drugi)+"");
								count = 0;
							}
						}
						if (text.contains("*")) {
							String[] plus = text.split("\\*");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi*drugi)+"");
							count = 0;
						}
						if (text.contains("/")) {
							String[] plus = text.split("/");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi/drugi)+"");
							count = 0;
						}
					}
					if (checkIf) {
						put.setText(put.getText().substring(0, put.getText().length() - 1) + "+");
					} else {
						if (!put.getText().equalsIgnoreCase("")) {
							put.setText(put.getText() + "+");
							checkIf = true;
							count++;
						}
					}
				}
			});
			btn_plus.setBounds(216, 63, 53, 41);
		}
		return btn_plus;
	}

	private JButton getBtn_divide() {
		if (btn_divide == null) {
			btn_divide = new JButton("/");
			btn_divide.setForeground(Color.WHITE);
			btn_divide.setBackground(Color.BLACK);
			btn_divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = put.getText();
					if (count == 1 && !checkIf) {
						if (text.contains("+")) {
							String[] plus = text.split("\\+");
							System.out.println(plus[0]+" "+plus[1]);
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							//System.out.println("prvi: "+prvi+", drugi: "+drugi);
							put.setText((prvi+drugi)+"");
							count=0;
						}
						if (text.contains("-") && !text.substring(0, 1).equalsIgnoreCase("-")) {
							//System.out.println(text.indexOf("\\-", text.indexOf("\\-") + 1));
							String[] plus = text.split("-");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi-drugi)+"");
							count = 0;
						}
						else{
							if(text.indexOf("-", text.indexOf("-") + 1)!=-1){
								long prvi = Long.parseLong(text.substring(0, (text.indexOf("-", text.indexOf("-") + 1))));
								long drugi = Long.parseLong(text.substring(text.indexOf("-", text.indexOf("-") +1)));
								System.out.println(prvi+" ** " + drugi);
								put.setText((prvi+drugi)+"");
								count = 0;
							}
						}
						if (text.contains("*")) {
							String[] plus = text.split("\\*");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi*drugi)+"");
							count = 0;
						}
						if (text.contains("/")) {
							String[] plus = text.split("/");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi/drugi)+"");
							count = 0;
						}
					}
					if (checkIf) {
						put.setText(put.getText().substring(0, put.getText().length() - 1) + "/");
					} else {
						if (!put.getText().equalsIgnoreCase("")) {
							put.setText(put.getText() + "/");
							checkIf = true;
							count++;
						}
					}
				}
			});
			btn_divide.setBounds(216, 220, 53, 41);
		}
		return btn_divide;
	}

	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("c");
			btnC.setForeground(Color.WHITE);
			btnC.setBackground(Color.DARK_GRAY);
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					put.setText("0");
					checkIf = false;
					count = 0;
				}
			});
			btnC.setBounds(20, 220, 53, 41);
		}
		return btnC;
	}

	private JButton getBtn_equal() {
		if (btn_equal == null) {
			btn_equal = new JButton("=");
			btn_equal.setForeground(Color.WHITE);
			btn_equal.setBackground(Color.DARK_GRAY);
			btn_equal.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = put.getText();
					if (count == 1 && !checkIf) {
						if (text.contains("+")) {
							String[] plus = text.split("\\+");
							System.out.println(plus[0]+" "+plus[1]);
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							//System.out.println("prvi: "+prvi+", drugi: "+drugi);
							put.setText((prvi+drugi)+"");
							count=0;
						}
						if (text.contains("-") && !text.substring(0, 1).equalsIgnoreCase("-")) {
							String[] plus = text.split("\\-");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi-drugi)+"");
							count = 0;
						}
						else{
							if(text.indexOf("-", text.indexOf("-") + 1)!=-1){
								long prvi = Long.parseLong(text.substring(0, (text.indexOf("-", text.indexOf("-") + 1))));
								long drugi = Long.parseLong(text.substring(text.indexOf("-", text.indexOf("-") +1)));
								put.setText((prvi+drugi)+"");
								count = 0;
							}
						}
						if (text.contains("*")) {
							String[] plus = text.split("\\*");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi*drugi)+"");
							count = 0;
						}
						if (text.contains("/")) {
							String[] plus = text.split("/");
							long prvi = Long.parseLong(plus[0]);
							long drugi = Long.parseLong(plus[1]);
							put.setText((prvi/drugi)+"");
							count = 0;
						}
					}
				}
			});
			btn_equal.setBounds(150, 220, 53, 41);
		}
		return btn_equal;
	}

	private JTextField getPut() {
		if (put == null) {
			put = new JTextField("Right");
			put.setHorizontalAlignment(JTextField.RIGHT);
			put.setBorder(
					BorderFactory.createCompoundBorder(put.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			put.setFont(new Font("Tahoma", Font.BOLD, 14));
			put.setBackground(Color.WHITE);
			put.setEditable(false);
			put.setBounds(20, 11, 249, 41);
			put.setColumns(10);
			put.setText("0");
		}
		return put;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("BACKSPACE");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String operator = put.getText().substring(put.getText().length() - 1, put.getText().length());
					if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
						count = 0;
					}
					if (put.getText().length() > 1) {
						put.setText(put.getText().substring(0, put.getText().length() - 1));
						if (checkIf) {
							checkIf = false;
						}
						operator = put.getText().substring(put.getText().length() - 1, put.getText().length());
						if (!checkIf && (operator.equals("+") || operator.equals("-") || operator.equals("*")
								|| operator.equals("/"))) {
							checkIf = true;
						}
					} else {
						put.setText("0");
					}
				}
			});
			btnNewButton.setBackground(new Color(192, 192, 192));
			btnNewButton.setBounds(20, 272, 249, 23);
		}
		return btnNewButton;
	}
}
