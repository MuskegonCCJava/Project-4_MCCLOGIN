import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;


public class Submit implements ActionListener
{
	
	static MCCLogin_Client_Side_Services service;
	String fname;
	String lname;
	String studentnum;

	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if(source == MCC_Login_Panel.submit_Button)
		{
			fname = MCC_Login_Panel.Firstname_TField.getText();
			lname = MCC_Login_Panel.Lastname_TField.getText();
			studentnum = MCC_Login_Panel.studentNumber_TField.getText();
			
			try {
				
				if((!(fname.isEmpty() || lname.isEmpty() || studentnum.length() < MaxLengthTextDocument.maxChars)))
				{	
					service = new MCCLogin_Client_Side_Services(fname, lname, studentnum);
					StringBuilder serviceMessage = service.getMessage();
					String message = String.valueOf(serviceMessage);
					MCC_Login_Panel.Message.setText(message);
					
					MCC_Login_Panel.Message.setBounds(20,320,MCC_Login_Panel.Message.getPreferredSize().width,
													         MCC_Login_Panel.Message.getPreferredSize().height);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please fill in all the fields", "Error", JOptionPane.CLOSED_OPTION);
				}
				
				
			} catch (URISyntaxException e1) 
				{
				
					e1.printStackTrace();
				}
		}
	}
}
