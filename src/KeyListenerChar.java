import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

	public class KeyListenerChar implements KeyListener {
		
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		char i = e.getKeyChar(); 
		
		// This takes the character "i" and explicitly casts it to an integer (UTF-16). 
		int j = (int)i; 
		
		
		if (e.getKeyChar() != KeyEvent.VK_BACK_SPACE && e.getKeyChar() != KeyEvent.VK_DELETE) 
		{ 
			// 'A' through 'Z' is 65-90. 'a' through 'z' is 97-122. 
			// Reason why there is a gap is because between 90 and 97 are 'Z[\]^_`a'. See where 'Z' ends and 'a' begins? 
			// Pseudo code: If it is NOT an upper or lowercase letter OR a space, then consume that event (meaning nothing will happen). 
			if ( !( ( (j >= 65 && j <= 90 ) || ( j >= 97 && j <= 122) ) || e.getKeyChar() == KeyEvent.VK_SPACE || e.getKeyChar() == KeyEvent.VK_ENTER) ) 
			{ 
				Toolkit.getDefaultToolkit().beep(); // This line of code will make the computer beep sound 
				e.consume(); 
			} 
		}
		
	}

}
