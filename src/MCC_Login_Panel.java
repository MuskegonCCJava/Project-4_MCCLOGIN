/* MCC_Login_Panel.java created by Brandon Vandermey 03/03/2015 */

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class MCC_Login_Panel extends JPanel {
	
	private JLabel Firstname_Label; 
	private JLabel Lastname_Label; 
	private JLabel studentNumber_Label; 
	
	private JTextField Firstname_TField;
	private JTextField Lastname_TField;
	private JTextField studentNumber_TField;
	
	public JButton submit_Button; 

	public MCC_Login_Panel() throws ParseException
	{
		this.setLayout(null);
		this.setBackground(Color.yellow);
		
		// The Labels are created and positioned 
		Firstname_Label = new JLabel("First Name:");
		Rectangle bounds = new Rectangle(100,90,100,15);
		Firstname_Label.setBounds(bounds);
		
		Lastname_Label = new JLabel("Last Name:");
		Lastname_Label.setBounds(101,130,100,15);

		studentNumber_Label = new JLabel("Student Number:");
		studentNumber_Label.setBounds(100,170,100,15);
		
		// The TextFields are created and positioned 
		Firstname_TField = new JTextField();
		Firstname_TField.setBounds(185,88,100,20);
		Firstname_TField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char i = e.getKeyChar();
				
				if (e.getKeyChar() != KeyEvent.VK_BACK_SPACE && e.getKeyChar() != KeyEvent.VK_DELETE) 
				{
				      // If the key was not a number then discard it (this is a sloppy way to check)
				
				      if (i == '.' || i == ',' || i == '0' || i == '1' || i == '2' || i == '3' || i == '4' ||
				    		 i == '5' || i == '6'|| i == '7' || i == '8'|| i == '9' || e.getKeyChar() == KeyEvent.VK_SPACE)
				      	{
				    	  	Toolkit.getDefaultToolkit().beep(); // This line of code will make the computer beep sound 
				    	  	e.consume();
				      	}
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		
			
		
		Lastname_TField = new JTextField();
		Lastname_TField.setBounds(185,128,100,20);
		Lastname_TField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char i = e.getKeyChar();
				
				if (e.getKeyChar() != KeyEvent.VK_BACK_SPACE && e.getKeyChar() != KeyEvent.VK_DELETE) 
				{
				      // If the key was not a number then discard it (this is a sloppy way to check)
				
				      if (i == '.' || i == ',' || i == '0' || i == '1' || i == '2' || i == '3' || i == '4' ||
				    		 i == '5' || i == '6'|| i == '7' || i == '8'|| i == '9')
				      	{
				    	  	Toolkit.getDefaultToolkit().beep();
				    	  	e.consume();
				      	}
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});

		studentNumber_TField = new JFormattedTextField(new MaskFormatter("#####")); 
		// Limit the field to 5 digits
		// Using this MaskFormatter the Frame and JPanel must throw ParseException when the user tries to go over the alloted amount
		studentNumber_TField.setBounds(237,168,47,20);
		
		submit_Button = new JButton("Submit");
		submit_Button.setBackground(Color.decode("#0066FF"));
		submit_Button.setBounds(204,200,80,30);
		
		// I made a separate panel for the Image. This way it was easier to manipulate 
		JPanel imagePanel = new JPanel();
		ImageIcon MCCimage = new ImageIcon("MCC_Logo.png");
		imagePanel.add(new JLabel(MCCimage)); // The reason we chose a JLabel is because the add method only allows components to be added
		imagePanel.setBackground(Color.yellow); // Set Background just in case the image was not sized correctly
		imagePanel.setBounds(400,250,170,180);
		
		
		
		add(Firstname_Label);
		add(Lastname_Label);
		add(studentNumber_Label);

		add(Firstname_TField);
		add(Lastname_TField);
		add(studentNumber_TField);
		
		add(submit_Button);
		
		add(imagePanel);
		
		
	}
	
}
