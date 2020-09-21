import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class Factorizacion extends JFrame {

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
	public Factorizacion() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 871, 522);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnFactorComn = new JTextPane();
		txtpnFactorComn.setEditable(false);
		txtpnFactorComn.setForeground(Color.WHITE);
		txtpnFactorComn.setBackground(SystemColor.textHighlight);
		txtpnFactorComn.setFont(new Font("Segoe UI Symbol", Font.ITALIC, 12));
		txtpnFactorComn.setText("1) Factor Com\u00FAn. Se dice que un polinomio tiene factor com\u00FAn cuando \r\nuna misma cantidad, ya sea n\u00FAmero o letra, se encuentra en todos los \r\nt\u00E9rminos del polinomio.\r\n\r\n2) Factor Com\u00FAn por Agrupaci\u00F3n de T\u00E9rminos. Se llama factor com\u00FAn por \r\nagrupaci\u00F3n de t\u00E9rminos, si los t\u00E9rminos de un polinomio pueden reunirse\r\n en grupos de t\u00E9rminos con un factor com\u00FAn diferente en cada grupo. \r\nCuando pueden reunirse en grupos de igual n\u00FAmero de t\u00E9rminos se le saca\r\n en cada uno de ellos el factor com\u00FAn.\r\n\r\n3) Diferencia de Cuadrados. Se le llama diferencia de cuadrados\r\n al binomio conformado por dos t\u00E9rminos a los que se les \r\npuede sacar ra\u00EDz cuadrada exacta.\r\n\r\n4) Trinomio Cuadrado Perfecto. Se llama trinomio cuadrado perfecto \r\nal trinomio (polinomio de tres t\u00E9rminos) tal que, dos de sus t\u00E9rminos\r\n son cuadrados perfectos y el otro t\u00E9rmino es el doble producto de \r\nlas bases de esos cuadrados.\r\n\r\n5) Suma o Diferencia de Cubos. La suma de dos cubos perfectos se \r\ndescompone en dos factores, el primero es la suma de sus ra\u00EDces \r\nc\u00FAbicas, y el segundo se compone de el cuadrado de la primera \r\nra\u00EDz menos el producto de ambas ra\u00EDces m\u00E1s el cuadrado de la \r\nsegunda ra\u00EDz.");
		txtpnFactorComn.setBounds(10, 11, 419, 433);
		contentPane.add(txtpnFactorComn);
		
		JTextPane txtpnEjemplosIFactor = new JTextPane();
		txtpnEjemplosIFactor.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		txtpnEjemplosIFactor.setText("Ejemplos:\r\ni. Factor Com\u00FAn:\r\n\r\n10x\u00B2 - 5x +15x\u00B3 =  5x* ( 2x - 1 + 3x\u00B2\t)\r\n\r\nii. Factor Com\u00FAn por Agrupaci\u00F3n de T\u00E9rminos\r\n\r\n2y2 \u2013 6y + 5y + 15\r\n2y2 \u2013 6y + 5y + 15 = (2y2 \u2013 6y) + (5y - 15)\r\n2y(y - 3) + 5(y - 3)\r\n(y - 3)(2y + 5)\r\n\r\niii. Diferencia de Cuadrados.\r\n\r\n\t(x - 3)\u00B7(x + 3).\r\n\t(x - 3)\u00B7(x + 3) = x**2 - 3**2 = x2 - 9\r\n\r\niv.Trinomio Cuadrado Perfecto.\r\n\t\r\nx2 \u2212 2x + 1 =\r\n (x \u2212 1)2\r\n\r\nv. Diferencia de Cubos\r\n\r\na3 - b3 = (a - b)\u00B7(a2 + ab + b2)= a - b)\u00B7(a2 + ab + b2) =\r\n= a3 + a2b + ab2 - ba2 - ab2 - b3 = a3 - b3\r\n");
		txtpnEjemplosIFactor.setBackground(SystemColor.textHighlight);
		txtpnEjemplosIFactor.setForeground(Color.WHITE);
		txtpnEjemplosIFactor.setEditable(false);
		txtpnEjemplosIFactor.setBounds(439, 11, 406, 433);
		contentPane.add(txtpnEjemplosIFactor);
		
		JButton btnEjercicios = new JButton("Ejercicios Relacionados");
		btnEjercicios.setBounds(565, 444, 159, 34);
		contentPane.add(btnEjercicios);
	}
}
