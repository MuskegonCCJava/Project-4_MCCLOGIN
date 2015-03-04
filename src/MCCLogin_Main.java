//	MCCLogin_Main.java by Kyle Wolff and Brandon VanderMey on 3/3/2015

import java.awt.BorderLayout;

import javax.swing.*;


public class MCCLogin_Main extends JFrame {
	// Extends JFrame is essentially making the Main file a JFrame 

	public static void main(String[] args) {
		
		MCCLogin_Main frame = new MCCLogin_Main();
		frame.setVisible(true);

	}
	
	public MCCLogin_Main(){
		
		MCC_Login_Panel panel = new MCC_Login_Panel(); // Created the object for the panel 
		
		setTitle("MCC Username and Password");
		setResizable(false);
		setSize(620,470);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		add(panel, BorderLayout.CENTER); 
		// Since the BorderLayout has 5 different areas of positioning North, South, East, West, Center
		// We will place the panel in the center since we will be having a header panel 
		// When you use add() , this is adding the panel to the frame since this is the constructor for the frame
		
	}

}
