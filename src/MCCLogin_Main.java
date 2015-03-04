import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.*;

/*MCCLogin_Main by Kyle Wolff 3/2/2015*/


public class MCCLogin_Main extends JFrame {
	// Extends JFrame is essentially making the Main file a JFrame 

	public static void main(String[] args) throws ParseException {
		
		MCCLogin_Main frame = new MCCLogin_Main();
		frame.setVisible(true);

	}
	
	public MCCLogin_Main() throws ParseException{
		
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
		
		getRootPane().setDefaultButton(panel.submit_Button); // This will enable the Enter key to work with the button
	}

}
