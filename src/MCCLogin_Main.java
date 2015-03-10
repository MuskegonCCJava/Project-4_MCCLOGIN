//	MCCLogin_Main.java by Kyle Wolff and Brandon VanderMey on 3/3/2015

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.URISyntaxException;
import java.text.ParseException;

import javax.swing.*;


public class MCCLogin_Main extends JFrame {
	// Extends JFrame is essentially making the Main file a JFrame 
	public static int width = 620;
	public static int height = 440;
	// This is a comment

	public static void main(String[] args) throws ParseException, URISyntaxException {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					
					MCCLogin_Main frame = new MCCLogin_Main();
					frame.setVisible(true);
					
					} catch (ParseException e) {
					
						e.printStackTrace();
				
					} catch (URISyntaxException e) {
					
						e.printStackTrace();
				
					}
				}
			});
		}
	
	public MCCLogin_Main() throws ParseException, URISyntaxException{
		
		MCC_Login_Panel panel = new MCC_Login_Panel(); // Created the object for the panel 
		
		
		
		setTitle("MCC Username and Password");
		setResizable(false);
		setSize(width,height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		add(panel, BorderLayout.CENTER); 
		// Since the BorderLayout has 5 different areas of positioning North, South, East, West, Center
		// We will place the panel in the center since we will be having a header panel 
		// When you use add() , this is adding the panel to the frame since this is the constructor for the frame
		
		getRootPane().setDefaultButton(MCC_Login_Panel.submit_Button); // This will enable the Enter key to work with the button
	}

}
