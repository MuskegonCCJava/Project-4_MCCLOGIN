import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class MaxLengthTextDocument extends PlainDocument{
	
	public static int maxChars;
	
	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException 
	{
		try
		{
			if(str == null)
			{
				return;
			}
				if(str != null && (getLength() + str.length() <= maxChars))
				{
					super.insertString(offs, str, a);
				}
			
		} catch(BadLocationException e)
			{
				e.printStackTrace();
			}
	}
	
	public void setMaxChars(int maxChars)
	{
		MaxLengthTextDocument.maxChars = maxChars;
	}
	
	public int getMaxChars()
	{
		return maxChars;
	}
}
