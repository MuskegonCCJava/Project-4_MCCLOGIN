/* MCC_Login_Panel.java created by Brandon Vandermey 03/03/2015 */

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.*;

public class MCC_Login_Panel extends JPanel {
	
	private JLabel Firstname_Label; 
	private JLabel Lastname_Label; 
	private JLabel studentNumber_Label; 
	private JLabel username_Label; 
	private JLabel password_Label; 
	
	private JTextField Firstname_TField;
	private JTextField Lastname_TField;
	private JTextField studentNumber_TField;
	private JTextField username_TField;
	private JTextField password_TField;
	
	private JButton submit_Button; 

	public MCC_Login_Panel()
	{
		this.setLayout(null);
		this.setBackground(Color.yellow);
		
		// The Labels are created and positioned 
		Firstname_Label = new JLabel("First Name:");
		Firstname_Label.setBounds(100,90,100,15);
		
		Lastname_Label = new JLabel("Last Name:");
		Lastname_Label.setBounds(101,130,100,15);

		studentNumber_Label = new JLabel("Student Number:");
		studentNumber_Label.setBounds(70,170,100,15);
		
		username_Label = new JLabel("Username:");
		Rectangle userName_Bounds = new Rectangle(100,300,100,15); // This is another way to add bounds for later programs 
		username_Label.setBounds(userName_Bounds);

		password_Label = new JLabel("Password:");
		password_Label.setBounds(100,340,100,15);
		
		
		// The TextFields are created and positioned 
		Firstname_TField = new JTextField();
		Firstname_TField.setBounds(185,88,100,20);
		
		Lastname_TField = new JTextField();
		Lastname_TField.setBounds(185,128,100,20);

		studentNumber_TField = new JTextField();
		studentNumber_TField.setBounds(185,168,100,20);

		username_TField = new JTextField();
		username_TField.setBounds(185,300,100,20);

		password_TField = new JTextField();
		password_TField.setBounds(185,338,100,20);
		
		submit_Button = new JButton("Submit");
		submit_Button.setBackground(Color.decode("#0066FF"));
		submit_Button.setBounds(205,200,80,30);
		
		add(Firstname_Label);
		add(Lastname_Label);
		add(studentNumber_Label);
		add(username_Label);
		add(password_Label);

		add(Firstname_TField);
		add(Lastname_TField);
		add(studentNumber_TField);
		add(username_TField);
		add(password_TField);
		
		add(submit_Button);


		
		
	}
	
}
