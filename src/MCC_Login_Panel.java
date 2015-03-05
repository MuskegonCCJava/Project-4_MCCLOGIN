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
	
	public static JTextField Firstname_TField;
	public static JTextField Lastname_TField;
	public static JTextField studentNumber_TField;
	
	public JButton submit_Button; 
	
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
		Firstname_TField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) 
			{
				KeyListener(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {}
		});
			
		Lastname_TField = new JTextField();
		Lastname_TField.setBounds(185,128,100,20);
		Lastname_TField.addKeyListener(new KeyListener() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				KeyListener(e);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {}
		});

		studentNumber_TField = new JFormattedTextField(new MaskFormatter("#####")); 
		// Limit the field to 5 digits
		// Using this MaskFormatter the Frame and JPanel must throw ParseException when the user tries to go over the alloted amount
		studentNumber_TField.setBounds(237,168,47,20);
		
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
		
		//
		JPanel headerPanel = new JPanel();
		ImageIcon headerIcon = new ImageIcon("Header.png");
		
		int imageWidth = headerIcon.getIconWidth();
		int imageHeight = headerIcon.getIconHeight();
		
		headerPanel.add(new JLabel(headerIcon));
		headerPanel.setBackground(Color.yellow);
		headerPanel.setBounds((MCCLogin_Main.width - imageWidth) / 2, 0, imageWidth, imageHeight);
		//
		
		add(Firstname_Label);
		add(Lastname_Label);
		add(studentNumber_Label);

		add(Firstname_TField);
		add(Lastname_TField);
		add(studentNumber_TField);
		
		add(submit_Button);
		
		add(imagePanel);
		add(headerPanel);
		
		
	}
	
	public void KeyListener(KeyEvent e) 
	{ 
		char i = e.getKeyChar(); 
		
		// This takes the character "i" and explicitly casts it to an integer (UTF-16). 
		int j = (int)i; 
		
		if (e.getKeyChar() != KeyEvent.VK_BACK_SPACE && e.getKeyChar() != KeyEvent.VK_DELETE) 
		{ 
			// 'A' through 'Z' is 65-90. 'a' through 'z' is 97-122. 
			// Reason why there is a gap is because between 90 and 97 are 'Z[\]^_`a'. See where 'Z' ends and 'a' begins? 
			// Pseudo code: If it is NOT an upper or lowercase letter OR a space, then consume that event (meaning nothing will happen). 
			if ( !( ( (j >= 65 && j <= 90 ) || ( j >= 97 && j <= 122) ) || e.getKeyChar() == KeyEvent.VK_SPACE) ) 
			{ 
				Toolkit.getDefaultToolkit().beep(); // This line of code will make the computer beep sound 
				e.consume(); 
			} 
		} 
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
