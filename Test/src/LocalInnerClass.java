
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass OutTest1 = new OutClass();
		OutTest1.Print();
	}

}

class OutClass{
	int nVar1 = 3;
	class InnerClass{
		void Print() {
			System.out.println("inner class nVar1 : "+ nVar1);
		}
	}
	
	void Print() {
		InnerClass inner = new InnerClass();
		inner.Print();
	}
}