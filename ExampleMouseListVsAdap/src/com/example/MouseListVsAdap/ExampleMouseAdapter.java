package com.example.MouseListVsAdap;
/**
 * No es necesario tener todos los métodos implementados, para ello existen los Adapters, 
 * con estos solo se necesita sobreescribir los métodos que se necesiten.
 *  Ya no se  implementa, si no que se extiende (extends)de la clase padre que es el Listener
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.example.MouseListVsAdap.ExampleMouseListener.EscucharMouse;

public class ExampleMouseAdapter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleMouseAdapter frame = new ExampleMouseAdapter();
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
	public ExampleMouseAdapter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/** Añadimos el addmouseListener que es una funcion de JFrame*/
		addMouseListener (new EscucharMouse());
	}
	
	public class EscucharMouse extends MouseAdapter {
			
			public void mouseEntered (MouseEvent e) {
				System.out.println("Ratón dentro del Panel");
			}
			
			public void mouseExited (MouseEvent e) {
				System.out.println("Ratón fuera del Panel");
			}
	}

}
