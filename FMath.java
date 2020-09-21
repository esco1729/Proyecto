import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FMath extends JFrame {

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
	public FMath() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFMath = new JLabel("F'Math");
		lblFMath.setForeground(Color.WHITE);
		lblFMath.setFont(new Font("Segoe UI", Font.ITALIC, 50));
		lblFMath.setBounds(66, 48, 154, 47);
		contentPane.add(lblFMath);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Destructor X\\Downloads\\pngocean.com (2).png"));
		lblNewLabel.setBounds(87, 106, 175, 138);
		contentPane.add(lblNewLabel);
		
		Button btnMatematica = new Button("Matematica");
		btnMatematica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Matematica fa=new Matematica();
				fa.setVisible(true);
				
			}
		});
		btnMatematica.setForeground(Color.WHITE);
		btnMatematica.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		btnMatematica.setBackground(SystemColor.textHighlight);
		btnMatematica.setBounds(10, 250, 127, 47);
		contentPane.add(btnMatematica);
		
		Button btnFisica = new Button("Fisica");
		btnFisica.setForeground(Color.WHITE);
		btnFisica.setBackground(SystemColor.textHighlight);
		btnFisica.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 15));
		btnFisica.setBounds(155, 250, 119, 47);
		contentPane.add(btnFisica);
	}

}
