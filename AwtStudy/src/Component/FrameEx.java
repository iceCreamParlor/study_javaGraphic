package Component;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameEx {
	public static void main(String[] args) {
		Frame f = new Frame("test");
		f.setSize( 300, 300 );
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		
		//System.out.println(screenSize);
		
		f.setLocation(screenSize.width/2 - 150, screenSize.height/2 -150);
		
		f.setVisible(true);
	}
}
