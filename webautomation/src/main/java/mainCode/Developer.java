package mainCode;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Developer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void devWin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Developer frame = new Developer();
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
	public Developer() {
		setTitle("Developers");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 327, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//String msg = "Hello User,\nThis application was developed by Hakimi iTech. \nContact Taher Shabbiri for any issue or any concern regarding this application.\nFor any other software and any other IT solutions contact on tahershabbiri@gmail.com or +91 916 722 7689.";
		
		JEditorPane dtrpnHelloUser = new JEditorPane();
		dtrpnHelloUser.setForeground(Color.BLACK);
		dtrpnHelloUser.setBackground(SystemColor.control);
		dtrpnHelloUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dtrpnHelloUser.setEditable(false);
		dtrpnHelloUser.setForeground(Color.BLACK);
		dtrpnHelloUser.setText("Hello User,\r\nThis application was developed by Hakimi iTech. \r\nContact Taher Shabbiri for any issue or \r\nany concern regarding this application.\r\nFor any other software and any other IT solutions \r\ncontact on tahershabbiri@gmail.com\r\nor +91 916 722 7689.");
		dtrpnHelloUser.setBounds(10, 11, 301, 129);
		contentPane.add(dtrpnHelloUser);
	}
}
