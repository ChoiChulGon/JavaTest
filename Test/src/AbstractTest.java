
public class AbstractTest {
	public static void main(String args[]) {
		B test = new B();
		test.Print();
		test.Print1();
		
		System.out.println();
		
		A test1 = new B(); //형변환 , b객체 생성, 상위클래스의 메모리주소를 test1에 넘겨줌.
		test1.Print();
		test1.Print1();
		
		System.out.println();
		
		A test2 = new C();
		test2.Print();
		test2.Print1();

	}
}

abstract class A {
	public int m_nVar = 7;

	public void Print() {
		System.out.println("class A");
	}

	abstract void Print1();
}

class B extends A {
	void Print1() {
		System.out.println("B class");
	}
}

class C extends B {
	void Print1() {
		System.out.println("C class");
	}
}