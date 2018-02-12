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
		
		this.add(p1, "1"); //p1 패널을 첫 번째 카드에 넣겠다.
		this.add(p2, "2");
		this.add(p3, "3");
		this.add(p4, "4");
	}
	
	public void next() {
		for(int i=0 ; i< 3 ; i++) { //카드가 네 장이니까 변화는 세 번 일어나게 된다 !
			try {
				Thread.sleep( 2000 );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//card.next( this ); // card의 부모 Component를 넣어주면 된다. 근데 card가 Frame을 상속받으므로 this를 써도 된다.
			//card.previous(this);
			card.show(this, "3");
		}
	}
	public static void main(String[] args) {
		CardLayoutEx c = new CardLayoutEx();
		c.setBounds( 300, 300, 300, 200 ); // 첫 두 인자는 화면이 표시될 좌표를 표시하고 두 인자는 가로와 세로를 설정하는 인자이다.
		c.setVisible(true);
		c.next();
	}
}
