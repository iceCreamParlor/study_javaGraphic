package Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowEx extends Frame{
	//Button bt1, bt2, bt3, bt4, bt5;
	
	Button btn[];
	public FlowEx() {
		super("FlowLayoutEx");
		this.setSize(400, 600);
		
		FlowLayout f = new FlowLayout(FlowLayout.RIGHT);
		setLayout(f);
		
//		bt1 = new Button("Btn1"); add(bt1);
//		bt2 = new Button("Btn2"); add(bt2);
//		bt3 = new Button("Btn3"); add(bt3);
//		bt4 = new Button("Btn4"); add(bt4);
//		bt5 = new Button("Btn5"); add(bt5);
		btn = new Button[5];
		for(int i=0 ; i< btn.length; i++) {
			btn[i] = new Button("Btn"+ (i+1));
			this.add( btn[i] );
		}
	}
	public static void main(String[] args) {
		FlowEx fe = new FlowEx();
		fe.setVisible(true);
	}
}
