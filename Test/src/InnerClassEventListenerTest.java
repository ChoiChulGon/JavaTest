import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class InnerClassEventListenerTest extends JFrame{
	public InnerClassEventListenerTest() {
		this.setTitle("제목");
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton button = new JButton("Play");
		button.addActionListener(new MyActionListener()); //클래스를 매개변수로.
		add(button);
	}
	
	public class MyActionListener implements ActionListener{ //내부 클래스 구현, ActionListener 인터페이스 상속받음.
		public void actionPerformed(ActionEvent e) {//액션이벤트가 들어옴.
			JButton button = (JButton)e.getSource(); //형변환
			if(button.getText().equals("Play")) {
				button.setText("Stop");
			}else {
				button.setText("Play");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassEventListenerTest as = new InnerClassEventListenerTest();
		
	}

}
