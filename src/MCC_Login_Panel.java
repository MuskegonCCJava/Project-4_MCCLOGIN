/* MCC_Login_Panel.java created by Brandon Vandermey 03/03/2015 */

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.*;

public class MCC_Login_Panel extends JPanel {
	
	private JLabel Firstname_Label; 
	private JLabel Lastname_Label; 
	private JLabel studentNumber_Label; 
	
	private JTextField Firstname_TField;
	private JTextField Lastname_TField;
	private JTextField studentNumber_TField;
	
	private JButton submit_Button; 

	public MCC_Login_Panel()
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
		studentNumber_Label.setBounds(70,170,100,15);
		
		// The TextFields are created and positioned 
		Firstname_TField = new JTextField();
		Firstname_TField.setBounds(185,88,100,20);
		
		Lastname_TField = new JTextField();
		Lastname_TField.setBounds(185,128,100,20);

		studentNumber_TField = new JTextField();
		studentNumber_TField.setBounds(185,168,100,20);

		
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
