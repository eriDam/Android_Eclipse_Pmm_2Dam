package com.example.MouseListVsAdap;
/**  
 * Probamos el Listener, 
 * Utilizamos los Listeners como un manejador, una clase que está escuchando hasta que se produzca un evento, pej.: onMouseOn, onMoussePRessed ect...
 * */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleMouseListener extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleMouseListener frame = new ExampleMouseListener();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Implementamos Listener sobre el propio panel
	 */
	public ExampleMouseListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/** Añadimos el addmouseListener que es una funcion de JFrame*/
		addMouseListener (new EscucharMouse());
		
	}
	
		/**
		 * Implementar significa que tenemos que definir todos los métodos aunque no realicen nada
		 * */
		public class EscucharMouse implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("Has hecho click con el ratón");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				System.out.println("Ratón posicionado dentro del panel");
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
				/** Invoked when the mouse exits a component. */
				System.out.println("Ratón posicionado fuera del panel");
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				System.out.println("Ratón presionado");
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Ratón liberado");
				
			}
		 
		}
	}


