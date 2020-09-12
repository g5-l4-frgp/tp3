package Principal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


@SuppressWarnings("serial")
public class Ejercicio3 extends JFrame{
	private JTextField textFieldHoras;
	private final ButtonGroup buttonGroupSO = new ButtonGroup();
	private final ButtonGroup buttonGroupEspecialidad = new ButtonGroup();
	public Ejercicio3() {
		setLocation(1500,1500);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 697, 421);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane txtpnElig = new JTextPane();
		txtpnElig.setBackground(SystemColor.control);
		txtpnElig.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnElig.setText("Elije un sistema operativo");
		txtpnElig.setBounds(42, 80, 231, 34);
		getContentPane().add(txtpnElig);
		
		JTextPane txtpnCantidadDeHoras = new JTextPane();
		txtpnCantidadDeHoras.setText("Cantidad de horas en el computador:");
		txtpnCantidadDeHoras.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnCantidadDeHoras.setBackground(SystemColor.menu);
		txtpnCantidadDeHoras.setBounds(42, 291, 311, 34);
		getContentPane().add(txtpnCantidadDeHoras);
		
		JTextPane txtpnElig_1_1 = new JTextPane();
		txtpnElig_1_1.setText("Elije una especialidad");
		txtpnElig_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtpnElig_1_1.setBackground(SystemColor.menu);
		txtpnElig_1_1.setBounds(42, 189, 215, 56);
		getContentPane().add(txtpnElig_1_1);
		
		JRadioButton radioButtonWindows = new JRadioButton("Windows");
		buttonGroupSO.add(radioButtonWindows);
		radioButtonWindows.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButtonWindows.setBounds(294, 84, 103, 21);
		getContentPane().add(radioButtonWindows);
		radioButtonWindows.setActionCommand("Windows");
		
		JRadioButton radioButtonMac = new JRadioButton("Mac");
		buttonGroupSO.add(radioButtonMac);
		radioButtonMac.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButtonMac.setBounds(416, 84, 68, 21);
		getContentPane().add(radioButtonMac);
		radioButtonMac.setActionCommand("Mac");
		
		JRadioButton radioButtonLinux = new JRadioButton("Linux");
		buttonGroupSO.add(radioButtonLinux);
		radioButtonLinux.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButtonLinux.setBounds(503, 84, 103, 21);
		getContentPane().add(radioButtonLinux);
		radioButtonLinux.setActionCommand("Linux");
		
		JCheckBox chckProgramacion = new JCheckBox("Programación");
		buttonGroupEspecialidad.add(chckProgramacion);
		chckProgramacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckProgramacion.setBounds(294, 155, 125, 21);
		getContentPane().add(chckProgramacion);
		chckProgramacion.setActionCommand("Programacion");
		
		JCheckBox chckAdminstracion = new JCheckBox("Administracion");
		buttonGroupEspecialidad.add(chckAdminstracion);
		chckAdminstracion.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckAdminstracion.setBounds(294, 189, 115, 21);
		getContentPane().add(chckAdminstracion);
		chckAdminstracion.setActionCommand("Administracion");
		
		JCheckBox chckDisenio = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		buttonGroupEspecialidad.add(chckDisenio);
		chckDisenio.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckDisenio.setBounds(294, 224, 144, 21);
		getContentPane().add(chckDisenio);
		chckDisenio.setActionCommand("Diseño Gráfico");
		
		textFieldHoras = new JTextField();
		textFieldHoras.setBounds(363, 294, 103, 21);
		getContentPane().add(textFieldHoras);
		textFieldHoras.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String mensaje = buttonGroupSO.getSelection().getActionCommand() + " - " 
						+ buttonGroupEspecialidad.getSelection().getActionCommand() + " - " + textFieldHoras.getText()+" hs";
				buttonGroupEspecialidad.clearSelection();
				buttonGroupSO.clearSelection();
				textFieldHoras.setText("");
				JOptionPane.showMessageDialog(null, mensaje);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(416, 341, 125, 34);
		getContentPane().add(btnNewButton);
	}
}
