//public class superTest2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		B test = new B();
//		test.Print();
//		System.out.println();
//		D test2 = new D();
//		test2.Print();
//	}
//
//}
//
//class A{
//	int m_nVar;
//	public A(int nVar) {
//		m_nVar = nVar;
//		System.out.println("constructor of the super class A");
//	}
//}
//
//class B extends A{
//	public B() {
//		super(7); //매개변수가 있으면 생략불가능
//	}
//	
//	public void Print() {
//		System.out.println("super class A : " + m_nVar);
//	}
//}
//
//class C{
//	int m_nVar;
//	public C() {
//		m_nVar = 11;
//		System.out.println("constructor of the super class C");
//	}
//}
//
//class D extends C{
//	public D() {
//		super(); // 안써도 자동적으로 호출
//	}
//	public void Print() {
//		System.out.println("super class C : "+ m_nVar);
//	}
//}