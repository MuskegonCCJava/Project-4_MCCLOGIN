/* MCC_Login_Panel.java created by Kyle Wolff and Brandon VanderMey 03/03/2015 */

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.text.MaskFormatter;


public class MCC_Login_Panel extends JPanel {
	
	private JLabel Firstname_Label; 
	private JLabel Lastname_Label; 
	private JLabel studentNumber_Label; 
	public static JLabel Message;
	
	public static JTextField Firstname_TField;
	public static JTextField Lastname_TField;
	public static JTextField studentNumber_TField;
	
	public static JButton submit_Button; 
	
	private MCCLogin_Client_Side_Services service = new MCCLogin_Client_Side_Services();
	
	public MCC_Login_Panel() throws ParseException, URISyntaxException
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
		Firstname_TField.addKeyListener(new KeyListenerChar());
			
		Lastname_TField = new JTextField();
		Lastname_TField.setBounds(185,128,100,20);
		Lastname_TField.addKeyListener(new KeyListenerChar());

		MaxLengthTextDocument max = new MaxLengthTextDocument();
		max.setMaxChars(7); // Limit the field to 7 digits

		studentNumber_TField = new JTextField();
		studentNumber_TField.setDocument(max); // Using set Document this will restrict character length
		studentNumber_TField.addKeyListener(new numberListener());
		studentNumber_TField.setBounds(232,168,53,20);
		
		submit_Button = new JButton("Submit");
		submit_Button.setBackground(Color.decode("#00A3CC"));
		submit_Button.setBounds(204,200,80,30);
		
		//	Add try and catch statements to catch null entries?
		submit_Button.addActionListener(new Submit());
		
		// I made a separate panel for the Image. This way it was easier to manipulate 
		JPanel imagePanel = new JPanel();
		ImageIcon MCCimage = new ImageIcon("MCCWeb.png");
		imagePanel.add(new JLabel(MCCimage)); // The reason we chose a JLabel is because the add method only allows components to be added
		imagePanel.setBackground(Color.yellow); // Set Background just in case the image was not sized correctly
		imagePanel.setBounds(300,100,280,208);
		imagePanel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				openBrowser(service.uri);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				imagePanel.setBackground(Color.yellow);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				imagePanel.setBackground(Color.decode("#00A3CC"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
			
		});
		
		
		JPanel headerPanel = new JPanel();
		ImageIcon headerIcon = new ImageIcon("Header.png");
		
		int imageWidth = headerIcon.getIconWidth();
		int imageHeight = headerIcon.getIconHeight();
		
		headerPanel.add(new JLabel(headerIcon));
		headerPanel.setBackground(Color.yellow);
		headerPanel.setBounds((MCCLogin_Main.width - imageWidth) / 2, 0, imageWidth, imageHeight);
		
		
		Message = new JLabel();
		Message.setBounds(20,320,500,30);
		
		add(Firstname_Label);
		add(Lastname_Label);
		add(studentNumber_Label);
		add(Message);

		add(Firstname_TField);
		add(Lastname_TField);
		add(studentNumber_TField);
		
		add(submit_Button);
		
		add(imagePanel);
		add(headerPanel);
		
		
	}
	
	private static void openBrowser(URI uri) {
	    if (Desktop.isDesktopSupported()) 
	    {
	      try
	      {
	        Desktop.getDesktop().browse(uri);
	      } catch (IOException e) { /* TODO: error handling */ }
	    } else { /* TODO: error handling */ }
	  }
	
}
