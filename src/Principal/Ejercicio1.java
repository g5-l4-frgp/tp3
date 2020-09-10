package Principal;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.xml.bind.Validator;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio1 extends JFrame{
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;
	public Ejercicio1() {
		setTitle("Contactos");
		getContentPane().setLayout(null);
		setSize(400,400);
		setLocation(550, 150);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombre.setBounds(25, 50, 66, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblApellido.setBounds(25, 81, 66, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefono.setBounds(25, 114, 66, 14);
		getContentPane().add(lblTelefono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaNac.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFechaNac.setBounds(25, 153, 66, 14);
		getContentPane().add(lblFechaNac);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron:");
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDatos.setBounds(25, 236, 399, 14);
		getContentPane().add(lblDatos);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(147, 48, 157, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(147, 79, 157, 20);
		getContentPane().add(txtApellido);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(147, 112, 157, 20);
		getContentPane().add(txtTelefono);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBounds(147, 151, 157, 20);
		getContentPane().add(txtFecha);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Validartexto()==true)
				{
					
					lblDatos.setText(lblDatos.getText()+ " "+ txtNombre.getText()+" "+txtApellido.getText()+" "+txtTelefono.getText()+" "+txtFecha.getText());
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFecha.setText("");
					
				}
			}

			private boolean Validartexto() {
				// TODO Auto-generated method stub
				 boolean cont = true;
				
				if(txtNombre.getText().equals(""))
				{
					txtNombre.setBackground(Color.red);
					cont=false;
				}else {
					txtNombre.setBackground(Color.white);
					
				}
				if(txtApellido.getText().equals(""))
				{
					txtApellido.setBackground(Color.red);
					cont=false;
					
				}else {
					txtApellido.setBackground(Color.white);
				}
				if(txtTelefono.getText().equals(""))
				{
					txtTelefono.setBackground(Color.red);
					cont=false;
					
				}else {
					txtTelefono.setBackground(Color.white);
				}
				if(txtFecha.getText().equals(""))
				{
					txtFecha.setBackground(Color.red);
					cont=false;
					
				}else {
					txtFecha.setBackground(Color.white);
				}
				return cont;
				
				
			}
		});
		btnMostrar.setBounds(243, 182, 89, 23);
		getContentPane().add(btnMostrar);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((txtNombre == null) ? 0 : txtNombre.hashCode());
		result = prime * result + ((txtApellido == null) ? 0 : txtApellido.hashCode());
		result = prime * result + ((txtFecha == null) ? 0 : txtFecha.hashCode());
		result = prime * result + ((txtTelefono == null) ? 0 : txtTelefono.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejercicio1 other = (Ejercicio1) obj;
		if (txtNombre == null) {
			if (other.txtNombre != null)
				return false;
		} else if (!txtNombre.equals(other.txtNombre))
			return false;
		if (txtApellido == null) {
			if (other.txtApellido != null)
				return false;
		} else if (!txtApellido.equals(other.txtApellido))
			return false;
		if (txtFecha == null) {
			if (other.txtFecha != null)
				return false;
		} else if (!txtFecha.equals(other.txtFecha))
			return false;
		if (txtTelefono == null) {
			if (other.txtTelefono != null)
				return false;
		} else if (!txtTelefono.equals(other.txtTelefono))
			return false;
		return true;
	}
	
}
