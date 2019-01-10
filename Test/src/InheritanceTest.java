import sample.*;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B test = new B();
		test.PrintA();
		test.m_nVar1 = 13;
		test.PrintC();
		System.out.println(test.m_nVar1);
		
		D test2 = new D(); //하위 클래스 안에서만 호출, protected
		test2.PrintD();

		//test2.m_nVar1 = 40; 외부 사용 불가
		//System.out.println(test2.m_nVar1);
		//test2.Print(); 외부 사용 불가
	}

}

class A {
	protected int m_nVar1 = 11;
	protected void PrintA() {
		System.out.println("A class "+m_nVar1);
	}

	public void PrintB() {
		PrintA();
	}
}

class B extends A {
	void PrintC() {
		System.out.println("B class " + m_nVar1);
	}
}

class D extends C{
	public void PrintD() {
		System.out.println("D class " +m_nVar1);
		Print();
	}
	
}
