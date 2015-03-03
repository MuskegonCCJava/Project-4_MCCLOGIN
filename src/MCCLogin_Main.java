/*MCCLogin_Main by Kyle Wolff and Brandon VanderMey 3/2/2015*/

import java.awt.BorderLayout;

import javax.swing.*;


public class MCCLogin_Main extends JFrame {
	// Extends JFrame is essentially making the Main file a JFrame 

	public static void main(String[] args) {
		
		MCCLogin_Main frame = new MCCLogin_Main();
		frame.setVisible(true);

	}
	
	public MCCLogin_Main(){
		
		setTitle("MCC Username and Password");
		setResizable(false);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
	}

}
