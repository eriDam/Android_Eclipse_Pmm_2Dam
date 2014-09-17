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
	private JButton btnEnviar;

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
		setBounds(100, 100, 462, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		//Campo de texto donde el usuario escribe un texto que se mostrará en una ventana
		textField = new JTextField( "Escriba el texto aqui y pulsa ENTER para probar" );
		textField.setBounds(10, 16, 281, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		// registra los manejadores de eventos del campo de texto
		  ManejadorCampoTexto manejadorT = new ManejadorCampoTexto();
		  textField.addActionListener( manejadorT );	 
		
		  
		  //Boton enviar
		  JButton btnEnviar = new JButton("Pulsar");
		 
		  //Registra los manejadores de eventos
		  ManejadorEventosBot manejadorB = new ManejadorEventosBot();
		  
		  
		  btnEnviar.setBounds(361, 16, 75, 28);
			contentPane.add(btnEnviar);
	
			btnEnviar.addActionListener(manejadorB);
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
	   //CLASE interna privada para el manejador de eventos del boton
	   private class ManejadorEventosBot implements ActionListener
	   {
		   //maneja eventos de botón
		   public void actionPerformed (ActionEvent eventoB){
			   JOptionPane.showMessageDialog( Events.this, String.format("Has presionado el boton.\n Hoy vas a tener un feliz día \n           "
			   		+ "               :)", eventoB) ); 
		   
	  
	 }
  }
}
	 
