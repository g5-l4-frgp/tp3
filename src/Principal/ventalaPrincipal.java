package Principal;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventalaPrincipal extends JFrame {
	public ventalaPrincipal() {
		getContentPane().setLayout(null);
		setSize(400,400);
		setLocation(550, 150);
		
		
		JLabel lblNombreGrupo = new JLabel("GRUPO NRO :5");
		lblNombreGrupo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreGrupo.setBounds(27, 26, 89, 15);
		getContentPane().add(lblNombreGrupo);
		
		JButton btnEjercicio1 = new JButton("Ejercicio1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 ejercicio1=new Ejercicio1();
				ejercicio1.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(122, 58, 108, 23);
		getContentPane().add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Ejercicio2 ejercicio2= new Ejercicio2();
			ejercicio2.setVisible(true);
			
			}
		});
		btnEjercicio2.setBounds(122, 105, 108, 23);
		getContentPane().add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio3");
		btnEjercicio3.setBounds(122, 150, 108, 23);
		getContentPane().add(btnEjercicio3);
	}
	
	

	
}
