
public class staticTest {
	public static void main(String args[]) {
		B.m_nVar = 5; //객체 생성 이전에 스태틱 메소드 사용 가능
		
		B test1 = new B();
		B test2 = new B();
		B test3 = new B();
		System.out.println(test1.m_nVar + " " + test2.m_nVar + " " + test3.m_nVar);
		
		test1.m_nVar = 3;
		System.out.println(test1.m_nVar + " " + test2.m_nVar + " " + test3.m_nVar);
		
		B.m_nVar=1;
		System.out.println(test1.m_nVar + " " + test2.m_nVar + " " + test3.m_nVar);
		
		C.Print();
	}
}

class B{
	public static int m_nVar;//기본값 0
}

class C{
	public static void Print() {
		System.out.println("java programming!");
	}
}
