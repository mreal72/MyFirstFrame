package fr.mreal.MyfirstFrame;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8424931871184260285L;

	public MyFrame() {
	
		super ("Test de fen�tre");
		this.setSize( 300,200 );
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
	}


}
