package Layout;

import java.awt.Button;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;

public class GridLayoutEx extends Frame{
	
	Button btn1, btn2, btn3, btn4, btn5;
	
	public GridLayoutEx() {
		super("GridLayoutEx");
		GridLayout gl = new GridLayout( 3, 2, 10, 10 ); // 3행 2열 h 10 v 10
		setLayout(gl);
		setSize(600, 400);
		
		btn1 = new Button("btn1"); add(btn1);
		btn2 = new Button("btn2");add(btn2);
		btn3 = new Button("btn3");add(btn3);
		btn4 = new Button("btn4");add(btn4);
		btn5 = new Button("btn5");add(btn5);
		setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
	}
	
	
	public Insets getInsets() {
		Insets is = new Insets(30, 30, 30, 30); //Insets 는 여백을 나타내는 형식이다
		return is;
	}
	public static void main(String[] args) {
		GridLayoutEx g = new GridLayoutEx();
		g.setVisible(true);
	}
}
