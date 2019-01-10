
public class MultiInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D test = new D();
		test.PrintA();
		test.PrintB();
		test.PrintC();
		System.out.println();
		Ex test1 = new Ex();
		test1.PrintA();
		test1.PrintB();
		test1.PrintZ();
	}

}

interface A{
	void PrintA();
}

interface B{
	void PrintB();
}

interface C extends A,B{
	void PrintC();
}

class Z{
	public void PrintZ() {
		System.out.println("class Z");
	}
}

class D implements C{
	public void PrintA() {
		System.out.println("interface A");
	}
	public void PrintB() {
		System.out.println("interface B");
	}
	public void PrintC() {
		System.out.println("interface C");
	}
}

class Ex extends Z implements A,B{
	public void PrintA() {
		System.out.println("interface A");
	}
	public void PrintB() {
		System.out.println("interface B");
	}
}