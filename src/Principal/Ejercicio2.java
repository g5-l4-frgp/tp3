package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.border.TitledBorder;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNota = new JLabel("Nota 1");
		lblNota.setBounds(44, 26, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2");
		lblNota_1.setBounds(44, 51, 46, 14);
		contentPane.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3");
		lblNota_2.setBounds(44, 76, 46, 14);
		contentPane.add(lblNota_2);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(44, 160, 46, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(44, 194, 46, 14);
		contentPane.add(lblCondicion);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(117, 23, 165, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(117, 48, 165, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(117, 73, 165, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(117, 157, 165, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(117, 191, 165, 20);
		contentPane.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JComboBox cboTPS = new JComboBox();
		cboTPS.setBounds(117, 104, 165, 20);
		cboTPS.addItem("Aprobado");
		cboTPS.addItem("Desaprobado");
		contentPane.add(cboTPS);
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(cboTPS.getSelectedItem().equals("Desaprobado"))
				{
					txtCondicion.setText("Libre");
				}
			else if(Integer.parseInt(txtNota1.getText())<6||Integer.parseInt(txtNota2.getText())<6||Integer.parseInt(txtNota3.getText())<6)
				{
					txtCondicion.setText("Libre");
					
				}
			else if(Integer.parseInt(txtNota1.getText())>=8 && Integer.parseInt(txtNota2.getText())>=8 && Integer.parseInt(txtNota3.getText())>=8 && cboTPS.getSelectedItem().equals("Aprobado"))
			{
				txtCondicion.setText("Promocionado");
			}
			else {
				txtCondicion.setText("Regular");
			}
				float promedio= (Float.parseFloat(txtNota1.getText())+Float.parseFloat(txtNota2.getText())+Float.parseFloat(txtNota3.getText()))/3;
				String prom= String.valueOf(promedio);
				txtPromedio.setText(prom);
			}
		});
		btnCalcular.setBounds(335, 22, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCondicion.setText("");
				txtPromedio.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");

			}
		});
		btnNuevo.setBounds(335, 51, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnSalir.setBounds(335, 85, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblTpS = new JLabel("TP S");
		lblTpS.setBounds(44, 101, 46, 14);
		contentPane.add(lblTpS);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new TitledBorder(null, "Notas del estudiante:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox.setBounds(23, 0, 274, 138);
		contentPane.add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBorder(new TitledBorder(null, "Notas del estudiante:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox_1.setBounds(23, 135, 274, 104);
		contentPane.add(horizontalBox_1);
		
		
	}
}
