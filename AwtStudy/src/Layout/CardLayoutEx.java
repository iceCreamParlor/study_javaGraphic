package Layout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class CardLayoutEx extends Frame{
	
	Button btn1, btn2, btn3, btn4, btn5;
	CardLayout card;
	Panel p1, p2, p3, p4;
	
	CardLayoutEx(){
		super("CardLayoutEx");
		card = new CardLayout( );
	
		
		setLayout( card );
		
		p1 = new Panel();
		p1.setBackground(Color.blue);
		p1.add( new Label("card1") );
		
		p2 = new Panel();
		p2.setBackground(Color.cyan);
		p2.add( new Label("card2") );
		
		p3 = new Panel();
		p3.setBackground(Color.BLACK);
		p3.add( new Label("card3") );
		
		p4 = new Panel();
		p4.setBackground(Color.orange);
		p4.add( new Label("card4") );
		
		this.add(p1, "1"); //p1 �г��� ù ��° ī�忡 �ְڴ�.
		this.add(p2, "2");
		this.add(p3, "3");
		this.add(p4, "4");
	}
	
	public void next() {
		for(int i=0 ; i< 3 ; i++) { //ī�尡 �� ���̴ϱ� ��ȭ�� �� �� �Ͼ�� �ȴ� !
			try {
				Thread.sleep( 2000 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//card.next( this ); // card�� �θ� Component�� �־��ָ� �ȴ�. �ٵ� card�� Frame�� ��ӹ����Ƿ� this�� �ᵵ �ȴ�.
			//card.previous(this);
			card.show(this, "3");
		}
	}
	public static void main(String[] args) {
		CardLayoutEx c = new CardLayoutEx();
		c.setBounds( 300, 300, 300, 200 ); // ù �� ���ڴ� ȭ���� ǥ�õ� ��ǥ�� ǥ���ϰ� �� ���ڴ� ���ο� ���θ� �����ϴ� �����̴�.
		c.setVisible(true);
		c.next();
	}
}
