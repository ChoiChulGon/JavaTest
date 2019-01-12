import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("input : ");
//		Scanner sc = new Scanner(System.in);
//		int inputNum = sc.nextInt();
//		
//		for(int i = 0 ; i < 10; i++){
//			System.out.println(inputNum*i);
//		}
		
		G gex = new G();
		gex.run();
		gex.stop();
		
		G Granger = new G();
		Granger.run();
		Granger.color = "black";
		System.out.println("-----------");
		G Granger1 = new G("red",1000);
		
		Bycycle B = new Bycycle();
		B.color = "y";
		B.price = 1000;
		B.info();
	}
}

class G{
	public String color;
	public String gear;
	public int price;
	
	public G() {
		System.out.println("Constructor");
		// TODO Auto-generated constructor stub
	}
	public G(String s, int p) {
		System.out.println("Constructor");
		// TODO Auto-generated constructor stub
		color = s;
		price = p;
	}
	public void run(){
		System.out.println("run");
	}
	
	public void stop(){
		System.out.println("stop");
	}
	
}
