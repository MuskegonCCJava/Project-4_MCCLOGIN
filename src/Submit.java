import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Submit implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println((int)'A' + "-" + (int)'Z' + " and " + (int)'a' + "-" + (int)'z');
	
		for (int counter = 65; counter <= 122; counter ++)
		{
			System.out.print(Character.toChars(counter));
		}
	}

}
