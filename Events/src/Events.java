import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Events extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Events frame = new Events();
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
	public Events() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPulsar = new JButton("Enviar");
		btnPulsar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnPulsar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			}
		});
		btnPulsar.setBounds(248, 16, 75, 28);
		contentPane.add(btnPulsar);
		
		//Campo de texto donde el usuario escribe un texto que se mostrará en una ventana
		textField = new JTextField( "Escriba el texto aqui" );
		textField.setBounds(10, 16, 228, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// registra los manejadores de eventos
		  ManejadorCampoTexto manejadorT = new ManejadorCampoTexto();
		  textField.addActionListener( manejadorT );	 
		 
	
	}//Fin constructor eventos

	// Esta es una clase interna privada para el manejo de eventos del campo de texto
	 private class ManejadorCampoTexto implements ActionListener
	 {
	 // procesa los eventos de campo de texto
	 public void actionPerformed( ActionEvent evento )
	 {
	 String cadenaTexto = ""; // declara la cadena a mostrar
	//Si se pulsa Intro en el objeto JTextField textField
	  if ( evento.getSource() == textField)
		  cadenaTexto = String.format( "Tu mensaje de texto: %s",
	  evento.getActionCommand() );
	// muestra el contenido del objeto JTextField
	   JOptionPane.showMessageDialog( null, cadenaTexto );
	 
	 }
  }
}
	 
