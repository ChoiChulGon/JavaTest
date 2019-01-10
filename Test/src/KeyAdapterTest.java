import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyAdapterTest extends JFrame{
	JPanel p = new JPanel();
	JLabel l1= new JLabel();
	JLabel l2= new JLabel();
	
	KeyAdapterTest(){
		this.setTitle("키 입력");
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.setLayout(null);
		l1.setLocation(20, 20);
		l1.setSize(120,15);
		l1.setText("문자 키 : ");
		
		l2.setLocation(20, 50);
		l2.setSize(120,15 );
		l2.setText("기능 키 : ");
		
		p.add(l1);
		p.add(l2);
		p.addKeyListener(new MyKeyListener());
		
		this.add(p);
		p.requestFocus(true); //판넬에 포커스
	}
	
	public class MyKeyListener extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			char cKey = e.getKeyChar();
			
			if(cKey == e.CHAR_UNDEFINED) {//기능키
				String str = "기능 키 : "+ e.getKeyText(e.getKeyCode());
				l2.setText(str);
			}else {
				String str = "문자 키  : "+ cKey;
				l1.setText(str);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyAdapterTest a= new KeyAdapterTest();
	}

}
