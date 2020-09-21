import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class InterfazDeUsuarioContraseña extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private BaseDeDatos inicio;
	private JFrame frmInicio;
	private JPasswordField Contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			InterfazDeUsuarioContraseña frame = new InterfazDeUsuarioContraseña();
			frame.setVisible(true);
				
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public InterfazDeUsuarioContraseña() {
		inicio=new BaseDeDatos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Inicio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblInicioSesion = new JLabel("Iniciar Sesi\u00F3n");
		lblInicioSesion.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 28));
		lblInicioSesion.setBounds(72, 11, 172, 49);
		panel.add(lblInicioSesion);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(159, 84, 105, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario1 = new JLabel("Usuario:");
		lblUsuario1.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		lblUsuario1.setBounds(44, 71, 105, 31);
		panel.add(lblUsuario1);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 24));
		lblContraseña.setBounds(17, 130, 132, 35);
		panel.add(lblContraseña);
		
		Button btnIngresar = new Button("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					if(txtUsuario.getText().equals(inicio.getUsuario()) && Contraseña.getText().equalsIgnoreCase(inicio.getContraseña())) {
						
						FMath window = new FMath();
						window.setVisible(true);
					
						
					}
					else {
						
						JOptionPane.showMessageDialog(null, "Usuario y Contraseña incorrectos...");
						
					}
					
					
				
				
			}
		});
		btnIngresar.setBounds(27, 210, 116, 31);
		panel.add(btnIngresar);
		
		Button btnRegistrarse = new Button("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inicio.setUsuario(txtUsuario.getText());
				inicio.setContraseña(Contraseña.getText());
				
			}
			
		});
		
		
		btnRegistrarse.setBounds(159, 210, 105, 31);
		panel.add(btnRegistrarse);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(159, 143, 105, 20);
		panel.add(Contraseña);
		
		
	}
}
