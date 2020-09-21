import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Matematica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Matematica() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 594, 471);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Temas de Matematica ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.YELLOW));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Destructor X\\Downloads\\pngegg (1).png"));
		lblNewLabel.setBounds(10, 29, 209, 392);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(229, 11, 339, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFactorizacion = new JLabel("Factorizaci\u00F3n");
		lblFactorizacion.setForeground(Color.BLACK);
		lblFactorizacion.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblFactorizacion.setBounds(27, 11, 122, 39);
		panel.add(lblFactorizacion);
		
		Button btnVer = new Button("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Factorizacion fra=new Factorizacion();
				fra.setVisible(true);
				
				
			}
		});
		btnVer.setBounds(48, 56, 70, 22);
		panel.add(btnVer);
		
		JLabel lbl = new JLabel("Intervalos");
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lbl.setBounds(205, 11, 95, 39);
		panel.add(lbl);
		
		Button btnVerIntervalos = new Button("Ver");
		btnVerIntervalos.setBounds(219, 56, 70, 22);
		panel.add(btnVerIntervalos);
		
		JLabel lblDesigualdades = new JLabel("Desigualdades");
		lblDesigualdades.setForeground(Color.BLACK);
		lblDesigualdades.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblDesigualdades.setBounds(27, 84, 134, 39);
		panel.add(lblDesigualdades);
		
		Button btnVerDesigualdades = new Button("Ver");
		btnVerDesigualdades.setBounds(48, 129, 70, 22);
		panel.add(btnVerDesigualdades);
		
		JLabel lblDominioYRango = new JLabel("Dominio y Rango");
		lblDominioYRango.setForeground(Color.BLACK);
		lblDominioYRango.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblDominioYRango.setBounds(171, 90, 158, 27);
		panel.add(lblDominioYRango);
		
		Button btnVerDominioyRango = new Button("Ver");
		btnVerDominioyRango.setBounds(219, 129, 70, 22);
		panel.add(btnVerDominioyRango);
		
		JLabel lblFuncionesLineales = new JLabel("Funciones Lineales");
		lblFuncionesLineales.setForeground(Color.BLACK);
		lblFuncionesLineales.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 20));
		lblFuncionesLineales.setBounds(10, 157, 169, 39);
		panel.add(lblFuncionesLineales);
		
		Button btnVerFuncionesLineales = new Button("Ver");
		btnVerFuncionesLineales.setBounds(48, 202, 70, 22);
		panel.add(btnVerFuncionesLineales);
	}
}
