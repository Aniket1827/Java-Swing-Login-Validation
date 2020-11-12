import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginWindow = new JLabel("Login Window");
		lblLoginWindow.setFont(new Font("Calibri", Font.BOLD, 20));
		lblLoginWindow.setBounds(152, 11, 129, 32);
		contentPane.add(lblLoginWindow);
		
		JLabel lblUsername = new JLabel("Username : ");
		lblUsername.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblUsername.setBounds(40, 73, 84, 24);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblPassword.setBounds(40, 124, 74, 24);
		contentPane.add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(127, 75, 154, 22);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		txtpassword = new JTextField();
		txtpassword.setBounds(124, 126, 157, 20);
		contentPane.add(txtpassword);
		txtpassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane p = new JOptionPane();
				//Validate username and password
				String username = txtusername.getText();
				String pwd = txtpassword.getText();
				
				if(username.equals("admin") && pwd.equals("pass@123"))
				{
					p.showMessageDialog(null, "Logged In Successfully! :)","Login",1);
				}
				else
				{
					p.showMessageDialog(null, "Login Failed :(","Login",1);
				}
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.BOLD, 15));
		btnLogin.setBounds(152, 181, 89, 23);
		contentPane.add(btnLogin);
	}
}
