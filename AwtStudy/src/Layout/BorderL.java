package Layout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Panel;

public class BorderL extends Frame {
	Button btn, btn2, btn3, btn4, btn5;
	Panel p;
	public BorderL() {
		super("BorderLayoutTest");
		this.setSize(200, 300);
		BorderLayout bl = new BorderLayout( 10, 20 );
		setLayout( bl );
		p = new Panel();
		
		
		btn = new Button("btn1");
		btn2 = new Button("btn2");
		btn3= new Button("btn3");
		btn4 = new Button("btn4");
		btn5 = new Button("btn5");
		p.add(btn);
		p.add(btn2);
		p.setBackground(Color.yellow);
		add(p, "North");
		add(btn3, "West");
		add(btn4, "South");
		add(btn5, "Center");
	}
	
	public Insets getInsets() {
		Insets is = new Insets(10,10,20,30); //위 왼쪽 아래 오른쪽 (반시계 방향)
		return is;
	}
	
	public static void main(String[] args) {
		BorderL fb = new BorderL();
		fb.setVisible(true);
	}
}
