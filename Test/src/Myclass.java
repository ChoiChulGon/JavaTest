
public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A test = new A();
		System.out.println(test.m_nVar);
		System.out.println(test.m_fVar);
	}

}

class A{
	
	public int m_nVar = 5;
	public float m_fVar = 3.14f;
	public A() {
		this(0.5f);
	}
	
	public A(float fVar) {
		m_fVar = fVar;
		
	}
	
}

