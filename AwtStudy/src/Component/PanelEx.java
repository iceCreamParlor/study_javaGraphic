package Component;

import java.awt.*;

public class PanelEx extends Frame{
	Panel p1, p2;
	Label lba, lba2;
	TextField tf, tf2;
	Button btn;
	
	public PanelEx() {
		super ("panel test");
		setSize(400, 500);
		setLayout(new FlowLayout());
		
		
		p1 = new Panel(); add(p1);
		p1.setBackground(Color.cyan);
		lba = new Label("ID");
		p1.add(lba);
		tf = new TextField(10);
		p1.add(tf);
		btn = new Button("OK");
		p1.add(btn);
		
		
		p2 = new Panel();
		add(p2);
		lba2 = new Label("비밀번호");
		p2.add(lba2);
		tf2 = new TextField(20);
		p2.add(tf2);
		p2.setBackground(Color.yellow);
	}
	public static void main(String[] args) {
		PanelEx f = new PanelEx();
		f.setVisible(true);
	}
}
