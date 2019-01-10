//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class MouseAdapterTest extends JFrame {
//	JPanel p = new JPanel();
//	JLabel l = new JLabel();
//
//	MouseAdapterTest() {
//		this.setTitle("마우스 좌표 클릭");
//		this.setSize(200, 200);
//		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		p.setLayout(null);
//		l.setLocation(20, 20);
//		l.setSize(170, 50);
//		l.setText("클릭 좌표 : ");
//		
//		p.add(l);
//		p.addMouseListener(new MyMouse()); //매개변수로 내부클래스사용
//		
//		this.add(p);
//	}
//
//	public class MyMouse extends MouseAdapter{ //내부클래스로 리스너 구현
//		public void mouseClicked(MouseEvent e) {
//			Integer x = e.getX();
//			Integer y = e.getY();
//			String str = "X좌표 : "+ x +", Y좌표 : "+ y;
//			l.setText(str); // 문자열을 라벨에 셋텍스트
//		}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MouseAdapterTest a = new MouseAdapterTest();
//	}
//
//}
