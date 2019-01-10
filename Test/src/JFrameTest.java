import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{
	
	JFrameTest(){ //2. 생성자 호출
		setTitle("swing 연습"); //3. JFrame 상속받아서 메소드 구현가능.
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //?
		
		this.setLayout(null); //기존 삭제
		JButton button = new JButton("test");
		button.setSize(70,20);
		button.setLocation(50,10);
		this.add(button);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
//		JFrame MainFrame = new JFrame();
//		MainFrame.setTitle("swing 연습");
//		MainFrame.setSize(1000,1000);
//		MainFrame.setVisible(true);
		JFrameTest MainFrame = new JFrameTest(); //1. 객체 생성
		
	}

}
