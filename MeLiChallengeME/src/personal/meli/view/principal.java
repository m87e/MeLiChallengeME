package personal.meli.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;

public class principal {

	private JFrame frmBusquedaDeMail;
	private JTextField textField_mail;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTable table_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frmBusquedaDeMail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBusquedaDeMail = new JFrame();
		frmBusquedaDeMail.setTitle("Busqueda de Mail");
		frmBusquedaDeMail.setBounds(100, 100, 882, 693);
		frmBusquedaDeMail.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBusquedaDeMail.getContentPane().setLayout(null);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(10, 60, 361, 277);
		frmBusquedaDeMail.getContentPane().add(panel_datos);
		panel_datos.setLayout(new GridLayout(6, 0, 0, 0));
		
		JLabel lblNewLabel_mail = new JLabel("Mail (Cuenta de gmail)");
		lblNewLabel_mail.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		panel_datos.add(lblNewLabel_mail);
		
		textField_mail = new JTextField();
		panel_datos.add(textField_mail);
		textField_mail.setColumns(10);
		
		JLabel lblNewLabel_password = new JLabel("Contrase\u00F1a");
		lblNewLabel_password.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		panel_datos.add(lblNewLabel_password);
		
		passwordField = new JPasswordField();
		panel_datos.add(passwordField);
		
		JLabel lblNewLabel_palabraBusqueda = new JLabel("Palabra de busqueda");
		lblNewLabel_palabraBusqueda.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 15));
		panel_datos.add(lblNewLabel_palabraBusqueda);
		
		textField_1 = new JTextField();
		panel_datos.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_botones = new JPanel();
		panel_botones.setBounds(172, 375, 199, 45);
		frmBusquedaDeMail.getContentPane().add(panel_botones);
		panel_botones.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		panel_botones.add(btnBuscar);
		
		JPanel panel_resultados = new JPanel();
		panel_resultados.setBounds(404, 60, 452, 583);
		frmBusquedaDeMail.getContentPane().add(panel_resultados);
		panel_resultados.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 452, 583);
		panel_resultados.add(scrollPane);
		
		table_resultado = new JTable();
		scrollPane.setViewportView(table_resultado);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 846, 45);
		frmBusquedaDeMail.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_titulo = new JLabel("Busqueda de mail por keyword");
		lblNewLabel_titulo.setForeground(Color.DARK_GRAY);
		lblNewLabel_titulo.setFont(new Font("Segoe UI Emoji", Font.BOLD, 18));
		panel.add(lblNewLabel_titulo);
	}

}
