import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerTest extends JFrame{
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	
	public void MouseListenerTest() {
		this.setTitle("마우스 좌표 출력");
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p.add(l); // 기본 보더 레이아웃 적용
		p.addMouseMotionListener(new MouseMotionListener() { //익명 클래스
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				Integer x= e.getX();
				Integer y = e.getY();
				String str =  "X : "+ x.toString() + " Y : "+ y.toString();
				l.setText(str);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseListenerTest a = new MouseListenerTest();
	}

}
