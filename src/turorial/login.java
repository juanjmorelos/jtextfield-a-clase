package turorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("Login");
	private JTextField textField;
	private JTextField txt_user;
	private JPasswordField txt_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBounds(0, 0, 450, 36);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		txt_user = new JTextField();
		txt_user.setBounds(112, 59, 231, 36);
		frame.getContentPane().add(txt_user);
		txt_user.setColumns(10);
		
		txt_pass = new JPasswordField();
		txt_pass.setBounds(112, 138, 231, 36);
		frame.getContentPane().add(txt_pass);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(112, 43, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(110, 116, 95, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clase_tutorial clase = new clase_tutorial();
				
				clase.setUsuario(txt_user.getText().toString().trim());
				clase.setPassword(txt_pass.getText().toString().trim());
				
				if(clase.getUsuario().equals("")) {
					JOptionPane.showMessageDialog(null, "Debe ingresar un usuario");
				} else if(clase.getPassword().equals("")){
					JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña");
				} else {
					if(clase.login()) {
						JOptionPane.showMessageDialog(null, "Sesión iniciada");
					} else {
						JOptionPane.showMessageDialog(null, "Datos erróneos");
					}
				}
			}
		});
		btnNewButton.setBounds(112, 200, 231, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
