import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Anonymous extends JFrame{
	
	public void Anonymous(){
		this.setTitle("제목");
		this.setSize(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		JButton bt = new JButton("Play");
		
		
		bt.addActionListener(new ActionListener(){ //익명클래스, 인터페이스 메소드에 바로 재정의
			public void actionPerformed(ActionEvent e) { //액션이벤트가 들어옴
				JButton bt = (JButton)e.getSource(); // 형변환
				if(bt.getText().equals("Play"))
					bt.setText("Stop");
				else
					bt.setText("Play");
			}
		});
		
		this.add(bt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a = new Anonymous();
	}

}
