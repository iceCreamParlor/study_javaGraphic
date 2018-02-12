package Component;

import java.awt.*;

public class FrameEx2 extends Frame{
	Button btn;
	TextField tf1, tf2, tf3, tf4;
	TextArea ta1, ta2;
	Checkbox ch1, ch2, ch3, ch4;
	CheckboxGroup cg1;
	Label lab1, lab2, lab3;
	List lst;
	Choice cho;
	
	public FrameEx2(){
		super("������Ʈ �׽�Ʈ");
		setSize( 600, 300 );
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setLocation(screenSize.width/2 - 150, screenSize.height/2 -150);
		setLayout(new FlowLayout()); // ��ư�� ����� ���� ������ �� �ְ� ��
		this.setBackground(new Color(100, 0, 0)); //RGB ���� ������ �Է��ؾ� �Ѵ�.
		
		btn = new Button("check");
		btn.setSize(100, 50);
		btn.setBackground(Color.yellow);
		btn.setForeground(Color.red);
		
		btn.setLocation(110, 125);
		this.add(btn);
		
		tf1 = new TextField();
		this.add(tf1);
		tf2 = new TextField(20);
		this.add(tf2);
		tf4 = new TextField("�ȳ��ϼ��� �ȳ��ϼ���!!");
		this.add(tf4);
		// TextArea(String text, int rows, int columns, int scrollbars)
		ta1 = new TextArea("������ �Է��ϼ���", 10, 30, TextArea.SCROLLBARS_NONE);
		add(ta1);
		
		ch1 = new Checkbox("�");
		add(ch1);
		
		cg1 = new CheckboxGroup();
		ch3 = new Checkbox("male", false, cg1);
		ch4 = new Checkbox("female", false, cg1);
		add(ch3);add(ch4);
		
		lab1 = new Label("name"); add(lab1);
		lab1.setBackground(Color.cyan);
		lab2 = new Label("phone no"); add(lab2);
		lab2.setBackground(Color.gray);
		lab3 = new Label("sex"); add(lab3);
		lab3.setBackground(Color.blue);
		
		lst = new List(3, false); //true �̸�, ���� ������ ����������.
		lst.add("kia");
		lst.add("doosan");
		lst.add("hanwha");
		add(lst);
		
		cho = new Choice(); add(cho);
		cho.add("mon");cho.add("tue");cho.add("wed");
	}
	
	public static void main( String[] args ) {
		FrameEx2 f = new FrameEx2();
		f.setVisible(true);

	}
}